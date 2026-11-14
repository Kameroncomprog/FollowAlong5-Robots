package part24;

import mbot.*;

// Guide: GUIDE.md in this folder, steps 2, 5 and 7
//
// SECTION A — FOLLOW ALONG: type the mission method and the main method from the guide.
//    Leave the package, import, @MBotLab and class lines alone. Type everything else.
//
// SECTION B — COMMENTS: put a // comment ABOVE every line of code, in YOUR OWN WORDS.

// // Sets the robot simulation world to the wall-ahead environment.
@MBotLab(world = "wall-ahead")
// Creates a class named Mission.
public class Mission {
    // Creates a method that accepts an MBot2 robot as a parameter.
    public static void mission(MBot2 bot) {
        // Prints a message saying the mission is starting.
        System.out.println("Mission start");
        // Calls the run() method of whichever robot object was passed in.
        bot.run();
        // Prints a message saying the mission is finished.
        System.out.println("Mission done");
    }
    // The main method where the program starts running.
    public static void main(String[] args) {
        // Creates an integer variable named pick and gives it the value 1.
        int pick = 1;
        // Declares a variable named bot that can refer to an MBot2 object or one of its subclasses.
        MBot2 bot;
        // Checks whether pick is equal to 1.
        if (pick == 1) {
            // Creates a CarefulBot object and stores its reference in bot.
            bot = new CarefulBot();
            // If the first condition is false, checks whether pick is equal to 2.
        } else if (pick == 2) {
            // Creates a FlashyBot object and stores its reference in bot.
            bot = new FlashyBot();
            // Runs if neither condition above is true.
        } else {
            // Creates a regular MBot2 object and stores its reference in bot.
            bot = new MBot2();
        }
        // Passes the selected robot into the mission() method.
        mission(bot);
    }
}
