import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String... args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        Character hero = new Character("You", 
                                        rand.nextInt(400) + 100,
                                        rand.nextInt(400) + 100,
                                        rand.nextInt(100) + 100);
        Character enemy = new Character("メタグロス",
                                        rand.nextInt(500) + 500,
                                        rand.nextInt(500) + 500,
                                        rand.nextInt(100) + 50);
        hero.print_status();
        enemy.print_status();
        
        while(true){
            scanner.nextLine();
            hero.attack(enemy);
            enemy.attack(hero);
            hero.print_status();
            enemy.print_status();

            if (enemy.hp <= 0){
                System.out.println(hero.name + "の勝ち!");
                break;
            }

            if (hero.hp <= 0){
                System.out.println(hero.name + "は倒れた。。");
                break;
            }
        }
    }
}