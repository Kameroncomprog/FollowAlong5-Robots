package part24;

import mbot.*;

// Guide: GUIDE.md in this folder, steps 1–3 and 6
//
// Part 24 — overriding: your robot keeps a method's name, but changes what it does.
//
// SECTION A — FOLLOW ALONG: type the CarefulBot class from the guide.
//    Leave the "package part24;" line, the "import mbot.*;" line and the class line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.

// Creates a class named CarefulBot that inherits from MBot2.
public class CarefulBot extends MBot2 {
    // Creates the constructor for CarefulBot.
    public CarefulBot() {
        // Calls the MBot2 constructor to set up the robot.
        super();
    }
    // Indicates that this method replaces the straight() method from MBot2.
    @Override
    // Creates a method that controls how far the robot moves forward.
    public void straight(double cm) {
        // Checks if the detected distance is greater than the requested distance plus 20 cm.
        if (readUltrasonic() > cm + 20) {
            // If there is enough space, calls the original MBot2 method to move forward.
            super.straight(cm);
            // Runs if there is not enough space in front of the robot.
        } else {
            // Turns LED 1 red to warn that the robot is not moving.
            turnLedOn(1, 255, 0, 0);
            // Prints a warning explaining why the robot will not move.
            System.out.println("CarefulBot: not driving " + cm + " cm, too close");
        }
    }
    // Indicates that this method replaces the run() method from MBot2.
    @Override
    // Defines what the CarefulBot does when its run() method is called.
    public void run() {
        // Repeats the instructions inside the loop five times.
        for (int i = 0; i < 5; i++) {
            // Attempts to move forward 40 cm using the safety check above.
            straight(40);
        }
    }
}