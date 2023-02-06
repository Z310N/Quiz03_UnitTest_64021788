import java.beans.Transient;
import static org.junit.Assert.assertEquals;
import org.junit.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestResult {

    public class assertEquals {
        QuizOneJunit test = new QuizOneJunit();

        int ans1 = test.square(10);
        int ans2 = test.square(20);

        @Before
        public void setUp() {
            System.out.println("@Before setUp");
        }

        @After
        public void yearDown() {
            System.out.println("@After tearDown");
        }

        @Test
        public void testEqal() {
            assertEquals(ans1, ans2);
        }
    }
    public class AssertTrue {
        QuizOneJunit test = new QuizOneJunit();
        
        private int val1 = 5;
        private int val2 =6;

        @Test
        public void assertTrue() {
            assertTrue(val1 < val2);
        }
        @Test
        public void TrueTest(){
            MyTrueTest obj1 = new MyTrueTest();
        }
    }
}
