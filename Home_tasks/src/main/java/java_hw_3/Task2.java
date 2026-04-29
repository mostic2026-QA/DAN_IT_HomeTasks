package java_hw_3;

public class Task2 {
    public static void main(String[] args) {
        String string = "Testing, is my favourite job";

        String string1 = string.replace(",", "");
        String[] words = string1.split(" ");

        for (int i = 0; i < words.length; i++){
            System.out.println("Слово " + (i+1) + " = " + words[i] + ", Довжина цього слова = " + words[i].length());}

        boolean longer = true;
        for (int i = 1; i < words.length; i++) {
            if (words[0].length() <= words[i].length()) {
                longer = false;
                break;
            }
        }
                System.out.println("Чи перше слово довше інших? " + longer);
    }
}
