package hw_2;

public class hw_2_3 {
    public static void main(String[] args) {
        String string = "Completely random text in English. In it, we just need to determine how man times the character 'a' occurs there. And we can use the split method and the length method.";
        String string1 = string.toLowerCase();

        String[] string2 = string1.split("a");

        int intA = string2.length - 1;
        System.out.println(intA);

    }
}
