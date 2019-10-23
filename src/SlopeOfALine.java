import java.util.Scanner;

public class SlopeOfALine {

    public static String slope(int x1, int y1, int x2, int y2){
        if (x1==x2){
            return "The line defined by the points ("+x1+", "+y1+") and ("+x2+", "+y2+") is a vertical line and the slope is undefined.";}
        else{
            return "The line defined by the points ("+x1+", "+y1+") and ("+x2+", "+y2+") has a slope of "+(double)(y2-y1)/(x2-x1);}
        }

    public static void main(String []args){
    System.out.print("Enter x1: ");
    Scanner scan = new Scanner(System.in );
    int x1 = scan.nextInt();
    System.out.print("Enter y1: ");
    Scanner scan1 = new Scanner(System.in );
    int y1 = scan1.nextInt();
    System.out.print("Enter x2: ");
    Scanner scan2 = new Scanner(System.in );
    int x2 = scan2.nextInt();
    System.out.print("Enter y2: ");
    Scanner scan3 = new Scanner(System.in );
    int y2 = scan3.nextInt();
    System.out.println(slope(x1,y1,x2,y2));



}}
