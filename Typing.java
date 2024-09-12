
import java.util.Random;
import java.util.Scanner;

public class Typing{
    public static void main(String[] args) {
        System.out.println("Typing Game");
        System.err.println("Please Enter Key");

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Integer point = 0;
        while(true){
            Random rand = new Random();
            String c = String.valueOf((char)('a' + rand.nextInt(26)));
            System.out.println(c);
            str = sc.nextLine();
            if (c.equals(str)){
                System.err.println("correct!");
                point++;
            }
            else{
                System.err.println("Miss!");
                break;
            }
        }
        System.out.println("GameOver . Your Point: " + point);

        
    }
}
