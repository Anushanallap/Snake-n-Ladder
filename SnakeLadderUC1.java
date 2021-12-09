
public class SnakeLadderUC1 {


public static void main(String[] args) {

                int NumOfDiceRoll = 0;
                int playerPosition = 1;
                int diceRoll = 0;
                int SnakeArray[] = { 30, 50 };
                int LadderArray[] = { 5, 9 };

                System.out.println("Welcome to the Game of SNAKE & LADDER");
                System.out.println("Starting Position of the Player = 0");

                for (playerPosition = 1; playerPosition <= 100; playerPosition++) {
                        double randomnumber = (double) (Math.random() * 6);
                        diceRoll = (int) randomnumber;
                        System.out.println("Dice Number =" + " " + diceRoll);
                        playerPosition = playerPosition + diceRoll;
                        playerPosition = playerPosition - 1;

                        System.out.println("Current Position =" + " " + playerPosition);
                        NumOfDiceRoll++;

                        if (playerPosition == 100) {
                                System.out.println("CONGRATULATION!! YOU WON THE GAME.");
                        }
                        if (diceRoll == 0) {
                                playerPosition = playerPosition - diceRoll;
                                System.out.println("You have to stay on the same position!!");
                        }
                        if (playerPosition == SnakeArray[0]) {
                                playerPosition = 30;
                                System.out.println("IT'S A SNAKE.");
                                System.out.println("You are at " + playerPosition + " position.");

                        } else if (playerPosition == SnakeArray[1]) {
                                playerPosition = 50;
                                System.out.println("IT'S A SNAKE.");
                                System.out.println("You are at " + playerPosition + " position.");

}
                }
}
}



