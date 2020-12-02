package guessint;
import javax.swing.JOptionPane;
public class Player {
    private String guessedIntString;
    private int guessedInt;

    public Player() {
    }

    public int playingGame() {
        boolean qualified = false;
        while (!qualified) {
            guessedIntString = JOptionPane.showInputDialog("Enter a guess between 1 and 100");
            qualified = isQualifiedData(guessedInt);
            System.out.println("Player: my guess is " + guessedInt);
            return guessedInt;
        }
        shwMsg("Player: my guess is" + guessedInt);
        return guessedInt;
    }
    public boolean isQualifiedData(String inputString){
        try{
            guessedInt = Integer.parseInt(inputString);
        } catch (NumberFormatException ex){
            System.out.println();
            isInteger(inputString);
            return false;
        }
        return isInRange(); //check the range, returns false or true

    }

    public boolean isInteger(String inputString){
        
    }
}
