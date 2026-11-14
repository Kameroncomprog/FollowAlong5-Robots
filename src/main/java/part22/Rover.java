package part22;

import mbot.*;

// Guide: GUIDE.md in this folder, steps 1–9
//
// Part 22 — behaviors: methods that use the sensors to decide what the robot does.
//
// SECTION A — FOLLOW ALONG: type the Rover class from the guide in this class.
//    Leave the "package part22;" line, the "import mbot.*;" line and the class line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.

public class Rover {
    // private String variable named name
    private String name;
    // private Chassis variable named base
    private Chassis base;
    // private Ultrasonic variable named eyes
    private Ultrasonic eyes;
    // private LineSensor variable named floor
    private LineSensor floor;
    // private boolean variable named lineWasLeft
    private boolean lineWasLeft;
    // public constructor named Rover that holds a String parameter named name
    public Rover(String name) {
        // this.name referes to private name in public class = that name
        this.name = name;
        // this.base refers to private chassis base = new chassis which is a new object
        this.base = new Chassis();
        // this.eyes = new Ultrasonic(base) which is a new object
        this.eyes = new Ultrasonic(base);
        // this.floor = new LineSensor(base) = new object
        this.floor = new LineSensor(base);
    }
    // public String constructor named toString that holds no parameter
    public String toString() {
        // systme returns value stored in this.name + str concadenation " the rover."
        return name + " the rover";
    } // end of toString constructor
    // public int constructor named driveUntilBlocked that holds a double parameter named cm
    public int driveUntilBlocked(double cm) {
        // we stored the number 0 value into int variable named moves
        int moves = 0;
        // while loops that calls variable eyes.distance that states when eyes.distance is greater cm base.straight is 5 cm moves goes up by 1 everytime the loops is ran
        while (eyes.distance() > cm) {
            base.straight(5);
            //increametes by 1
            moves++;
        }
        //system return the moves at the end of each loop
        return moves;
    }
    // public void constructor named goAroundLeft that holds a double parameter named sideways
    public void goAroundLeft(double sideways) {
        // tells robot to turn left 90 degrees
        base.turnLeft(90);
        // tells robot to go straight and calls parameter sideways
        base.straight(sideways);
        // tells robot to turn right at a 90 degree angle
        base.turnRight(90);
    } // end of constructor
    // public void constructor named reachGoal with no parameters
    public void reachGoal() {
        // driveUntilBlocked method is assigned int variable named first
        int first = driveUntilBlocked(15);
        //  system outputs "Blocked after + str concadenation value of first +  concadenation + moves . Going round
        System.out.println("Blocked after " + first + " moves. Going round.");
        // calls method goAroundLeft with a parameter value of int 60
        goAroundLeft(60);
        // driveUntilBlocked parameter of cm 15 is assigned to int variable named second
        int second = driveUntilBlocked(15);
        // system outputs "blocked after + str concadenation + second + str concadentation " moves. That is the far wall".
        System.out.println("Blocked after " + second + " moves. That is the far wall.");
        // mbot2 turns right 90 degrees
        base.turnRight(90);
        // mbot2 moves straight at 50 cm
        base.straight(50);
    } //constructor ends here
    // public void constructor named followLine that holds int paramter named steps
    public void followLine(int steps) {
        // for loop that assigns i = 0 if i is less than steps  the loop runs while incremating by 1 after each loop
        for (int i = 0; i < steps; i++) {
            // we assign floor.status to int variable s
            int s = floor.status();
            // This is a Boolean expression that checks whether s is equal to 4, 8, or 12.
            if (s == 4 || s == 8 || s == 12) {
                //mbot2 turns left at 4 degrees
                base.turnLeft(4);
                // lineWasLeft = true
                lineWasLeft = true;
                // Checks if the sensor value is 1, 2, or 3.
            } else if (s == 1 || s == 2 || s == 3) {
                //  Turns the robot to the right by 4 degrees.
                base.turnRight(4);
                // Records that the line was not detected on the left side.
                lineWasLeft = false;
                // Checks if the sensor value is 0.
            } else if (s == 0) {
                // Checks if the line was previously detected on the left.
                if (lineWasLeft) {
                    // Turns the robot left by 4 degrees.
                    base.turnLeft(4);
                    //runs if nothing above is true
                } else {
                    // Turns the robot right by 4 degrees.
                    base.turnRight(4);
                }
                // runs if nothing abover is true
            } else {
                // Moves the robot straight forward by 1 unit.
                base.straight(1);
            }
        }
    }
}

