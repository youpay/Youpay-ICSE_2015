import java.util.*;
import java.io.*;
class Login_USER_CHECK
{
    public static void main()throws IOException
    {
        //try
       // {
            FileReader fr = new FileReader("valid_user.ypdb");
            BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) ) ;
            BufferedReader frb = new BufferedReader(fr);
            String S1;
            String S2;
            String S3;
            int i = 0;
            System.out.println( "LOGIN SCREEN[enter details and press enter]" ) ;
            System.out.println( "Note-->" ) ;
            System.out.println( "1>If you want to open an account, contact admin till new update" ) ;
            System.out.println( "2>Password masking not available....." ) ;
            System.out.print( "username : " ) ;
            String user = br.readLine();  /**-->username*/      
            while((S3=frb.readLine()).compareTo("end")!=0)
            {
                if(S3.equalsIgnoreCase(user))
                {
                    System.out.println("Username mached.....");
                    br.readLine();
                    Login_PASS_CHECK ob = new Login_PASS_CHECK();
                    ob.main(user);
                    i = 1;
                    break;
                }
            }
            if(i==0)
            {
                Wrong ob = new Wrong();
                ob.main();
            }
            fr.close();
        //}catch(Exception e )
        //{
       //     System.out.println(e);
       // }
    }
}