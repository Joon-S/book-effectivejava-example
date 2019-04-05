package chapter_6;

//ordinal을 남용한 사례. 쓰지마셈
public enum EnsembleBad {
    SOLO, DUET, TRIO, QUARTET, QUINTET,
    SEXTET, SEPTET, OCTET, MONET, DECTET;

    public int numberOfMusicians() {
        return ordinal() + 1;
    }
}
