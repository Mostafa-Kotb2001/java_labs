import java.util.ArrayList;
import java.util.List;
import java.util.Scanner ;
public class comma {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter a word :");
        String x = input.nextLine() ;

        String result = x.toString().replaceAll(",", " ").replaceAll(" ","");
        System.out.println(result);





    }
}
