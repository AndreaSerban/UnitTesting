import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class CalcultorTest {
    Calculator calculator;

    @BeforeAll
    public static void beforeAll(){
        System.out.println("BeforeAll is executed");
    }

    @BeforeEach
    public void setUp(){
        System.out.println("BeforeEach is executed");
        calculator = new Calculator();
    }


    @Test
    public void checkSum (){
        double result = calculator.sum(4.5,4.5);
        Assertions.assertEquals(9,result);
    }
    @Test
    public void checkMultiply (){
        double result = calculator.multiply(2,3);
        Assertions.assertEquals(6,result);
    }

    @Test
    public void checkdiferenta (){
        double result = calculator.diferenta(6,3);
        Assertions.assertEquals(3, result);
    }
    @Test
    public void checkimpartire (){
        double result = calculator
    }
}
