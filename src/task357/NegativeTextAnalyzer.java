package task357;


public class NegativeTextAnalyzer extends KeywordAnalyzer {
    private String[] keyWords = {":(", "=(", ":|"};

    public Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }

    public String[] getKeyWords() {
        return keyWords;
    }
}

