import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class IsPositiveTest {

    @Test
    public void checIsPositiveTrue(){
        IsPositive number = new IsPositive();
        boolean result = number.isPositive(6.6);
        Assertions.assertTrue(result);

    }
    @Disabled
    @Test
    public void checIsPositiveFalse() {
        IsPositive number = new IsPositive();
        boolean result = number.isPositive(-6.6);
        Assertions.assertFalse(result, "ai dat-o in bara");
    }

    @ParameterizedTest
    @ValueSource (doubles = {1.5,4.2,6.8,5.5, Double.MAX_VALUE})
    public void checkIsPositiveParametrizes (double numberFromValues){
        IsPositive numberToCheck = new IsPositive();
        boolean result = numberToCheck.isPositive(numberFromValues);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource (doubles = {-3,-8,-7,-15,-24} )
    public void checkIsNegativeParametrizes (double negativenumber){
        IsNegative negativenumbercheck = new IsNegative();
        boolean result = negativenumbercheck.isNegative(negativenumber);
        Assertions.assertTrue(result);
    }
}
