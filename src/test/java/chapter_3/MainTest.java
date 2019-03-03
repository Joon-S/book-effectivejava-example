package chapter_3;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void publicNotPrivateTest() {
        String[] valuesCopy = {"Hello", "nice", "to", "meet", "you"};
        assertEquals(valuesCopy, PublicNotPrivate.values());
    }

    @Test
    public void complexTest() {
        Complex com1 = Complex.valueOf(1, 2);
        Complex com2 = Complex.valueOf(1, 2);
        assertTrue(com1.getRe() == com2.getRe()
                    && com1.getIm() == com2.getIm());
    }
}
