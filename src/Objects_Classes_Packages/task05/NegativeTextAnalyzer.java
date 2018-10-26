package Objects_Classes_Packages.task05;

class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    private final String[] KEYWORDS = {":(", "=(", ":|"};

    @Override
    protected String[] getKeywords() {
        return KEYWORDS;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }

}