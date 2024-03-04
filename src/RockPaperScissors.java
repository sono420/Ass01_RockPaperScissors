import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            // Get move choice from playerA
            System.out.print("Player A, enter your move (R/P/S): ");
            String playerAMove = getValidMove(scanner);

            // Get move choice from playerB
            System.out.print("Player B, enter your move (R/P/S): ");
            String playerBMove = getValidMove(scanner);

            // Display the results
            displayResults(playerAMove, playerBMove);

            // Prompt the user to play again
            System.out.print("Do you want to play again? (Y/N): ");
        } while (scanner.next().equalsIgnoreCase("Y"));

        System.out.println("Game Over");
    }

    private static String getValidMove(Scanner scanner) {
        String move;
        do {
            move = scanner.next().toUpperCase();
            if (!move.matches("[RPS]")) {
                System.out.println("Invalid move. Please enter R, P, or S.");
            }
        } while (!move.matches("[RPS]"));
        return move;
    }

    private static void displayResults(String playerAMove, String playerBMove) {
        System.out.println("Player A chose: " + playerAMove);
        System.out.println("Player B chose: " + playerBMove);

        if (playerAMove.equals(playerBMove)) {
            System.out.println("It's a Tie!");
        } else if ((playerAMove.equals("R") && playerBMove.equals("S")) ||
                (playerAMove.equals("P") && playerBMove.equals("R")) ||
                (playerAMove.equals("S") && playerBMove.equals("P"))) {
            System.out.println("Player A wins!");
        } else {
            System.out.println("Player B wins!");
        }
    }
}
