
import java.util.Scanner;
/**
 * Created by alejandrolondono on 4/28/16.
 */
public class AliceOrBob {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("enter a name");
        String personName = name.nextLine();

        if(personName.equalsIgnoreCase("Alice") || personName.equalsIgnoreCase("Bob")){
            System.out.println("Hello " + personName);

        } else {
            System.out.println("I dont need no new friends");
        }
    }
}
