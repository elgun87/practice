package project;

public class PrintAllChars {
    public static void main(String[] args) {
        printChars("hello");
        printChars("Cybertek");
    }

    public static void printChars(String str){
        for(int i = 0;i < str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
}
