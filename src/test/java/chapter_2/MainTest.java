package chapter_2;

import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void caseInsenitiveStringTest() {
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String s = "polish";
        //대칭성문제
        assertTrue(cis.equals(s));
        assertFalse(s.equals(cis));
    }

    @Test
    public void pointTest() {
        Point p = new Point(1, 2);
        ColorPoint cp = new ColorPoint(1, 2, Color.RED);
        //대칭성 문제
        assertTrue(p.equals(cp));
        assertTrue(cp.equals(p));

        ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
        Point p2 = new Point(1, 2);
        ColorPoint p3 = new ColorPoint(1, 2, Color.BLUE);
        assertTrue(p1.equals(p2));
        assertTrue(p2.equals(p3));
        assertFalse(p1.equals(p3));

        //즉 상속보다는 구성으로 유지하는게 equals 의 규칙을 지키기에는 만족!
    }

    @Test
    public void phoneNumberTest() {
        Map<PhoneNumber, String> m = new HashMap<>();
        m.put(new PhoneNumber(707, 867, 5309),
                "Jenny");
        PhoneNumber pn = new PhoneNumber(707, 867, 5309);
        System.out.println(pn.toString());
    }

    @Test
    public void phoneNumberCompareToTest() {
        PhoneNumber pn1 = new PhoneNumber(100, 200, 300);
        PhoneNumber pn2 = new PhoneNumber(101,201,301);
        PhoneNumber pn3 = new PhoneNumber(100, 201, 300);

        assertEquals(-1, pn1.compareTo(pn2));
    }
}