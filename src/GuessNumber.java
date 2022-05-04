import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random rand=new Random();
        int randInt;
        randInt=rand.nextInt(10)+1;
        Scanner console=new Scanner(System.in);
        while(true) {
            System.out.println("VVedite chislo");
            int userInput=console.nextInt();

            if(userInput==randInt){
                System.out.println("Vi ugadali chislo!!!");
                break;
            }
            else if(userInput>randInt){
                System.out.println("Zagadannoe chislo men'she");
            }
            else {
                System.out.println("Zagadannoe chislo bol'she");
                }
        }
    }
}
