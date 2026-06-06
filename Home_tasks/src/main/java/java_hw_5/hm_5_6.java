package java_hw_5;

public class hm_5_6 {
    public static void main(String[] args) {
        int [] numbers = new int[45];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 101) - 50;
        }
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
    }
}
