package chapter_4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UnionWithGeneric {

    //Don't use it. reference rules 23
    public static Set union(Set s1, Set s2) {
        Set result = new HashSet(s1);
        result.addAll(s2);
        return result;
    }

    //Use it better than upper
    public static <E> Set<E> unionUpdate(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<E>(s1);
        result.addAll(s2);
        return result;
    }

    //c# 에서 var 와 같이 비슷한 의미인듯...
    public static <K, V> HashMap<K, V> newHashMap() {
        return new HashMap<K, V>();
    }
}
