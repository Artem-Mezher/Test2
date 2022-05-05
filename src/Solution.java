import java.util.Scanner;

class MaxMin
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter numbers");

        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int d=s.nextInt();

        int max=Math.max(Math.max(Math.max(a,b),c),d);

        System.out.println("Maximum number "+max);

    }
}