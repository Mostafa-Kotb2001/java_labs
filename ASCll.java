import java.util.Scanner ;
public class ASCll {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the ASCll Value: ");
        int A = scan.nextInt();
        char ch = (char)A;
        System.out.println("\nThe character is \'"+ch+ "\'");
    }
}