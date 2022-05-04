public class Loader {
    public static void main(String[] args) {
        int a = 20;
        while (a > 0) {
            a -= 1;
            if (a == 5) break;
        }
        int summ = 0;
        int i;
        for (i = 0; i < 50; i++) {
            if (i == 45)
                continue;
            summ += i;
        }
        switch (summ) {
            case 50:
                System.out.println("Znachenie 50");
                break;
            case 1180:
                System.out.println("Znachenie 1180");
                break;
            case 1225:
                System.out.println("Znachenie 1225");
                break;
            default:
                System.out.println("Resultat nevernii");
        }
        if (a == 5 && summ == 1180) {
            System.out.println("Uslovie vipolneno");
        } else {
            System.out.println("Uslovie nevipolneno");
        }
    }
}

