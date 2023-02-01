import java.util.Scanner;
public class KdvHesaplama {

    public static void main (String[] args)
    {   Scanner inp = new Scanner(System.in);
        double tutar,  kdv=0.18;

        //kullanıcıdan tutar istenir
        System.out.println("Ücret tutarını giriniz :  ");
        tutar= inp.nextDouble();

        //1000den büyükse kdv oranı %8
        if (1000.0 < tutar)  kdv = 0.08;
        double kdvOranı=tutar*kdv;
        double sonTutar= tutar+ kdvOranı;


        System.out.println("KDV li tutar : " + sonTutar);


    }
}
