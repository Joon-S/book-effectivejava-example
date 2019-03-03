package chapter_3;

/**
 * public 으로 구성할 필요가 없는거라면 최대한 private 으로
 * 즉 수정하지 못하도록 설계하자
 */
public final class Complex {
    private double re;
    private double im;

    private Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public static Complex valueOf(double re, double im) {
        return new Complex(re, im);
    }

    public static Complex valueOfPolar(double r, double theta) {
        return new Complex(r * Math.cos(theta),
                r * Math.sin(theta));
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }
}
