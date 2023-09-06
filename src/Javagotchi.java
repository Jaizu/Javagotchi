// Corre el programa principal

import java.util.Random;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Javagotchi {

    static MenuPlay mPlay; // JTODO: Idk what I'm doing

    public static void main(String[] args) throws Exception {
        boolean mainLoop = true;
        int currentMenu = 0;
        int userInputInt;
        mPlay = new MenuPlay();

        // Opening the game
        System.out.println("Welcome to Javagotchi! :D");
        Scanner userInputString = new Scanner(System.in);
        System.out.println("Choose an option:\n1. Create a Tamagotchi.\n2. Close the game.");
        String Option = userInputString.nextLine();
        userInputInt = Integer.parseInt(Option);
        currentMenu = userInputInt;

        int RandomId = (int) (Math.random() * 4 + 1);

        Tamagotchi FirstTamagotchi = new Tamagotchi(RandomId);

        FirstTamagotchi.id = RandomId;

        while (mainLoop) {
            switch (currentMenu) {
                default:
                    break;
                case 1:
                    System.out.println("Your Tamagotchi id is " + FirstTamagotchi.id);

                    // Menu navigation
                    Scanner userInputIntMenu = new Scanner(System.in);
                    System.out.println("Which menu do you want to select?\n0.Feed\n1.Lights\n2.Play\n3.Medicine");

                    String OptionMenu = userInputIntMenu.nextLine();
                    // userInputIntMenu.close();
                    userInputInt = Integer.parseInt(OptionMenu);
                    switch (userInputInt) {
                        case 0:
                            System.out.println("Feed");
                            break;
                        case 1:
                            System.out.println("Lights");
                            break;
                        case 2:
                            mPlay.MakeUi(this);
                            break;
                        case 3:
                            System.out.println("Medicine");
                            break;
                        case 4:
                            System.out.println("Cleaning");
                            break;
                        case 5:
                            System.out.println("Status");
                            break;
                        case 6:
                            System.out.println("Discipline");
                            break;
                        case 7:
                            System.out.println("Attention");
                            break;

                    }

            }
            mainLoop = false;
        }

    }

}
