import java.util.Scanner;

class Odd_Even 
{
    public static void main(String[] args) throws Exception
    {
        try
        {
            Scanner s = new Scanner(System.in);
            System.out.print("Input:\n");
            int n = s.nextInt();
            System.out.print(n);
            System.out.println("\nOutput:\n");
            if(n%2==0)
            {
                
                System.out.println("Even");
            }
            else if(n%2!=0)
            {
                System.out.println("Odd");
            }
            else
            {
                System.out.println("Invalid");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
