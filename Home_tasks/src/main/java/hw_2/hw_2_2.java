package hw_2;

import java.util.Arrays;

public class hw_2_2 {
    public static void main(String[] args) {
        String string = "Testing, is my favourite job";

        String string1 = string.replace(",", "");
        String[] words = string1.split(" ");


        for (int i = 0; i < words.length - 1; i++){
            System.out.println(words[i] + words[i].length());

        boolean result = words[i].length() > words[i + 1].length();
            System.out.println(result);}

    }
}
