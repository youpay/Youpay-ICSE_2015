import java.io.*;
class Wrong
{
    public static void main()throws IOException
    {
        BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) );
        System.out.println("Wrong Entry!!");
        System.out.println("Press 1 to open Region Selection Menu again");
        System.out.println("Press 2 to exit");
        int c = Integer.parseInt(br.readLine());
        System.out.println("\f");
        if(c == 1)
        {
            Main ob = new Main();
            ob.main();
        }
    }
}