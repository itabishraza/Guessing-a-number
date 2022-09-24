import java.util.Random;
import java.util.Scanner;
public class Main
{
    public static void main (String[] args) 
{
    Random rand=new Random();
    Scanner sc=new Scanner(System.in);
    
    int rand_comnum=rand.nextInt(100);
    System.out.println( "enter a number between 1 to 100");
    int  input=0;
    
    
    do
    {
         input=sc.nextInt();
        if(rand_comnum<input)
        {
            System.out.println("its too gratter");
            
        }
        else if(rand_comnum>input)
        {
            System.out.println("its too small");
            
        }
        else
        {
            System.out.println("that's right");
            break;
            
        }
        
    }
    while(input>=0);
    
    
    
}
}