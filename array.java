import java.util.Scanner;
public class array {
    public static void main (String[]args){
        System.out.println("enter size of array :" );
        Scanner x = new Scanner(System.in) ;
        int a = x.nextInt();
        double arr [] ;
        arr = new double[a] ;
        double output[]  ;
        output = new double[a] ;


        for ( int i = 0 ; i<a ; i++){
            Scanner input = new Scanner(System.in) ;
            System.out.println("enter array"+ (i+1));
            arr[i] = input.nextInt() ;


        }
        double  max = 0 ;
        for ( int i = 0 ; i<a ; i++){
            if (arr[i]>max){
                max = arr[i] ;
            }
        }
        System.out.println("max number is :" + max);



    }
}
