import org.junit.Test;
import reflection.ArrayClassTest;
import reflection.PrimitiveClassTest;
import junit.UnitTestRunner;
import static org.junit.Assert.*;

public class UnitTests {
    
    @Test
    public void test() {
        assertEquals(2, 1 + 1);
    }
    
    public static void main(String[] args) {
        UnitTestRunner.run(new Class<?>[] {
            UnitTests.class,
            PrimitiveClassTest.class,
            ArrayClassTest.class,
            StringTest.class,
        });
    }
    
}
