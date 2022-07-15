import java.util.Scanner;

public class Even_odd_num 
{
        public static void main(String[] args) 
        {
      
               Scanner scan=new Scanner(System.in);
                int n=scan.nextInt();
                System.out.println("Enter a number : ");

                switch (n % 2) 
                {
                 case 0:
                        System.out.println(n + " is an Even Number");
                        break;
                    case 1:
                        System.out.println(n + " is an Odd Number");
                        break;
                }
        }   
}
