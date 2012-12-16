import java.io.*;
/**
 * @author   Kartik Verma
 * @version  1.0 ; (20th November '2012)
 */
class Main
{
    public static void main()throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader ( System.in ) );
        System.out.println("Welcome to YouPay® Payment Gateway...");
        System.out.println("Press Enter to continue.....");
        br.readLine();
        System.out.print("\f");
        System.out.println("Choose Region:[enter number and press enter]");
        System.out.println("1.United States Of America            -->$");
        System.out.println("2.England                             -->£");
        System.out.println("3.Rest Of Europe(Under European Union)-->Euros");
        System.out.println("4.India                               -->Rs.");
        System.out.println("5.China                               -->¥");
        System.out.println("6.Other nation");
        int c = Integer.parseInt(br.readLine());   
        System.out.print("\f");
        if(c == 1)
        {
            USD ob = new USD();
            ob.main();
        }
        else
        if(c == 2)
        {
            Pd ob = new Pd();
            ob.main();
        }
        else
        if(c == 3)
        {
            Eu ob = new Eu();
            ob.main();
        }
        else
        if(c == 4)
        {
            Rs ob = new Rs();
            ob.main();
        }
        else
        if(c == 5)
        {
            Ye ob = new Ye();
            ob.main();
        }
        else
        if(c == 6)
        {
            System.out.println("Service NOT available in your nation....");
        }
        else
        if(c > 6)
        {
            Wrong ob = new Wrong();
            ob.main();
        }
    }   
}