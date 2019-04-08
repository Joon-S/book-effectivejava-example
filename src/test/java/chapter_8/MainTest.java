package chapter_8;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void BillTest() {
        Bill.statementBad();
        Bill.statement();
    }
}
