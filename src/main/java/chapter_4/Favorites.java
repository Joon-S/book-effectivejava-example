package chapter_4;

import java.util.HashMap;
import java.util.Map;

/**
 * 실체화 불가능 자료형에는 쓰일수없다
 * String, String[] 가능 / List<String> 불가능 (규칙 25)
 */
public class Favorites {
    private Map<Class<?>, Object> favorites =
            new HashMap<Class<?>, Object>();

    public <T> void putFavorite(Class<T> type, T instance) {
        if(type == null)
            throw new NullPointerException("Type is null");
        //무점검 경고가 발생할수있음
        //favorites.put(type, instance);

        //형 안전성 확보
        favorites.put(type, type.cast(instance));
    }

    public <T> T getFavorite(Class<T> type) {
        return type.cast(favorites.get(type));
    }
}
