public class Player {

     protected String name;
     protected int count = 0, roundScore = 0;
     protected boolean winner;

    Player(String name) {
        setName(name);
        setCount(0);
     }

    Player() {};

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    public int getRoundScore() {
        return roundScore;
    }

    public void setRoundScore(int score) {
        this.roundScore = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void addCount() {
         this.count++;
    }

    public String toString() {
             return ("Игрок " + this.getName() + " имеет " + this.getCount() + " очков.") + " Выпало число " + this.getRoundScore() + ".";
    }
}
