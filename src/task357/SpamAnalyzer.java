package task357;


public class SpamAnalyzer extends KeywordAnalyzer {
    private String[] keywords;

    public SpamAnalyzer(String[] keyWords) {
        this.keywords = keyWords;
    }

    public Label getLabel() {
        return Label.SPAM;
    }

    public String[] getKeyWords() {
        return keywords;
    }
}
