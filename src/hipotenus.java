import java.util.Scanner;

public class hipotenus {

    public static void main (String[] args)
    {   Scanner inp = new Scanner(System.in);
        int a,b;
        double c;


        //kullanıcıdan kenar uzunlukları istenir
        System.out.println("1. kenarı giriniz :   ");
        a= inp.nextInt();
        System.out.println("2. kenarı giriniz :   ");
        b= inp.nextInt();


        //hipotenus hesabı

        c= Math.sqrt((a*a)+(b*b));


        System.out.println("Hipotenus :  " + c);


    }



}
