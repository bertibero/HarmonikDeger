import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        System.out.print("N sayısını giriniz :");
        n = input.nextInt();

        double total=0;

        for(double i=1; i<=n; i++){

            total += (1/i);
        }
        
        System.out.print(total);

    }
}