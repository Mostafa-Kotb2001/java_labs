
import java.util.Scanner;

class areas {

    void circle ( double r  ) {
        double perimeter = 2 * 3.14 * r ;
        double area = 3.14 * r * r ;
        System.out.println("the perimeter of circle = " + perimeter);
        System.out.println("the area of circle = " + area );

    }
    void triangle ( double l  ) {
        double perimeter = 3 * l ;
        double area = 0.5 * 0.866 * l * l ;
        System.out.println("the perimeter of triangle = " + perimeter);
        System.out.println("the area of triangle = " + area );

    }
}

public class shape {
    public static void main(String[]args) {
        Scanner input1 = new Scanner(System.in) ;
        Scanner input2 = new Scanner(System.in) ;
        System.out.println("enter radius :");
        double radius = input1.nextDouble() ;
        System.out.println("enter lenght :");
        double lenght = input1.nextDouble() ;
        areas x = new areas() ;
        x.circle(radius);
        x.triangle(lenght);


    }
}
