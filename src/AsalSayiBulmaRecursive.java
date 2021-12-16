import java.util.Scanner;

public class AsalSayiBulmaRecursive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int sayi = scanner.nextInt();
        if (CheckPrime(2, sayi) == 0)
            System.out.print(sayi+" sayısı ASALDIR !");
        else
            System.out.print(sayi+" sayısı ASAL degildir !");
        scanner.close();

    }

    public static int CheckPrime(int i, int sayi) {
        if (sayi == i)
            return 0;
        else if (sayi % i == 0)
            return 1;
        else {
            return CheckPrime(i + 1, sayi);
        }
    }
}
