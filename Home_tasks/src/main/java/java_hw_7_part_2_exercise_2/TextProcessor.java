package java_hw_7_part_2_exercise_2;
public interface TextProcessor {
    String process(String text);
    default String removeDigits(String text) {
        return text.replace(".", "");
    }
}
