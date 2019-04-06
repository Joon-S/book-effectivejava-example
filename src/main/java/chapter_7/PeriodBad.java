package chapter_7;

import java.util.Date;

public class PeriodBad {
    private Date start;
    private Date end;

    public PeriodBad(Date start, Date end) {
        if(start.compareTo(end) > 0)
            throw new IllegalArgumentException(
                    start + " after " + end);
        this.start = start;
        this.end = end;
    }

    public Date start() {
        return start;
    }

    public Date end() {
        return end;
    }

    @Override
    public String toString() {
        return "Start = " + start.toString() + " end = " + end.toString();
    }
}
