package chapter_6;

//비트 필드 열거형 상수 - 이렇게 쓰지말것!
public class TextBad {
    public static final int STYLE_BOLD = 1 << 0;
    public static final int STYLE_ITALIC = 1 << 1;
    public static final int STYLE_UNDERLINE = 1 << 2;
    public static final int STYLE_STRIKETHROUGH = 1 << 3;

    public void applyStyles(int styles) { }
}
