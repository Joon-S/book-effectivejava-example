package chapter_2;

import java.awt.*;

public class ColorPoint extends Point {
    private Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        //불필요한 캐스팅을 통한 비교보다 먼저 이렇게
        if(obj == null)
            return false;

        //대칭성 개선전
        //if (!(obj instanceof ColorPoint))
        //    return false;
        //대칭성 개선후, 추이성 위반
        if(!(obj instanceof Point))
            return false;
        if(!(obj instanceof ColorPoint))
            return obj.equals(this);
        return super.equals(obj) && ((ColorPoint) obj).color == color;
    }
}
