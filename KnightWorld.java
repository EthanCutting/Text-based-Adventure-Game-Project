package FinalProjectEthancutting;

import java.util.Scanner;

public class KnightWorld
{
    static String [] items = new String[10];
    static char response;
    static int index = 0;
    //This is the main
    public static void main(String[] args)
    {
        String location = "Stormwind City";     
        String Inventory;
        Scanner sc1 = new Scanner(System.in); //This is adding for new Scanners
        boolean isGameActive = true;
        String playerLoc = "Stormwind City";
        //shop s = new shop();
        while (isGameActive)
        {
            displayGameMenu();
            int input = sc1.nextInt();
            selectGameOption(input);
     
            //s.inv();
            isGameActive = ExitGame(input);
            boolean isbarnActive = SelectbarnOption(input);
            SelectbarnOption(input);

        }
        System.out.println("!Bye Bye Honour Knight!");
    }

    // This public class is for the game menu
    public static void displayGameMenu()
    {
        System.out.println("Welcome To Knight World");
        System.out.println("_______________________");
        System.out.println("       MAIN MENU       ");
        System.out.println("_______________________");
        System.out.println("(1) Start a new game");
        System.out.println("(2) Display game Rules");
        System.out.println("(3) Exit game");
        System.out.print("Choose an option: ");
    }

    //This will be where the game starts
    public static void startNewGame()
    {
        String playerloc = "Stormwind City";
        String barn = "Inventory";
        char userInput;
        System.out.println("game started");
        Scanner sc = new Scanner(System.in);
        System.out.println("\n ---------");
        System.out.println("| Alliance |");
        System.out.println("|  *  * *  |");
        System.out.println("|  * 69 *  |");
        System.out.println("|  * *  *  |");
        System.out.println("|  Knight  |");
        System.out.println(" ---------\n");
        System.out.println("Welcome to Stormwind City we are Aliance Knights");
        System.out.println("We have been at war with the horde for over 2000 Years");
        System.out.println("The Aliance Knights have try different ways to stop this war but the horde dont see eye to eye");
        System.out.println("One day are King Daniel Hernandez went to talk to the legend horde king chief keef but King Daniel Hernandez never came back, Word came back to the Aliance Kinghts");
        System.out.println("King Chief Keef has King Daniel Hernandez Hostage");
        System.out.println("!!WE NEED ARE MOST HONOUR KNIGHT AND THATS YOU TO SAVE KING DANIEL HERNANDEZ!!");

        if (playerloc == "Stormwind City")
        {
            System.out.println("\nLocation: " + playerloc);
            System.out.println("You are standing outside Stormwind City.");
            System.out.println("To the East is Notorious BIG Forest.(w)");
            System.out.println("To the North is Drake Road.(d)");
            System.out.println("Which way would you like to start your great journey in the Game.");
            userInput = sc.next().charAt(0);
            //Hit W it will take you to the forest
            if (userInput == 'w')
            {
                playerloc = "Forest";
            } else if (userInput == 'd')
            {
                playerloc = " Drake Road";
            } else
            {
                System.out.println("Idiot, That will take you back to Stormwind City");
            }
        }
        //This is for the user input for forest
        if (playerloc == "Forest")
        {
            System.out.println("\nLocation: " + playerloc);
            System.out.println("You are standing inside a Forest");
            System.out.println("You see in the far a barn a blacksmith lives in there");
            System.out.println("Would you like to go to the barn? y/n");
            userInput = sc.next().charAt(0);
            
             //shop s = new shop();

            if (userInput == 'y')
            {
                //playerloc = "Shop";
              inv();
            } else if (userInput == 'n') 
            {
                System.out.println("You move deeper into the forest till you find your way out");
            }
        }
        //This is if hit d to go down drake road
        else if (playerloc == "Drake Road")
        {
            System.out.println("\nLocation: " + playerloc);
            System.out.println("You are now walking down Drake Road");
            System.out.println("Watch out Trippe Red ambush It's Chief Keef hitman ");
            System.out.println("you can Run or stay and fight with your hands");
            System.out.println("Or run back to Stormwind City to get your gear");
            userInput = sc.next().charAt(0);

            if (userInput == 'y')
            {
                playerloc = "Fight Trippe Red";
            } else if (userInput == 'n') ;
            {
                System.out.println("You got shocked and ran back to Stormwind City To gear up");
            }
        }
    }

    public static void inv() 
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Hello my Friend What You need?");
      System.out.println("We got all different Swords, Knifes, Sweids,Bows,whips");
      System.out.println("------------------------------------------------------------------------------------");
      System.out.println("(1)Finger Knife(Africe)");
      response = sc.next().toLowerCase().charAt(0);
      if(response == '1')
      {
        items[index] = "Finger Knife";
        index++;
      }
      System.out.println("(2)Battle Axe(European)");
      response = sc.next().toLowerCase().charAt(0);
      if(response == '2')
      {
        items[index] = "Battle Axe(European)";
        index++;
      }
      System.out.println("(3)MatchLock(bow)");
      
      System.out.println("(4)Blunderbuss(Bow,European)");
      
      System.out.println("(5)Hook Sword");
      
      System.out.println("(6)Shotel Sword");
      
      System.out.println("(7)Karabela(One Hand Swords)");
      
      System.out.println("(8)Dao");
      
      System.out.println("(9)Bullwhip");
      System.out.println("(10)Sjambok"); 
      System.out.print("Choose an option: ");
      
      
    }
    public static boolean SelectbarnOption(int optionSelected)
    {
        if (optionSelected == 11)
        {
            return true;
        }
        return false;
    }

    //This is a public class for the game will display the game rules!!!
    public static void displayGameInstruction()
    {
        System.out.println("To Win the game,you must go to the end of the game...");
        System.out.println("Use W,A,S and D buttons for movement");
        System.out.println("Use E to interact with npc and enemles");
        System.out.println("The player has 3 health points and when the player loses them its game over");
        System.out.println("The battle system is basically rock-paper-scissors");
        System.out.println("Rock is 1,paper is 2 and scissors being 3");
        System.out.println("Whoever lose the round will lose 1 health point ");
        System.out.println("if the player wins the battle there regain all their health points");
    }

    //This is for exiting the game
    public static boolean ExitGame(int optionSelected)
    {
        if (optionSelected == 3)
        {
            return false;
        }
        return true;
    }

    //This is the Game Option
    public static void selectGameOption(int optionSelected)
    {
        switch (optionSelected)
        {
            case 1:
                startNewGame();
                break;
            case 2:
                displayGameInstruction();
                break;
            default:
                break;
        }
    }

}
