package chapter_6;

/**
 * 자기 값에 따라 분기하는 Enum 자료형
 * 추천 안함
 */
public enum OperationBad {
    PLUS, MINUS, TIMES, DIVIDE;

    double apply(double x, double y) {
        switch(this) {
            case PLUS: return x + y;
            case MINUS: return x-y;
            case TIMES: return x * y;
            case DIVIDE: return x / y;
        }
        throw new AssertionError("Unknown op : " + this);
    }
}
