import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Введите имя первого игрока:");
        Player playerOne = new Player(scn.nextLine());

        System.out.println("Введите имя второго игрока:");
        Player playerTwo = new Player(scn.nextLine());

        Game.startGame(playerOne,playerTwo,5);
    }

}
