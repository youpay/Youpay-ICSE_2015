
/******************************************************Reading******************************************************************
import java.io.*;
import java.util.*;
class Sample
{
public static void main()throws IOException
{
File f = new File ("valid.ypd");
Scanner scanner = new Scanner(new File("valid.ypd"));
while(Scanner.hasNextLine())
{
System.out.println(Scanner.nextLine());
}
}
}
 */
/**import java.io.*;
import java.util.*;
class Sample
{
public static void main()throws IOException
{
String s="";
int i = -1 ;
File f = new File ("valid.ypd");
Scanner scanner = new Scanner(f);
s=scanner.nextLine();
System.out.println(s);
s=scanner.nextLine();
System.out.println(s);
}
}
import java.util.Scanner;
import java.io.*;
class Sample
{
public static void main()throws IOException
{
BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) ) ;
File f = new File ("valid_user.ypdb");
String user = "sam";
user = user + ".";
Scanner scanner = new Scanner(new File("valid_pass.ypdp"));
int i = 0 ;
System.out.print( "password : " ) ;
String pass = br.readLine();
while(scanner.hasNextLine())
{
String p =user+pass;
System.out.println(p);
//if(pass.equalsIgnoreCase(p))
// {
//    System.out.println("Password Matched");
//   i = 1;
// }
}
///  if(i ==0)
// {
//     System.out.println("Wrong Password");
// }
}
}*/
import java.io.*;
class Sample
{
    public static void main()
    {
        try
        {
            FileReader ob = new FileReader("valid_user.ypdb");
            BufferedReader br = new BufferedReader(ob);
            String[] ch = new String[9];
            String n = "bill";
            int j = 0;
            for(int i=0;i<9;i++)
            {
                ch[i]=br.readLine();
            }
            for(int i=0;i<9;i++)
            {
                System.out.println(ch[i]);
                if(ch[i]==n)
                {
                    System.out.println("found");
                }
            }
            if(j==0)
            {
                System.out.println("not found");
            }
            else
            if(j==1)
            {
                System.out.println("found");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
