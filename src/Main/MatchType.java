package Main;

public enum MatchType {
    BEST_OF_THREE("BEST_OF_THREE"), BEST_OF_FIVE("BEST_OF_FIVE");

    private String type;

    MatchType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
