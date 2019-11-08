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
            return "rock";
        }
        if (computer == 2){
            return "paper";
        }
        else{
            return "scissors";
        }

    }

    public static String WhoWins(String computer, String person){

        if(computer.equals("rock") && person.equals("rock")){
            return "You tied!";
        }
        else if(computer.equals("rock") && person.equals("paper")){
            return "You win!";
        }
        else if(computer.equals("rock") && person.equals("scissors")){
            return "Computer wins!";
        }
        else if(computer.equals("paper") && person.equals("rock")){
            return "Computer wins!";
        }
        else if(computer.equals("paper") && person.equals("paper")){
            return "You tied!";
        }
        else if(computer.equals("paper") && person.equals("scissors")){
            return "You win!";
        }
        else if(computer.equals("scissors") && person.equals("rock")){
            return "You win!";
        }
        else if(computer.equals("scissors") && person.equals("paper")){
            return "Computer wins!";
        }
        else{
            return "You tied!";
        }
    }
    public static void main(String [] args){


        System.out.println("Please choose either rock, paper, or scissors.");
        String person = getUserChoice();
        String computer = getComputerChoice();
        System.out.println("You chose " +person+ ".");
        System.out.println("The computer chose " + computer + ".");
        String winner = WhoWins(computer, person);
        System.out.println(winner);
    }
}
