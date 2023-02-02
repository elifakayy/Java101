import java.util.Scanner;

public class ManavKasa {

    public static void main (String[] args)
    {
        Scanner inp = new Scanner(System.in);

        double armut,elma,domates,muz,patlıcan;
        double a= 2.14,e= 3.67, d=1.11,m=0.95, p=5.00;

        System.out.println("Armut kaç kilo :    ");
        armut= inp.nextDouble();
        System.out.println("Elma kaç kilo  :     ");
        elma= inp.nextDouble();
        System.out.println("Domates kaç kilo :    ");
        domates= inp.nextDouble();
        System.out.println("Muz kaç kilo  :     ");
        muz= inp.nextDouble();
        System.out.println("Patlıcan kaç kilo :    ");
        patlıcan= inp.nextDouble();

        double toplam =(armut*a)+(elma*e)+(domates*d)+(muz*m)+(patlıcan*p);

        System.out.println("Toplam tutar : "+ toplam);


    }
}
