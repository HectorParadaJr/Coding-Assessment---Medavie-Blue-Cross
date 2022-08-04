import java.io.Console;

import javax.lang.model.util.ElementScanner6;

/**
 * ceilingFan
 */
public class ceilingFanAssessment {
    static Console console = System.console();

    /// Creates main menu for application
    public static int MainMenu() {
        String[] menu = { "Run Ceiling Application", "Exit Application" };
        String answer;
        int index;
        int userAnswer = 0;
        boolean menuLoop = false;

        // Menu will loop until user exits application
        do {
            // validation if user enters an incorrect value
            try {
                for (int i = 0; i < menu.length; i++) {
                    index = i + 1;
                    System.out.println(index + " - " + menu[i]);
                }

                // read user answer
                answer = console.readLine();
                userAnswer = Integer.parseInt(answer);

                // Determines if user selected a menu option
                if (userAnswer > 3) {
                    System.out.println("Not an option please try again");
                    console.readLine();
                }
            } catch (Exception e) {
                System.out.println("Invalid Response Please try again");
                console.readLine();
            }
            System.out.flush();
            return userAnswer;

        } while (!menuLoop);
    }

    /// Main ceiling application

    public static void CeilingApplication() {
        /*
         * #TODO: Finish up the Ceiling application method
         * - [] display ceiling fan speed
         * - [] display fan rotation
         * - [] Create CeilingApplication Menu
         * - [] Pull speed cord
         * - [] increase speed
         * - [] pull reverse cord
         * - [] reverse fan
         * - [] exit ceiling application
         * - [] loop application until otherwise
         * - []return to Main menu
         */

        int fanSpeed = 0;
        boolean reverseFan = false;
        String fanRotation = "Clockwise";

        String[] ceilingFanMenu = { "Pull Speed Cord", "Pull Reverse Cord", "Exit Application" };
        int index;
        String answer;
        int userAnswer = 0;
        boolean menuLoop = false;

        // Menu will loop until user selection option to exit
        do {
            if (fanSpeed == 0) {
                System.out
                        .println("Fan is not spinning. the rotation of fan will be " + fanRotation + " once started.");
            } else {
                System.out.println("Fan speed is at " + fanSpeed + " and fan rotation is " + fanRotation);
            }
            try {
                for (int i = 0; i < ceilingFanMenu.length; i++) {
                    index = i + 1;
                    System.out.println(index + " - " + ceilingFanMenu[i]);
                }

                // read user answer
                answer = console.readLine();
                userAnswer = Integer.parseInt(answer);

                // Check if user selected 1(pull speed cord) or 2(ReverseFan)
                // if not end fan application and return to main menu
                switch (userAnswer) {
                    case 1:
                        fanSpeed++;
                        if (fanSpeed >= 3) {
                            fanSpeed = 0;
                        }
                        break;
                    case 2:
                        if (reverseFan == true) {
                            reverseFan = false;
                            fanRotation = "1Clockwise";
                        } else {
                            reverseFan = true;
                            fanRotation = "Counter-Clockwise";
                        }
                        break;
                    case 3:
                        MainMenu();
                        break;
                }

                // Menu validation
                if (userAnswer > 3) {
                    System.out.println("Not an option please try again");
                    console.readLine();
                }
            }
            // If user types incorect values
            catch (Exception e) {
                System.out.println("Invalid Response Please try again");
                console.readLine();
            }
        } while (!menuLoop);

    }

    public static void main(String[] args) {
        boolean menu = false;
        int answer = 0;

        // once the option is selected will loop unit otherwise
        do {
            answer = MainMenu();

            switch (answer) {
                case 1:
                    // Run ceiling application
                    CeilingApplication();
                    break;
                case 2:
                    menu = true;
                    break;
            }
        } while (!menu);
    }
}