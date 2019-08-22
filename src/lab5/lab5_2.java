package lab5;

import java.util.Scanner;

public class lab5_2 {

    public static void main (String[] args) {
        Scanner SC = new Scanner(System.in);
        final double PI = 3.141;

        System.out.print("Enter r: ");
        double r = SC.nextDouble();

        double a =PI * r*r;
        System.out.println("พื้นผิววงกลม: " + a);

        double c = 3 * PI * r;
        System.out.println("เส้นรอบวงกลม: " + c);

        double v = (4/3) * PI *r*r*r;
        System.out.println("ปริมาตรความจุวงกลม: " + v);



    }



}
