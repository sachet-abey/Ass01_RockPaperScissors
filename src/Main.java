import java.util.Scanner; // Import Scanner from Java
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Create a scanner to read user input
        boolean playing = true; // Initialize playing variable for the while loop which is true when the user is still playing
        while(playing) { // While the user is playing (playing is true)
            String playerA = "", playerB = ""; // Initialize variables playerA and playerB as empty strings. These represent the moves of players A and B
            boolean done = false; // Initialize done variable for the do-while loop. This is set to true when the user enters a valid input
            do {
                System.out.println("Enter player A's move: "); // Prompts user to enter player A's move
                playerA = scan.nextLine(); // Reads user input as string
                if(playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S")) { // If user entered a valid input (R, P, S, ignoring case)
                    done = true; // Set done to true because valid input - no more looping needed
                }
                else { // Otherwise
                    System.out.println("You entered "+playerA+". Please enter a valid input!"); // Tells user what they entered and asks them to enter a valid input
                }
            }
            while (!done); // Keeps looping when done is false (done becomes true when user enters a valid input)
            done = false; // Set done to false for the next do-while loop
            do {
                System.out.println("Enter player B's move: "); // Prompts user to enter player B's move
                playerB = scan.nextLine(); // Reads user input as string
                if(playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S")) { // If user entered a valid input (R, P, S, ignoring case)
                    done = true; // Set done to true because valid input - no more looping needed
                }
                else { // Otherwise
                    System.out.println("You entered "+playerB+". Please enter a valid input!"); // Tells user what they entered and asks them to enter a valid input
                }
            }
            while (!done); // Keeps looping when done is false (done becomes true when user enters a valid input)
            done = false; // Set done to false for the next do-while loop
            if(playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("P")) { // If player A enters rock and player B enters paper
                System.out.println("Paper covers rock. Player B wins!"); // Prints results - player B wins
            }
            else if(playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("S")) { // If player A enters rock and player B enters scissors
                System.out.println("Rock breaks scissors. Player A wins!"); // Prints results - player A wins
            }
            else if(playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("R")) { // If player A enters paper and player B enters rock
                System.out.println("Paper covers rock. Player A wins!"); // Prints results - player A wins
            }
            else if(playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("S")) { // If player A enters paper and player B enters scissors
                System.out.println("Scissors cuts paper. Player B wins!"); // Prints results - player B wins
            }
            else if(playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("P")) { // If player A enters scissors and player B enters paper
                System.out.println("Scissors cuts paper. Player A wins!"); // Prints results - player A wins
            }
            else if(playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("R")) { // If player A enters scissors and player B enters rock
                System.out.println("Rock breaks scissors. Player B wins!"); // Prints results - player B wins
            }
            else { // If not (the moves must be equal - the players must have tied)
                System.out.println("Players A and B tied!"); // Prints results - players A and B tie
            }
            do {
                System.out.println("Would you like to play again? [Y/N]"); // Prompts user if they would like to play again
                String response = scan.nextLine(); // Read user input as string
                if(response.equalsIgnoreCase("Y")) { // If user enters Y (yes), ignoring case
                    done = true; // Set done to true to continue the outer while loop - user continues playing because they entered yes
                }
                else if(response.equalsIgnoreCase("N")) { // If user enters N (no), ignoring case
                    playing = false; // Terminate outer while loop by setting playing to false
                    done = true; // Set done to true - no more looping needed
                }
                else {
                    System.out.println("You entered "+response+". Please enter a valid input!"); // Tells user what they entered and asks user to enter a valid input
                }
            }
            while (!done); // Keeps looping when done is false (done becomes true when user enters a valid input)
        }
    }
}
