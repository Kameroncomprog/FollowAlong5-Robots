package part22;

import mbot.*;

// Guide: GUIDE.md in this folder, steps 3–6
//
// SECTION A — FOLLOW ALONG: type the main method from the guide in this class.
//    It makes a Rover and sends it round the box to the goal.
//    Leave the package, import, @MBotLab and class lines alone. Type everything else.
//
// SECTION B — COMMENTS: put a // comment ABOVE every line of code, in YOUR OWN WORDS.

@MBotLab(world = "obstacles")
public class ObstacleRun {
    // psvm start of the program
    public static void main(String[] args) {
        // we assign the value stored in new Rover in to Rover variable named rover
        Rover rover = new Rover ("Dash");
        //int moves = rover.driveUntilBlocked(15);
        //System.out.println("Blocked after " + moves + " moves");
        // we call method rover.reachGoal()
        rover.reachGoal();
        // systme outputs the value stored in rover + str concadenation "reached the goal."
        System.out.println(rover + " reached the goal");
    }
}
