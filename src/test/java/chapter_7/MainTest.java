package chapter_7;

import org.junit.Test;

import java.math.BigInteger;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void ArgsValidTest() {
        ArgsValid check = new ArgsValid();
        assertNotNull(check.mod(BigInteger.TEN));
        check.sort(1, 1);
    }
}
