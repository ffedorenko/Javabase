package lesson12;

import com.hillel.fedorenko.lessons.lesson12.HomeWork12;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeWork12Test {

    HomeWork12 testArray = new HomeWork12();

    int[][] array = new int[][] {{3, 5, 7}, {9, 5}, {6, 2, 10}};

    @Test
    public void arithmeticTest() {
        Assertions.assertEquals(2.0, testArray.arithmeticArray(array));
    }

    @Test
    public void quadTest() {
        Assertions.assertTrue(testArray.quadCheck(array));
    }
}
