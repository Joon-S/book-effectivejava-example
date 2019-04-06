package chapter_7;

import org.junit.Test;

import java.math.BigInteger;
import java.util.Date;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void ArgsValidTest() {
        ArgsValid check = new ArgsValid();
        assertNotNull(check.mod(BigInteger.TEN));
        check.sort(1, 1);
    }

    @Test
    public void PeriodTest() {
        Date start = new Date();
        Date end = new Date();
        PeriodBad bad = new PeriodBad(start, end);
        Period good = new Period(start, end);
        System.out.println("Bad -> " + bad.toString());

        end.setYear(99);
        System.out.println("Bad -> " + bad.toString());
        System.out.println("Good -> " + good.toString());
        bad.end().setYear(98);
        System.out.println("Bad -> " + bad.toString());
        System.out.println("Good -> " + good.toString());
    }
}
