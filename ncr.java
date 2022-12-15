import java.util.Scanner ;
public class ncr {
    public static void main (String[]args){
        int ncr;
        int numerator, denominator,  sub;
        int fact=1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number n1: ");
        int n1 = s.nextInt();
        System.out.print("Enter second number n2: ");
        int n2 = s.nextInt();
        for (int i = 1 ; i<= n1 ; i++)  fact = fact * i ;
        numerator = fact;
        sub = n1-n2;
        fact = 1;
        for (int i = 1 ; i<= sub ; i++) fact = fact * i;
        denominator = fact;
         fact = 1;
        for (int i = 1 ; i<= n2 ; i++) fact = fact * i;
        denominator = (fact*denominator);
        ncr = numerator/denominator;
        System.out.println("nCr = "+ncr);
    }
}
