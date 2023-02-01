import java.util.Scanner;

public class Not_hesaplama {
    public static void main(String[] args) {


        int mat, fizik, kimya, turkce, tarih, muzik;


        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik notu: ");
        mat= inp.nextInt();

        System.out.println("Fizik notu: ");
        fizik= inp.nextInt();

        System.out.println("Kimya notu: ");
        kimya= inp.nextInt();

        System.out.println("Türkçe notu: ");
        turkce= inp.nextInt();

        System.out.println("Tarih notu: ");
        tarih= inp.nextInt();

        System.out.println("Müzik notu: ");
        muzik= inp.nextInt();

        int toplam = (mat+ fizik+kimya+tarih+turkce+muzik);
        double sonuc = toplam / 6.0 ;

        System.out.println("Ortalama : "+sonuc);

        String durum = sonuc <60.0 ? "Sınıfta kaldınız" : "Sınıfı geçtiniz" ;
        System.out.println(durum);

    }

}