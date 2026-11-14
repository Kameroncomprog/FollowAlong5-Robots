package part21;

import mbot.*;

// Guide: GUIDE.md in this folder, steps 2–8
//
// Part 21 — composition: a Rover HAS-A Chassis and HAS-AN Ultrasonic.
//
// SECTION A — FOLLOW ALONG: type the Rover class from the guide in this class.
//    Leave the "package part21;" line, the "import mbot.*;" line and the class line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.
//
// SECTION C — STRETCH B adds a LineSensor and two methods to this class.

public class Rover {
    private LineSensor floor;
    // private class String that holds a variable called name
    private String name;
    // private class called chassis that declares a variable called base
    private Chassis base;
    // private class called Ultrasonic that declares a variable called eyes
    private Ultrasonic eyes;

    // public constructor called Rover that has a String parameter called name
    public Rover(String name) {
        // the value stored in name is now stored in this.name
        this.name = name;
        // the value sored in new chassis is now stored in this.base
        this.base = new Chassis();
        this.floor = new LineSensor(base);
        // the value in new Ultrasonic(base) is now stored in this.eyes
        this.eyes = new Ultrasonic(base);
    }

    // public Constructor String called toString with no parameters
    public String toString() {
        // return the value of name + str concadeneation while alsp printing the rover.
        return name + " the rover ";
    }

    // public boolean constructor named somethingAhead that holds a double parameter called cm
    public boolean somethingAhead(double cm) {
        // system returns eye.distance with no parameter whil stating its less than paramter cm
        return eyes.distance() < cm;
    }

    // public void constructor named driveUntilBlocked that holds no parameter
    public void driveUntilBlocked() {
        // while loop calls function somethingAhead but ! = not so the car keeps moving and we input a value of 20 cm
        while (!somethingAhead(20)) {
            // we call base from constructor Rover  and the . staright tells the rover to keep moving straight 5 cms
            base.straight(5);
        }
    }

    void driveToTape() {
        while (!floor.seesTape()) {
            forward(2);
        }
    }


    void forward(double cm) {
        base.forward(cm);
    }
}