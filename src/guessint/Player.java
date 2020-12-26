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
            qualified = isQualifiedData(guessedIntString);
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

    public boolean isInteger(String inputString) {
        if (inputString == null) {
            shwMsg("You entered ESK key or clicked the cancel button");
            System.exit(0);
        }
        if (inputString.equals("")) { //enter return key or click the ok button without any input
            shwMsg("You entered the return Key or clicked the OK button without any data"
                    + "\n" + "Input again.");
            return false;
        }
        int length = inputString.length();
        int i = 0;
        int maxLength = 10; //max integer has 10 digits
        String maxNum = String.valueOf(Integer.MAX_VALUE);
        //the length of the input must be less than the max integer
        if (inputString.charAt(0) == '-') { //if the input number is negative
            maxLength = 11;
            if(length == 1 || length > maxLength){
                shwMsg("You entered a negative integer with zero digit "+
                        " or its length is larger than the maximum length" +
                        "\n" + " of a negative integer");
                return false;
            }
            i = 1;
            maxNum = String.valueOf(Integer.MIN_VALUE);
        }else{
            if(length > maxLength){
                shwMsg("you entered a positive integer, "
                + "its length is larger than the maximum length of a positive integer");
                return false;
            }
        }
        //check that every character is a digit
        for(int digit = i; digit < length; digit++){
            char c = inputString.charAt(digit);
            if(c < '0' || c > '9'){
                shwMsg("Your inputted data contains non-digit characters"
                + "\n" + "Input again");
                return false;
            }
        }
        //the input value must be less than the max integer
        if(length == maxLength){
            for(;i < length; i ++){
                if(inputString.charAt(i) < maxNum.charAt(i)){
                    return true;
                }else if(inputString.charAt(i) > maxNum.charAt(i)){
                    shwMsg("The value of your input is larger than the possible "
                    + " maximum value");
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isInRange(){
        if((guessedInt >= 1) && (guessedInt <=100)){
            return true;
        }else{
            shwMsg("\nYour input is out of the bound of [1,100]. Input again");
            return false;
        }
    }

    public void shwMsg(String msgStr){
        System.out.println(msgStr);
    }
}
