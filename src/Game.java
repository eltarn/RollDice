import java.util.Random;

public final class Game {

    private static int turns = 0;

    public static int getTurns() {
        return turns;
    }

    public static void setTurns(int turns) {
        Game.turns = turns;
    }

    public static void startGame(Player playerOne, Player playerTwo, int maxCount) {
        do {
            rollDice(playerOne,playerTwo);
        } while ((playerOne.getCount()<maxCount) && (playerTwo.getCount()<maxCount));

        System.out.println(toString(playerOne,playerTwo, maxCount));
    }

    private static void rollDice(Player playerOne, Player playerTwo) {

        playerOne.setRoundScore(Random(6));
        playerTwo.setRoundScore(Random(6));

        if (playerOne.roundScore!=playerTwo.roundScore) {
            if (playerOne.roundScore > playerTwo.roundScore) {
                playerOne.addCount();
            } else {
                playerTwo.addCount();
            }
        }

        System.out.println(playerOne.toString() + "\n" + playerTwo.toString() + "\n");

        setTurns(getTurns()+1);

    }

    public static String toString(Player playerOne, Player playerTwo, int maxCount) {

        Player winner = new Player();
        Player looser = new Player();


        if (playerOne.getCount() == maxCount) {
            winner = playerOne;
            looser = playerTwo;
        } else {
            winner = playerTwo;
            looser = playerOne;
        }
        return ("Победил игрок " + winner.getName() + ", набрав счёт " + winner.getCount() + ". \n" +
        "Проиграл " + looser.getName() + " cо счётом в " + looser.getCount()+ ". \n" +
        "Партия длилась " + getTurns() + " ходов. ");
    }

    private static int Random(int bound) {
        Random rnd = new Random();
        return  rnd.nextInt(bound+1);
    }
}
