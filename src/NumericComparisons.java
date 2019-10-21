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

        System.out.print("Enter the number: ");
        Scanner scan1 = new Scanner(System.in);
        int num2 = scan1.nextInt();
        System.out.println(num2 + " is zero: "+ isZero(num2));

        System.out.print("Enter the number: ");
        Scanner scan2 = new Scanner(System.in);
        int num3 = scan1.nextInt();
        System.out.println(num3 + " is positive: "+ isPositive(num3));

        System.out.print("Enter the number: ");
        Scanner scan3 = new Scanner(System.in);
        int num4 = scan1.nextInt();
        System.out.println(num4 + " is negative: "+ isNegative(num4));

        System.out.print("Enter the number: ");
        Scanner scan4 = new Scanner(System.in);
        int num5 = scan1.nextInt();
        System.out.println(num5 + " is non negative: "+ isNonNegative(num5));

        System.out.print("Enter the number: ");
        Scanner scan5 = new Scanner(System.in);
        int num6 = scan1.nextInt();
        System.out.println(num6 + " is non positive: "+ isNonPositive(num6));
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


