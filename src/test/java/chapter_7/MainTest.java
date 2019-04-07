package chapter_7;

import org.junit.Test;

import java.math.BigInteger;
import java.util.*;

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

    @Test
    public void ThermometerTest() {
        Thermometer momether = Thermometer.newInstance(
                Thermometer.TemperatureScale.CELSTUS);
    }

    @Test
    public void CollectionTest() {
        Collection<?>[] collections = {
                new HashSet<String>(),
                new ArrayList<BigInteger>(),
                new HashMap<String, String>().values()
        };
        for(Collection<?> c : collections)
            System.out.println(CollectionClassifier.classify(c));
    }

    @Test
    public void UseVaragsTest() {
        System.out.println(UseVarargs.sumBad(1, 2, 3, 4, 5, 6));
        System.out.println(UseVarargs.min(1, 2, 3, 4, 5));
    }
}
