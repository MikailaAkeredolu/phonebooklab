import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {


    @Test
    public void addTest(){
        //Given
        Calculator calculator = new Calculator();
        int x = 1;
        int y = 3;

        //When
        int actual = calculator.add(x,y);
        int expected = 4;

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void multiplyTest(){
        //Given
        Calculator calculator = new Calculator();
        int x = 2;
        int y = 3;

        //when
        int expected = 6;
        int actual = calculator.multiply(x,y);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void divideTest(){
        //Given
        Calculator calculator = new Calculator();
        int x = 100;
        int y = 2;

        //when
        int expected = 50;
        int actual = calculator.divide(x,y);

        //Then
        Assert.assertEquals(expected, actual);


    }
}
