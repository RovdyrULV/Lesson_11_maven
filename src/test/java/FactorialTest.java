import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactorialTest {

    @Test
    void testGetFactorial() {
        Assertions.assertEquals(Factorial.getFactorial(5), 120);
        Assertions.assertEquals(Factorial.getFactorial(0), 1);
        Assertions.assertEquals(Factorial.getFactorial(-24), 1);
    }
}