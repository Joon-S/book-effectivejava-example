package chapter_6;

/**
 * 이러한것을 상수별 메서드 구현이라고 부름
 */
public enum Operation {
    PLUS("+") {
        double apply(double x, double y){return x + y;}
        },
    MINUS("-") {
        double apply(double x, double y){return x - y;}
        },
    TIMES("*") {
        double apply(double x, double y){return x * y;}
        },
    DIVIDE("/") {
        double apply(double x, double y){return x / y;}
    };

    private final String symbol;
    Operation(String symbol) { this.symbol = symbol; }
    @Override
    public String toString() {
        return symbol;
    }

    abstract double apply(double x, double y);
}
