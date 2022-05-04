import java.util.Scanner;

public class Trig {
    public static void main(String[] args) {
        System.out.println("Programma sravnenia znacheni y=sin(cos(x)) & y=cos(sin(x)");
        System.out.println("Vvedite nijnee znachenie x:");
        Scanner scanner = new Scanner(System.in);
        double x_down = scanner.nextDouble();
        System.out.println("VVedite verhnee znachenie x:");
        double x_up = scanner.nextDouble();
        System.out.println("Vvedite shag diskretizacii:");
        double step = scanner.nextDouble();
        double i = x_down;
        do {
            if (Math.sin(Math.cos(i)) < Math.cos(Math.sin(i))) {
                System.out.println("Pri x = " + i + " sin(cos(x)) = " + Math.sin(Math.cos(i)) + "; cos(sin(x)) = " + Math.cos(Math.sin(i)) + ". sin(cos(x)) menishe, chem cos(sin(x))");
            } else if (Math.sin(Math.cos(i)) > Math.cos(Math.sin(i))) {
                System.out.println("Pri x = " + i + " sin(cos(x)) = " + Math.sin(Math.cos(i)) + "; cos(sin(x)) = " + Math.cos(Math.sin(i)) + ". sin(cos(x)) bolshe, chem cos(sin(x))");
            } else {
                System.out.println("Pri x = " + i + " sin(cos(x)) = " + Math.sin(Math.cos(i)) + "; cos(sin(x)) = " + Math.cos(Math.sin(i)) + ". sin(cos(x)) raven cos(sin(x))");
            }
            i += step;
        }
        while (i <= x_up);
    }
}

