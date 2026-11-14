package part23;

import mbot.*;

// Guide: GUIDE.md in this folder, steps 3, 5 and 6
//
// SECTION A — FOLLOW ALONG: type the main method from the guide in this class.
//    It makes a Scout and sends it through the junctions to the goal.
//    Leave the package, import, @MBotLab and class lines alone. Type everything else.
//
// SECTION B — COMMENTS: put a // comment ABOVE every line of code, in YOUR OWN WORDS.
// Sets the world that the robot will run in.
@MBotLab(world = "junctions")
// Creates the Explore class.
public class Explore {
    // psvm start of program
    public static void main(String[] args) {
        // Creates a Scout object and gives it the name "Pathfinder".
        Scout scout = new Scout("Pathfinder");
        // Repeats the loop three times, starting with leg 1.
        for (int leg = 1; leg <= 3; leg++) {
            // Tells the scout to drive until it is blocked and stores the number of moves.
            int moves = scout.driveUntilBlocked();
            // Prints the current leg number and how many moves the scout made.
            System.out.println("Leg " + leg + ": " + moves + " moves");
            // Checks if the scout has not reached the third leg yet.
            if (leg < 3) {
                // Turns the scout toward the open side.
                scout.turnTowardOpenSide();
            }
        }
        // Prints the scout's name and confirms that it reached the goal.
        System.out.println(scout + " reached the goal");
    }
}
