package chapter_7;

/**
 * 규칙 40번에 해당하는 내용은 짤막짤막해서 여기에 기록만 함 솔직히 반복적인 내용인지라...
 * 1. 메서드 이름은 신중하게
 * 2. 편의 메소드 제공에 너무 열 올리지말것
 * 3. 인자 리스트 길게 하지말것
 * 4. 인자의 자료형으로는 클래스보다 인터페이스
 * 5. 인자 자료형으로 boolean 쓰는것보다 원소가 2개인 enum 자료형 쓰는게 낫다 예제는 아래 클래스
 */
public class Thermometer {

    public enum TemperatureScale { FAHRENHEIT, CELSTUS }
    private static Thermometer instance = null;

    private Thermometer() {}

    //단지 newInstance쪽에 true 로 하는것보다 무슨뜻인지 한눈에 파악 가능!
    public static Thermometer newInstance(TemperatureScale check) {
        if(instance == null)
            instance = new Thermometer();
        return instance;
    }
}
