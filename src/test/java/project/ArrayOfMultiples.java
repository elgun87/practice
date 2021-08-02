package project;

public class ArrayOfMultiples {
    public static void main(String[] args) {
        String str = "ABS";

        try{
            System.out.println(str.charAt(7) + " line 8");
            System.out.println(str.charAt(7) + " line 9");
            System.out.println(str.charAt(7) + " line 10");
        }catch (Exception e){
            System.out.println(str.charAt(10));
        }
        finally {
            System.out.println("finall" + " line 15");
        }
        System.out.println("lets go cook a fish" + " line 18");
    }
}
