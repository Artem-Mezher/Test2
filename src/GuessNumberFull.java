import java.util.Random;
import java.util.Scanner;

public class GuessNumberFull {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);

        System.out.println("Vvedite max chislo popytok");
        int turnQuantity= console.nextInt();

        System.out.println("Vvedite nijnii predel chisla");
        int lowerBound= console.nextInt();

        System.out.println("Vvedite verhnii predel chisla");
        int upperBound= console.nextInt();

        Random rand=new Random();
        int randInt;
        randInt=lowerBound+rand.nextInt(upperBound-lowerBound+1);
        int counter=1;
        boolean status=false;
        while (counter<=turnQuantity) {
            System.out.println("Vedite chislo");
            int userInput=console.nextInt();
            if (userInput==randInt){
                System.out.println("Vi ugadali!");
                status=true;
                break;
            }
            else if(userInput>randInt){
                System.out.println("Zagadannoe chislo menshe");
                status=false;
            }
            else {
                System.out.println("Zagadannoe chislo bolshe");
                status=false;
            }
            counter++;
            if (status==false) {
                System.out.println("Game over");
                System.out.println("Zagadano chislo"+" "+randInt);
            }

        }
}
}
