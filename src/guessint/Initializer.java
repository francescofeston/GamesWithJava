package guessint;

public class Initializer {
    private int givenInt;
    private boolean match;

    public Initializer(){

    }
    public void initGame(){
        givenInt = (int) (Math.random() * 100) + 1; //generates random number from 1 - 100
        match = false;
        System.out.println("I've already initialised the game ");
        System.out.println("Please start your guess. Good luck!\n");

    }
    public boolean receiveGuess(int receivedGuess){
        match = isGuessCorrect(receivedGuess);
        return match;

    }
    public boolean isGuessCorrect(int playerGuess){
        boolean correct = false;
        if(playerGuess == givenInt){
            System.out.println("Initializer: your guess " + playerGuess + "is correct!");
            correct = true;
        }
        else if(playerGuess > givenInt){
            System.out.println("Initializer: your guess " + playerGuess + "is too large");
        }
        else if(playerGuess < givenInt){
            System.out.println("Initializer: your guess " + playerGuess + "is too small");
        }
        return correct;
    }

}
