import org.testng.Assert;
import org.testng.annotations.Test;

public class HW_9_1Test {

    @Test
    public void testTask() {

        String result = HW_9_1.task("1v0n");

        Assert.assertEquals(result,"10");
    }
}
