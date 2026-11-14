package part24;

import mbot.*;

// Guide: GUIDE.md in this folder, steps 4–7 (overriding, and polymorphism)
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
// Stretch B also changes CarefulBot.java, FlashyBot.java and Mission.java.
//
// There is no main method here yet. Typing it is part of the stretch.

@MBotLab(world = "open-room")
public class Stretch {
    public static void main(String[] args) {
        MBot2 a = new FlashyBot();
        Chassis c = a;
        a.straight(10);
        // flash turning left at 90 degrees
        c.turnLeft(90);
        // system outputs true
        System.out.println(a == c);
        System.out.println(a);
    }
    //B1.
    // check carefulBot.java

    //B2.
    // check FlashyBot.java

    //B3.
    // check Mission.java

    //B4.
    // When pick is 3, a regular MBot2 object is created.
// It does not use CarefulBot's or FlashyBot's overridden methods.
// It uses the original MBot2 behavior because neither subclass is selected.
}
