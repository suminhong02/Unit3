import java.util.Scanner;

public class FindLargest {

    public static void main(String []args){
        System.out.print("Enter the first number: ");
        Scanner scan= new Scanner(System.in);
        int num1 = scan.nextInt();
        System.out.print("Enter the second number: ");
        Scanner scan1= new Scanner(System.in);
        int num2 = scan1.nextInt();
        if (num1==num2) {
            System.out.println(num1 + " and " + num2 + " are equal.");
        }
        if (num1>num2) {
            System.out.println(num1 + " is larger than " + num2 + ".");
        }
        if (num2>num1){
            System.out.println(num2+ " is larger than " + num1 +".");
        }

    }
}
