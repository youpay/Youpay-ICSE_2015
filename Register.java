import java.io.*;
class Register
{
    public static void main()
    {
        try
        {
            BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) ); //for input through keyboard
            FileReader fr = new FileReader("valid_user.ypdb");                              //for input through file
            BufferedReader frb = new BufferedReader ( fr );
            System.out.print("\f");
            int ser_user = 0 ;
            int loop_user = 0 ;
            String S3;
            String user;
            System.out.println("WELCOME TO REGISTRATION PAGE!!!!");
            System.out.println("Terms of this service-->");
            System.out.println("1.Start Balance will be $800");
            System.out.println("2.You cannot change your password(till YouPay updates to 1.1)");
            System.out.println("To Start Registration, Enter detals below and press enter");
            do
            {
                System.out.println("Username:");
                user = br.readLine();
                while((S3=frb.readLine()).compareTo("end")!=0)
                {
                    if(S3.equalsIgnoreCase(user))
                    {
                        ser_user = 1;
                        break;
                    }
                }
                if(ser_user == 1)
                {
                    System.out.println("Username is taken....enter another one....");
                    loop_user = 1 ;
                }
            }while(loop_user == 1);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}