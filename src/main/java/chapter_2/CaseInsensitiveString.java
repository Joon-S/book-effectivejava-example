package chapter_2;


public class CaseInsensitiveString {
    private String s;

    public CaseInsensitiveString(String s) {
        if(s == null)
            throw new NullPointerException();
        this.s = s;
    }

    //대칭성 위반
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof CaseInsensitiveString) {
            return s.equalsIgnoreCase(((CaseInsensitiveString) obj).s);
        }
        if(obj instanceof String)
            return s.equalsIgnoreCase((String) obj);
        return false;
    }

    //대칭성 위반; 버전별 일관된 리턴을 가져다주기 위해
//    @Override
//    public boolean equals(Object obj) {
//        return obj instanceof CaseInsensitiveString &&
//                ((CaseInsensitiveString) obj).s.equalsIgnoreCase(s);
//    }
}
