import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String[] listOfOptions = {"rock", "paper", "scissors"};
            /*Getting random index, we going to 0 1 2 at random because we have 3 items in the list*/
            String computerMove = listOfOptions[new Random().nextInt(listOfOptions.length)];


            String playerOption;


            while (true) {
                System.out.println("Enter your option (rock, paper or scissors): ");
                playerOption = scanner.nextLine();
                if (playerOption.equals("rock") || playerOption.equals("paper") || playerOption.equals("scissors")) {
                    break;
                }
                System.out.println(playerOption + "is not a valid move.");
            }
            System.out.println("Computer played: " + computerMove);

            if (playerOption.equals(computerMove)) {
                System.out.println("the game was a tie!");
            } else if (playerOption.equals("rock")) {
                if (computerMove.equals("paper")) {
                    System.out.println("You lose! ");
                } else if (computerMove.equals("scissors")) {
                    System.out.println("You Win! ");
                }
            } else if (playerOption.equals("paper")) {
                if (computerMove.equals("rock")) {
                    System.out.println("You Win! ");

                } else if (computerMove.equals("scissors")) {
                    System.out.println("You lose!");
                }
            } else if (playerOption.equals("scissors")) {
                if (computerMove.equals("paper")) {
                    System.out.println("You Win! ");

                } else if (computerMove.equals("rock")) {
                    System.out.println("You lose!");
                }
            }
            System.out.println("Play again? (y/n)");
            String playAgain = scanner.nextLine();

            if(!playAgain.equals("y")){
                break;
            }


        }

    }

}