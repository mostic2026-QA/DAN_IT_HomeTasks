package java_hw_7_part_2_exercise_2;

public class Main {
    public static void main(String[] args) {
        TextProcessor upperCaseProcessor = new UpperCaseProcessor();
        TextProcessor reverseProcessor = new ReverseProcessor();
        TextProcessor trimProcessor = new TrimProcessor();
        String sampleText = "  Hello. Anton. How are. you      ";
        System.out.println("=== Let's see, what we can do ===");
        System.out.println("Original text: " + sampleText + " ");
        System.out.println("----------------------------------------");
        System.out.println("UpperCase process: " + upperCaseProcessor.process(sampleText) + " ");
        System.out.println("UpperCase removeDots: " + upperCaseProcessor.removeDigits(sampleText) + " ");
        System.out.println("----------------------------------------");
        System.out.println("Reverse process: " + reverseProcessor.process(sampleText) + " ");
        System.out.println("Reverse removeDots: " + reverseProcessor.removeDigits(sampleText) + " ");
        System.out.println("----------------------------------------");
        System.out.println("Trim process: " + trimProcessor.process(sampleText) + " ");
        System.out.println("Trim removeDots: " + trimProcessor.removeDigits(sampleText) + " ");
        System.out.println("----------------------------------------");
    }
}