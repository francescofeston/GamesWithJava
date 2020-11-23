package guessint;

public class GuessInt {
    private String gameDescription;
    public GuessInt(){
        gameDescription ="This is a guessing number game.\n" + "The game initializer thinks of an integer between 1 and 100.\n" +
                "The player has to guess what the integer is.\n" + "The player who spent the least number of guesses win.\n";
        System.out.println(gameDescription);
        new GamePanel();
    }
    public static void main(String [] args ){
        new GuessInt();
    }
}
