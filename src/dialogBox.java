import javax.swing.*;

public class dialogBox {
    public String dialogBox(){
        String response = JOptionPane.showInputDialog(null,
                "Enter a guess between 1 and 10,you only have 5 attempts", "Welcome to the guessing game.", 3);
        return response;
    }
}
