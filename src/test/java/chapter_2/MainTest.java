package chapter_2;

import javafx.scene.control.ColorPicker;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void CaseInsenitiveStringTest() {
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String s = "polish";
        //대칭성문제
        assertTrue(cis.equals(s));
        assertFalse(s.equals(cis));
    }

    @Test
    public void PointTest() {
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
    }
}
