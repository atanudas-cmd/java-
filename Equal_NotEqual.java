import java.util.*;
public class Equal_NotEqual 
{
        public static void main(String[] args) 
        {
                Scanner obj = new Scanner(System.in);
                System.out.println("Enter first number : ");
               
                int a = obj.nextInt();
                System.out.println("Enter second number : ");
                
               int b = obj.nextInt();
             
                if (a == b) 
                {
                    System.out.println("Both are numbers equal");
                }
           
                else if (a != b) 
                {
                    System.out.println("Both are numbers different");
                }
        }
}
