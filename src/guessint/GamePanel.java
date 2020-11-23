package guessint;

import javax.naming.InitialContext;

public class GamePanel {
    private Initializer initializer;
    private Player player;
    private int playerInt;
    private boolean guessCorrect;
    private int numGuess;

    public GamePanel(){
        guessCorrect = false;
        numGuess = 0;
        initPartner();
    }
    private void initPartner(){  //this method instantiates the 2 player and starts the game
        initializer = new Initializer();
        player = new Player();
        startGame();

    }
    public void startGame(){
        initializer.initGame();
        playGame();
    }
    public void playGame(){
        while(!guessCorrect){
            numGuess ++;
            playerInt = player.playingGame();
            guessCorrect = initializer.receiveGuess(playerInt);
        }
        terminateGame();
    }
    public void terminateGame(){
        System.out.println("Game terminates");
        System.out.println("\nTotally you guessed " + numGuess + "times");
    }
}
