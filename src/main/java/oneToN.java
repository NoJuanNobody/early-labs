import java.util.Scanner;

/**
 * Created by alejandrolondono on 5/18/16.
 */
public class oneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("pick a Integer");
        int n = sc.nextInt();
        int sum =0;
        for(int i = 0; i<=n; i++){
            System.out.printf("%s ",i);
            sum+= i;
        }
        System.out.println("");
        System.out.println("the sum of the integers from 1 to "+n+" is: "+sum);
    }
}
