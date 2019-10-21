import java.util.Scanner;

public class NumericComparisons {

    public static boolean isOdd(int num){
        return num % 2 != 0;
    }

    public static void main(String []args){
        System.out.print("Enter the number: ");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        System.out.println(num1 + " is odd: "+ isOdd(num1));
        System.out.println(num1 + " is zero: "+ isZero(num1));
        System.out.println(num1 + " is positive: "+ isPositive(num1));
        System.out.println(num1 + " is negative: "+ isNegative(num1));
        System.out.println(num1 + " is non negative: "+ isNonNegative(num1));
        System.out.println(num1 + " is non positive: "+ isNonPositive(num1));
    }

    public static boolean isZero(int num){
        return num == 0;
    }

    public static boolean isPositive(int num){
        return num>0;
    }

    public static boolean isNegative(int num){
        return num<0;
    }
    public static boolean isNonNegative(int num){
        return num>=0;
    }
    public static boolean isNonPositive(int num){
        return num<=0;
    }

            }


