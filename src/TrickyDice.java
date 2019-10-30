public class TrickyDice {

    public static void main(String []args){


    }
    public static int regularRoll(){
        int num = (int)(Math.random()*6)+1;
        return num;
    }
    public static int trickyRoll(){
        int num = 0;
        int num1 = (int)(Math.random()*100)+1;
        if (num1<=10){
            num = 1;
        }
        else if (num1<= 30){
            num =2;
        }
        else if(num1<= 50){
            num = 3;
        }
        else if(num1<=60){
            num = 4;
        }
        else if(num1<=80){
            num = 5;
        }
        else{
            num = 6;
        }
        return num;
    }
}
