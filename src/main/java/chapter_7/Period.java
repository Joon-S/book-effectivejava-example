package chapter_7;

import java.util.Date;

public class Period {
    private Date start;
    private Date end;

    //인자를 방어적으로 코딩
    public Period(Date start, Date end) {
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());
        if(start.compareTo(end) > 0)
            throw new IllegalArgumentException(
                    start + " after " + end);
    }

    public Date start() {
        return new Date(start.getTime());
    }

    public Date end() {
        return new Date(end.getTime());
    }

    @Override
    public String toString() {
        return "Start = " + start.toString() + " end = " + end.toString();
    }
}
