import java.io.*;
class ASCII
{
    public static void main()
    {
        try
        {
            char n;
            for(int i = 1; i <= 1000; i=i+10 )
            {
                for(int j = i ; j <= i+10 ; j++)
                {
                    n = (char)j;
                    System.out.print(j+"."+n+"\t");
                }
                System.out.println();
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}