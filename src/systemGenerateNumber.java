
import java.util.concurrent.ThreadLocalRandom;

public class systemGenerateNumber {
    public int generateRandomNumber(){
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);
        System.out.println("The system guess:  " + randomNumber);
        return randomNumber;
    }
}
