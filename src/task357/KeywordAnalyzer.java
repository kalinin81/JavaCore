package task357;


public abstract class KeywordAnalyzer implements TextAnalyzer {
    protected abstract String[] getKeyWords();

    protected abstract Label getLabel();

    public Label processText(String text) {
        for (String str : getKeyWords()) {
            if (text.contains(str)) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}
