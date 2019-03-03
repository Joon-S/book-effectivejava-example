package chapter_3;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void publicNotPrivateTest() {
        String[] valuesCopy = {"Hello", "nice", "to", "meet", "you"};
        assertEquals(valuesCopy, PublicNotPrivate.values());
    }
}
