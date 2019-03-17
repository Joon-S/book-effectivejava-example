package chapter_4;

import java.util.HashSet;
import java.util.Set;

/**
 * 형 안전성이 확실할 때만 @SuppressWarnings 아노테이션을 사용해라
 * 또한 이유를 주석으로 써놔라
 * 그리고 최대한 작은범위에서만
 */
public class UncheckedWarning {

    @SuppressWarnings("unchecked")
    public void start() {
        Set<String> exaltation = new HashSet();
    }
}
