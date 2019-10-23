import java.util.Scanner;

public class AddToPositiveOrNegativeSum {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int positive_sum = 0;
            int negative_sum = 0;
            for (int i = 1; i <= 10; i++) {
                System.out.print("Enter a number: ");
                int num = scan.nextInt();
                if (num>0){
                    positive_sum += num;}
                if (num<0){
                    negative_sum += num;}
                }
            System.out.println("The sum of the positive numbers is "+positive_sum);
            System.out.println("The sum of the negative numbers is "+negative_sum);
            }

        }

