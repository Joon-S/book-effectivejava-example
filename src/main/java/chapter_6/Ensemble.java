package chapter_6;

/**
 * 실제로 이렇게 씀 아래 링크 참조
 * http://tcpschool.com/java/java_api_enum
 */
public enum Ensemble {
    SOLO(1), DUET(2), TRIO(3), QUARTET(4), QUINTET(5),
    SEXTET(6), SEPTET(7), OCTET(8), MONET(9), DECTET(10), TRIPLE_QUARTET(12);

    private int numberOfMusicians;
    Ensemble(int size) { this.numberOfMusicians = size; }
    public int numberOfMusicians() { return numberOfMusicians; }
}
