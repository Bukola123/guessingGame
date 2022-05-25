import javax.swing.*;

public class gameCheck {
    public void gameCheck() {
        int randomNumber = new systemGenerateNumber().generateRandomNumber();
        int count = 1;
        int userInput = 0;
        int numberOfAttempt = 5;

        while (userInput != randomNumber && count < numberOfAttempt)
        {
            userInput = new userInput().userInput();
            JOptionPane.showMessageDialog(null, "" + gameCondition(userInput, randomNumber,(numberOfAttempt-1),count));
            count++;
        }
    }

    public static String gameCondition(int userInput, int randomNumber,int numberOfAttempt ,int count) {
        if (userInput == randomNumber) {
            return "Congratulations you have successfully guessed right" ;
        } else if (userInput > 100 || userInput < 0) {
            return "Invalid input";
        }else if (userInput > randomNumber) {
            return "Wrong guess; you guessed higher " + (numberOfAttempt - count) + " attempt left";
        }else if (userInput < randomNumber) {
            return "Wrong guess; you guessed lower " + (numberOfAttempt-count) + " attempt left";
        } else {
            return "Wrong guess";
            }

    }
}

