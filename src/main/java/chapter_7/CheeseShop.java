package chapter_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * null 을 반환하는건 c 언어에서의 관습
 * 길이가 0인 배열을 할당해서 반환하더라도 아무 이득이 없기때문에 null 을 반환해옴
 * 근데 자바는 다름!
 */
public class CheeseShop {

    private List<String> cheeses = null;
    private static final String[] EMPTY_CHEESE_ARRAY = new String[0];

    public CheeseShop() {
        cheeses = new ArrayList<String>();
        cheeses.add("aa");
        cheeses.add("bb");
        cheeses.add("cc");
    }

    public void makeEmpty() {
        cheeses = null;
    }

    //Bad
    public List<String> getCheesesBad() {
        if(cheeses.size() == 0 || cheeses == null)
            return null;
        return cheeses;
    }

    //Good 1
    public String[] getCheeses() {
        return cheeses.toArray(CheeseShop.EMPTY_CHEESE_ARRAY);
    }

    //Good 2
    public List<String> getCheesesGood() {
        if(cheeses.isEmpty())
            return Collections.emptyList();
        else
            return new ArrayList<String>(cheeses);
    }
}
