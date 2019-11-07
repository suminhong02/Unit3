//Sumin Hong
//11/7/2019
//

import java.util.Scanner;

public class RockPaperScissors {

    public static String getUserChoice(){
        Scanner scan = new Scanner(System.in);
        String user = scan.nextLine();
        return user;}

    public static String getComputerChoice(){
        int computer = (int)(Math.random()*3)+1;
        if (computer == 1){
            return "Rock";
        }
        if (computer == 2){
            return "Paper";
        }
        else{
            return "Scissors";
        }

    }

    public static String WhoWins(String computer, String person){
        if()
    }

}
