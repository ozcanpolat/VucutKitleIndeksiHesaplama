import java.util.Scanner;
public class VucutKitleIndeksiHesaplama {
    public static void main(String[] args) {
        int kilo;
        double boy, indeks;

        Scanner input=new Scanner(System.in);
        System.out.print("Lutfen kilonuzu giriniz:");
        kilo= input.nextInt();
        System.out.print("Lutfen boyunuzu(metre cinsinden) giriniz :");
        boy= input.nextDouble();

        indeks= kilo / (boy*boy);
        System.out.println("Vucut kitle indeksiniz = "+indeks);
    }
}
