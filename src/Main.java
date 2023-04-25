import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("pomidor ucun: 1"+
                "sogan ucun : 2" +
                "sarimsaq ucun :3"
        );

        int y=sc.nextInt();
        switch (y){
            case 1:
                double n;
                Tomato tomato=new Tomato();
                tomato.vegetableName();
                n=sc.nextDouble();
                tomato.receivedKg(n);
                System.out.println("pomidorun qiymeti :" + tomato.price());
                break;

            case 2:

                Onion onion=new Onion();
                onion.vegetableName();
                n=sc.nextDouble();
                onion.receivedKg(n);
                System.out.println("soganin qiymeti :" + onion.price());
                break;

            case 3:

               Garlic garlic=new Garlic();
               garlic.vegetableName();
                n=sc.nextDouble();
                garlic.receivedKg(n);
                System.out.println("sarimsagin qiymeti :" + garlic.price());
                break;

        }

    }
}