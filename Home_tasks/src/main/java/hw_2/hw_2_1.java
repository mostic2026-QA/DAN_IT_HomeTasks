package hw_2;

public class hw_2_1 {
    public static void main(String[] args) {
        String String1 = "This line that i want to cut, cause it is too long";
        System.out.println(String1.indexOf("it"));
        System.out.println(String1);
        System.out.println(String1.length());

        String String2 = String1.substring(0, 36);
        System.out.println(String2.indexOf("that"));
        System.out.println(String2);
        System.out.println(String2.length());

        String String3 = String2.substring(0, 10) + "don't want to cut, cause it is perfect";
        System.out.println(String3);
        System.out.println(String3.length());

    }
}
