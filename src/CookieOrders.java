import java.util.Scanner;

public class CookieOrders {

    public static String totalCost(int numBoxes){
        double total;
        if(numBoxes>=1 && numBoxes<=4){
            total = 6.95 * numBoxes;
            return "You bought " + numBoxes + " boxes of cookies at $6.95 per box. Your total bill is $"+total;
        }
        else if(numBoxes>=5 && numBoxes<=9){
            total = 5.95 * numBoxes;
            return "You bought " + numBoxes + " boxes of cookies at $5.95 per box. Your total bill is $"+total;
        }
        else if(numBoxes>=10 && numBoxes<=15){
            total = 5.50 * numBoxes;
            return "You bought " + numBoxes + " boxes of cookies at $5.50 per box. Your total bill is $"+total;
        }
        else if(numBoxes>=16){
            total = 4.95 * numBoxes;
            return "You bought " + numBoxes + " boxes of cookies at $4.95 per box. Your total bill is $"+total;
        }
        else{
            return "Your input is invalid";
    }}
    public static void main(String [] args){
        System.out.println("1-4 boxes:             6.95 per box");
        System.out.println("5-9 boxes:             5.95 per box");
        System.out.println("10-15 boxes:           5.50 per box");
        System.out.println("16 or more boxes:      4.95 per box");
        System.out.println("Enter the number of boxes you wish to purchase:");
        Scanner scan = new Scanner(System.in);
        int numBoxes = scan.nextInt();

        System.out.println(totalCost(numBoxes));

    }
}
