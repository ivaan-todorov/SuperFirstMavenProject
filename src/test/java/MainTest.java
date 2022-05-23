import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {

        @Test
        public void testAbbr() {

            Assert.assertEquals(Main.abbr("Sergey", 4), "S...");
            Assert.assertEquals(Main.abbr("Hello world!",8), "Hello...");
        }
    }

