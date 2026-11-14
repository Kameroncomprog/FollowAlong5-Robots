package part23;

import mbot.*;

// Guide: GUIDE.md in this folder, steps 1–5
//
// Part 23 — inheritance: your own robot class, built on top of MBot2.
//
// SECTION A — FOLLOW ALONG: type the Scout class from the guide.
//    Step 1 changes the class line below: that is the one line you DO change.
//    Leave the "package part23;" line and the "import mbot.*;" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.

// Creates the Scout class that inherits features from MBot2.
public class Scout extends MBot2 {
    // Stores the name of the scout.
        private String name;
    // Stores the Scanner object used to measure distances.
        private Scanner scanner;
    // Constructor that receives the scout's name.
        public Scout(String name) {
            // Calls the constructor of the parent class MBot2.
            super();
            // Saves the name that was passed into the constructor.
            this.name = name;
            // Creates a Scanner object and connects it to this robot.
            this.scanner = new Scanner(this);
        }
    // Converts the Scout object into a readable String.
        public String toString () {
            // Returns the scout's name followed by "the scout".
            return name + " the scout";
        }
    // Makes the robot drive forward until an obstacle is detected.
        public int driveUntilBlocked () {
            // Starts the movement counter at zero.
            int moves = 0;
            // Repeats while the ultrasonic sensor reads more than 25.
            while (readUltrasonic() > 25) {
                // Moves the robot forward 5 centimeters.
                straight(5);
                // Adds one to the movement counter.
                moves++;
            }
            // Returns the total number of movements.
            return moves;
        }
    // Finds the direction with the greatest open distance.
        public int openestIndex() {
            // Scans the surroundings and stores the distances in an array.
            double[] d = scanner.scan();
            // Assumes the first direction has the greatest distance.
            int best = 0;
            // Checks the remaining directions in the array.
            for (int i = 1; i < d.length; i++) {
                // Checks if the current distance is greater than the best distance.
                if (d[i] > d[best]) {
                    // Updates best to the index of the greatest distance.
                best = i;
            }
        }
            // Returns the index of the direction with the greatest distance.
        return best;
    }   // Turns the robot toward the direction with the most open space.
        public void turnTowardOpenSide() {
            // Gets the index of the direction with the most open space.
            int i = openestIndex();
            // Checks if the angle at that index is greater than zero.
            if (Scanner.ANGLES[i] > 0) {
                // Turns the robot left 90 degrees.
            turnLeft(90);
                // Runs if the angle is not greater than zero.
        } else {
                // Turns the robot right 90 degrees.
            turnRight(90);
        }
    }
}
