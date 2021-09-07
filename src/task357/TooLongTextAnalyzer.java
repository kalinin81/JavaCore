package task357;


public class TooLongTextAnalyzer implements TextAnalyzer {
    private int maxLength;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    public Label processText(String text) {
        return text.length() <= maxLength ? Label.OK : Label.TOO_LONG;
    }
}
