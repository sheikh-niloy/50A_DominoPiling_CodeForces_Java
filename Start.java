import java.util.Scanner;
public class Start
{
    public static void main(String args[])
    {
        Scanner ip = new Scanner(System.in);
        double a=ip.nextInt();
        double b=ip.nextInt();
        double c=a*b;
        System.out.println((int)Math.floor(c/2));
    }
}