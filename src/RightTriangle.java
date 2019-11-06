import java.util.Scanner;

public class RightTriangle {

    public static boolean isTriangle(int a, int b, int c){
        return (a+b>c && a+c>b && b+c>a);
    }

    public static boolean isRight(int a, int b, int c){
        int a2 = (int)(Math.pow((double)(a), 2));
        int b2 = (int)(Math.pow((double)(b), 2));
        int c2 = (int)(Math.pow((double)(c), 2));
        return (a2+b2==c2 || a2+c2==b2 || b2+c2==a2);
    }

    public static void main(String []args){

        System.out.println("Enter three integer sides of a triangle:");
        Scanner scan = new Scanner(System.in);
        int side1 = scan.nextInt();
        int side2 = scan.nextInt();
        int side3 = scan.nextInt();
        if(isTriangle(side1, side2, side3) == true && isRight(side1, side2, side3) == true) {
            System.out.println("The side lengths of " + side1 +", "+ side2 + ", and " + side3 + " form a right triangle");
        }
        else if(isTriangle(side1, side2, side3) ==true && isRight(side1, side2, side3) == false){
            System.out.println("The side lengths of " + side1 +", "+ side2 + ", and " + side3 + " form a triangle, but it is not a right triangle");
        }
        else if(isTriangle(side1, side2, side3) == false){
            System.out.println("The side lengths of " + side1 +", "+ side2 + ", and " + side3 + " do not form a triangle");
        }
}}
