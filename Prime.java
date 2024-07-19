import java.util.Scanner;

public class Prime{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        
        if (num == 1) 
        {
            System.out.println("1 is neither Prime nor Composite");
        }

        for (int i=2; i<num; i++)
        {
            if (num % i == 0)
            {
                System.out.println("Composite");
                break;
            }
            System.out.println("Prime");
            break;
        }
    }
}