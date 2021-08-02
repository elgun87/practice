package project;

public class getAllNumbers {
    public static void main(String[] args) {
        printNumbers("hello i am 57");
    }
    public static void printNumbers(String str){
        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) >= 48 && str.charAt(i) <= 57){
                System.out.println(str.charAt(i));
            }
        }
    }
}
