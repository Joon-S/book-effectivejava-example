package chapter_1;

import chapter_1.Elvis;
import chapter_1.NutritionsFacts;
import chapter_1.Student;
import chapter_1.TableStatus;
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void staticFactoryMethodTest() {
        Student person = Student.newInstanceByNameAndAge("이준서", 26);
        person.say();
    }

    @Test
    public void builderTest() {
        NutritionsFacts cocaCola = new NutritionsFacts.Builder(240, 8).
                calories(100).sodium(35).carbohydrate(27).build();
        cocaCola.toString();
        assertNotNull(cocaCola);
    }

    @Test
    public void privateOrenumSingletonTest() {
        System.out.println(Elvis.INSTANCE);
        Elvis.INSTANCE.test();
    }

    @Test
    public void enumTest() {

    }
}
