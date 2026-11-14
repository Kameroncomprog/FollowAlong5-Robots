package part21;

import mbot.*;

// Guide: GUIDE.md in this folder, steps 4–9
//
// SECTION A — FOLLOW ALONG: type the main method from the guide in this class.
//    It makes a Rover and drives it until it is close to the wall.
//    Leave the package, import, @MBotLab and class lines alone. Type everything else.
//
// SECTION B — COMMENTS: put a // comment ABOVE every line of code, in YOUR OWN WORDS.
// takes u to a differnt page where is Mbot world and shows the mblock and where can move etc
@MBotLab(world = "wall-ahead")
// public class called FollowAlong
public class FollowAlong {
    // public static void main String arguments start of program
    public static void main(String[] args) {
        // Rover variable called scout gets assigned to new Rover ("scout"
        Rover scout = new Rover("Scout");
        // system outputs the value stored in scout + str concadenation "is ready"
        System.out.println(scout + "is ready");
        // calls varibale scout and function driveuntilBlocked();
        scout.driveUntilBlocked();
        // system outputs varibale stored in scout + str concadenation 'stopped. Something is less than 20 cm ahead.
        System.out.println(scout + "stopped. Something is less than 20 cm ahead.");
    }
}
