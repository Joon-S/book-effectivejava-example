package chapter_2;

public class PhoneNumber {
    private short areaCode;
    private short prefix;
    private short lineNumber;

    public PhoneNumber(int areaCode, int prefix, int lineNumber) {
        rangeCheck(areaCode, 999, "area code");
        rangeCheck(prefix, 999, "prefix");
        rangeCheck(lineNumber, 9999, "line number");
        this.areaCode = (short) areaCode;
        this.prefix = (short) prefix;
        this.lineNumber = (short) lineNumber;
    }

    private static void rangeCheck(int arg, int max, String name) {
        if(arg < 0 || arg > max)
            throw new IllegalArgumentException(name + ": " + arg);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this)
            return true;
        if(!(obj instanceof PhoneNumber))
            return false;
        PhoneNumber pn = (PhoneNumber) obj;
        return pn.lineNumber == lineNumber
                && pn.prefix == prefix
                && pn.lineNumber == lineNumber;
    }

    @Override
    public int hashCode() {
        //Bad
        //return 42;

        //Good
        int result = 17;
        result = 31 * result + areaCode;
        result = 31 * result + prefix;
        result = 31 * result + lineNumber;
        return result;
    }

    /**
     * 형식을 명시해주던지 아니던지간에 문서화는 분명히!
     * 1. 명시해줄경우
     * 전화번호를 문자열로 반환하며 XXX 는 지역번호, YYY는 국번...이런식으로
     * 회선번호가 123일경우 앞에 숫자 0 이 붙는다는둥 특징들을 서술
     *
     * 2. 명시해주지않을경우
     * 정해진 형식은 x 바꿀수있지만 대체로 이러한 문자열로 반환
     * "[Potion #9: type=love, smell=good ]"~~
     *
     * @return
     */
    @Override
    public String toString() {
        return String.format(" (%03d) %03d-%04d",
                areaCode, prefix, lineNumber);
    }
}
