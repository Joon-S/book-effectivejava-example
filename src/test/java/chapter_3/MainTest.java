package chapter_3;

import chapter_4.Stack;
import org.junit.Test;

import static org.junit.Assert.*;
//if you don't use class full name then use it :)
import static chapter_3.PhysicalConstantsV2.*;

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

    @Test
    public void physicalConstantsTest() {
        assertTrue(6.1 == AVOGADROS_NUMBER);
    }

    @Test
    public void HostAndStringLengthComparatorTest() {
        StringLengthComparatorV2 strLenV2 = new StringLengthComparatorV2();
        assertTrue(0 == strLenV2.compare("0", "0"));
        assertTrue(0 == Host.STRING_LENGTH_COMPARATOR.compare("123", "123"));
    }

    @Test
    public void StackGenericTest() {
        String[] args = {"Hello", "New", "World"};
        Stack<String> stack = new Stack<String>();
        for(String arg : args)
            stack.push(arg);
        while(!stack.isEmpty())
            System.out.println(stack.pop().toUpperCase());
    }
}
