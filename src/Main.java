import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenlerin oluşturulması.
        int  u, alan, a, b, c;

        //User'dan verilerin alınması.
        Scanner input = new Scanner(System.in);
        System.out.print("1. Kenarı Girin : ");
        a = input.nextInt();
        System.out.print("2. Kenarı Girin : ");
        b = input.nextInt();
        System.out.print("3.Kenarı Girin: " );
        c= input.nextInt();

        u =  (a + b + c) / 2;
        alan = (int) Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Alan: " + alan);

    }
}
