import java.util.Scanner;
import java.io.*;
class Login_PASS_CHECK
{
    public static void main(String user)throws IOException
    {
        BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) ) ;
        File f = new File ("valid_user.ypdb");
        Scanner scanner = new Scanner(new File("valid_pass.ypdp"));
        int i = 0 ;
        System.out.print( "password : " ) ;
        String pass = br.readLine();
        String p =user+"."+pass;
        while(scanner.hasNextLine())
        {
            if(p.equalsIgnoreCase(scanner.nextLine()))
            {
                System.out.println("Password Matched");
                i = 1;
                break;
            }
        }
        if(i ==0)
        {
            Wrong ob = new Wrong();
            ob.main();
        }
    }
}