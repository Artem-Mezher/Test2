public class Perimetr {
    private static int triangle;
    private static int square;
    private static double circle;

    public static void main(String[] args) {
        int a=20;
        int b=10;
        int c=10;
        double diametr=35;

        Perimetr.triangle = a+b+c;
        Perimetr.square = a*4;
        Perimetr.circle = diametr*3.14;

        System.out.println("Perimetr treugolnika"+"="+Perimetr.triangle);
        System.out.println("Perimetr kvadrata"+"="+Perimetr.square);
        System.out.println("Perimetr okrujnosti"+"="+Perimetr.circle);
    }
}
