package lab10;

public class ex1 {

    public static void B (int x) {
        System.out.println("Hello B "+x);
    }//B
    public static void main(String[] args) {
        System.out.println("Hello Main");
        A();
        A();
    }//main
    public static void A(){
        System.out.println("Hello A");
    }//A
    public static int c(int x, int y){
        int z=x+y;
        System.out.println("Hello c"+z);
        B(z);

        return z;

    }
}








