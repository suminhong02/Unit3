public class ShareDigit {
    public static void main(String [] args){
        System.out.println(numbers(12, 23));
        System.out.println(numbers(12, 43));
        System.out.println(numbers(12, 44));
    }
    public static boolean numbers(int x, int y){
        int x_left = x / 10;
        int x_right = x % 10;
        int y_left = y / 10;
        int y_right = y % 10;

        if(x_left == y_left){
            return true;
        }
        if(x_left == y_right){
            return true;
        }
        if(x_right == y_right){
            return true;
        }
        if(x_right == y_left){
            return true;
        }
        else return false;
}

}
