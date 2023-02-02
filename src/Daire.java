import java.util.Scanner;

public class Daire {

    public static void main (String[] args)
    {   Scanner inp = new Scanner(System.in);
        int r;
        double pi=3.14;

        //alan ve çevre hesaplama
        System.out.println("Daienin yarıçapını giriniz :   ");
        r= inp.nextInt();
        double alan = pi* r*r;
        double cevre = 2* pi * r ;

        System.out.println("Dairenin alanı :  " + alan);
        System.out.println("Dairenin çevresi :  " + cevre);
    }

}
