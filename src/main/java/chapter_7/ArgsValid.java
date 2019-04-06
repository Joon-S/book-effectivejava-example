package chapter_7;

import java.math.BigInteger;

/**
 * 제약이 필요하다면 넣어야하지만 일반적으로 적을수록 좋다
 * 왜냐? 확장성때문에 다만 제한할려면 이렇게 문서를 남기도록 하자
 */
public class ArgsValid {

    public BigInteger mod(BigInteger m) {
        if(m.signum() <= 0)
            throw new ArithmeticException("Modulus <= 0:" + m);
        return m;
    }

    public void sort(int size, int length) {
        assert size > 0 && length > 0;
        assert size < 10 && length < 10;
    }
}
