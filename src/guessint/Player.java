package guessint;
import javax.swing.JOptionPane;
public class Player {
    private String guessedIntString;
    private int guessedInt;

    public Player(){

    }
    public int playingGame(){
        guessedIntString = JOptionPane.showInputDialog("Enter a guess between 1 and 100");
        guessedInt = Integer.parseInt(guessedIntString);
        System.out.println("Player: my guess is " + guessedInt);
        return guessedInt;
    }
}
