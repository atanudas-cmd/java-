public class argerSmallerNumbers {
        public static void main(String[] args) {
                int a = 12;
                int b = 56;
              
                int min = (a<b)?a:b;
                int max = (a>b)?a:b;
                System.out.println("Smaller Number is " + min);
                System.out.println("Larger Number is " + max);
        
               
                if (a > b) {
                    System.out.println("Larger Number is " + a);
                } else {
                    System.out.println("Smaller Number is " + a);
                }
                if (b > a) {
                    System.out.println("Larger Number is " + b);
                } else {
                    System.out.println("Smaller Number is " + b);
                }
        }
}
