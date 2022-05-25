

public class userInput {
    public int userInput(){
        String response = new dialogBox().dialogBox();
        int userInput = Integer.parseInt(response);
        return userInput;
    }
}
