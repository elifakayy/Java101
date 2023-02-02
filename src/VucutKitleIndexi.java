import java.util.Scanner;

public class VucutKitleIndexi {
    public static void main (String[] args)
    {
        Scanner inp = new Scanner(System.in);

        double kilo, boy;


        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :    ");
        boy= inp.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz :     ");
        kilo= inp.nextDouble();

        double vki = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz : " + vki);
    }
}
