package java_hw_7_part_2_exercise_2;
class UpperCaseProcessor implements TextProcessor {
    @Override
    public String process(String text) {
        return text.toUpperCase();
    }
}
class ReverseProcessor implements TextProcessor {
    @Override
    public String process(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}
class TrimProcessor implements TextProcessor {
    @Override
    public String process(String text) {
        return text.trim();
    }
}