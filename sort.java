import java.util.Scanner;

public class sort{
    public static void main(String[]args){

        Scanner x = new Scanner(System.in) ;
        Scanner input = new Scanner(System.in) ;
        System.out.println("please enter size of array :");
        int size = x.nextInt() ;
        int [] arr;
        arr  = new int[size] ;
        for (int i = 0 ; i<size ; i++){
            System.out.println("enter array number " +(i+1) + ":");
            arr[i] = input.nextInt() ;
        }

        int index = 0 ;
        int [] result ;
        result = new int[arr.length] ;
        int max = 0 ;
        int a = size - 1  ;
        int b = a ;

        for ( int i = 0  ; i<=a ; i++){
            if (max<arr[i]){
                max = arr[i];
                index = i ;
            }
        }

        result[b] = arr[index];

        for ( int j = 0 ; j < a ; j++ ){
            b = b - 1 ;
            int maxi =  max ;
            max = 0 ;

            for ( int s = 0  ; s<=a ; s++ ){
                if ( max <arr[s]  &&  arr[s]< maxi){
                     max = arr[s];
                     index = s ;

                }
            }
            result[b] = arr[index];
        }

        System.out.println("array sorted =");
        for (int k = 0 ; k <= a ; k++) {
            System.out.println( result[k] );
        }


    }
}
