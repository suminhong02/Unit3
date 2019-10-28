import java.util.Scanner;

public class DiscriminantAndRoots {
    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println(roots(a, b, c));
    }

    public static String roots(int a, int b, int c){
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if (discriminant == 0){
            return a+"x^2 + " + b+ "x + " + c +" has 1 real roots";
        }
        else if(discriminant>0){
            return a+"x^2 + " + b+ "x + " + c +" has 2 real roots";
        }
        else {
            return a+"x^2 + " + b+ "x + " + c +" has 2 imaginary roots";
        }
    }
}
