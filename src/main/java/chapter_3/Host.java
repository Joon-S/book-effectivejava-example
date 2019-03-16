package chapter_3;

import java.io.Serializable;

/**
 * 실행 가능 전략들을 외부에 공개하는 클래스
 * 전략이 한번만 사용되는경우에는 익명 캘래스 객체로 구현 즉 Comparator -> StringLengthComparatorV2 형식으로
 * 자주 사용된다면 private static 멤버 클래스로 표현한다음 전략 인터페이스가 자료형인 public static final 필드를
 * 통해서 외부에 공개하는것이 바람직 즉 아래와 같은 경우로 표현
 */
public class Host {
    private static class StrLenCmp implements Comparator<String>, Serializable {
        @Override
        public int compare(String t1, String t2) {
            return t1.length() - t2.length();
        }
    }

    //이 비교자는 직렬화가 가능
    public static final Comparator<String> STRING_LENGTH_COMPARATOR = new StrLenCmp();
}
