import java.util.Scanner;

public class MenuPlay {

    Javagotchi javagotchi;

    public void PlayMenu(Javagotchi javagotchi) {
        // Niggarims
    }

    public void MakeUi() {
        int userInputInt;
        int DisplayedNumber; // Number displayed in the screen
        int HiddenNumber; // Secret result
        boolean WonGame;
        boolean isNumberSmaller;
        int wonGames = 0;

        for (int i = 0; i < 5; i++) {
            DisplayedNumber = (int) (Math.random() * 9 + 1);
            HiddenNumber = (int) (Math.random() * 9 + 1);

            while (DisplayedNumber == HiddenNumber || DisplayedNumber == 1 || DisplayedNumber == 9) {
                DisplayedNumber = (int) (Math.random() * 9 + 1);
            }

            Scanner userInputIntMenu = new Scanner(System.in);
            System.out.println("Is the number bigger or smaller than " + DisplayedNumber + "?\n0. Smaller\n1. Bigger");

            String OptionMenu = userInputIntMenu.nextLine();
            // userInputIntMenu.close();
            userInputInt = Integer.parseInt(OptionMenu);

            if (HiddenNumber < DisplayedNumber) {
                isNumberSmaller = true;
            } else {
                isNumberSmaller = false;
            }

            if (userInputInt != 0 && userInputInt != 1) {
                // TODO: Exit app.
            }

            if (userInputInt == 0) // Guessed number is <
            {
                System.out.println("You guessed smaller.");
            } else {
                System.out.println("You guessed bigger.");
            }

            if (isNumberSmaller == true && userInputInt == 0 || isNumberSmaller == false && userInputInt == 1) {
                WonGame = true;
                System.out.println("You win! The nº is " + HiddenNumber);
                wonGames++;
            } else {
                WonGame = false;
                System.out.println("You lost! The nº is " + HiddenNumber);
            }
            System.out.println((i + 1) + "/5");
        }
        if (wonGames > 2) {
            System.out.println("You won! The Javagotchi is happy! :)");
            // IncreaseHappiness(); // JTODO: HOW TO DO HELP
        }
    }
}
