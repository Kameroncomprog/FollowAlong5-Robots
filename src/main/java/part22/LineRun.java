package part22;

import com.sun.security.jgss.GSSUtil;
import mbot.*;

// Guide: GUIDE.md in this folder, steps 7–9
//
// SECTION A — FOLLOW ALONG: type the main method from the guide in this class.
//    It makes a Rover and follows the loop of tape all the way round.
//    Leave the package, import, @MBotLab and class lines alone. Type everything else.
//
// SECTION B — COMMENTS: put a // comment ABOVE every line of code, in YOUR OWN WORDS.

@MBotLab(world = "line-track")
public class LineRun {
    // psvm is start of program
    public static void main(String[] args) {
        // we assign new Rover and its parameter which is name to Rover variable named rover
        Rover rover = new Rover ("Tracker");
        // variable rover.followLine tells robot to followLine 400 steps
        rover.followLine(400);
        // system outputs "Halfway round"
        System.out.println("Halfway round");
        // tells mbot2 to follow line 325 steps
        rover.followLine(325);
        // system outputs value stored in rover + str concadenation "finished a lap".
        System.out.println(rover + "finished a lap");
    }
}
