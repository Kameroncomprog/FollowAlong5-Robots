package part24;

import mbot.*;

// Guide: GUIDE.md in this folder, steps 4 and 6
//
// SECTION A — FOLLOW ALONG: type the FlashyBot class from the guide.
//    Leave the package, import and class lines alone. Type everything else.
//
// SECTION B — COMMENTS: put a // comment ABOVE every line of code, in YOUR OWN WORDS.

// Creates a class named FlashyBot that inherits from MBot2.
public class FlashyBot extends MBot2 {
    // Creates the constructor for FlashyBot.
    public FlashyBot() {
        // Calls the MBot2 constructor to set up the robot.
        super();
    }
    // Indicates that this method replaces the turnLeft method from MBot2.
    @Override
    // Creates a method that turns the robot left by the given degrees.
    public void turnLeft(double degrees) {
        // Prints a message showing the robot is turning left.
        System.out.println("Flash! Turning left " + degrees);
        // Turns on LED 1 with blue lighting.
        turnLedOn(1, 0, 0, 255);
        // Calls the original MBot2 method to physically turn left.
        super.turnLeft(degrees);
        // Turns off LED 1 after the turn is complete.
        turnLedOff(1);
    }
    // Indicates that this method replaces the turnRight method from MBot2.
    @Override
    // Creates a method that turns the robot right by the given degrees.
    public void turnRight(double degrees) {
        // Prints a message showing the robot is turning right.
        System.out.println("Flash! Turning right " + degrees);
        // Turns on LED 1 with green lighting.
        turnLedOn(1, 0, 255, 0);
        // Calls the original MBot2 method to physically turn right.
        super.turnRight(degrees);
        // Turns off LED 1 after the turn is complete.
        turnLedOff(1);
    }
    // Indicates that this method replaces the run method from MBot2.
    @Override
    // Defines the actions the robot performs when run.
    public void run() {
        // Repeats the instructions inside the loop four times.
        for (int i = 0; i < 4; i++) {
        // Moves the robot forward 40 units.
            straight(40);
            // Turns the robot left 90 degrees.
            turnLeft(90);
        }
    }
}
