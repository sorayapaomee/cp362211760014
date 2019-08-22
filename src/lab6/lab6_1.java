package lab6;

import java.util.Scanner;

public class lab6_1 {
    public static void main (String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.print("c = ");
        double c = kb.nextDouble();
        double f = (9/5)*c +32;
        System.out.println("อุณหภูมิ" + c + " เซลเซียส = "+ f + "ฟาเรนไฮต์");


    }
}
