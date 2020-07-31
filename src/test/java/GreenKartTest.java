import Pages.GreenKart;
import org.testng.annotations.Test;

public class GreenKartTest {

    @Test
    public void greenKartTestToBeExcluded() throws InterruptedException {
        GreenKart.startGreenKart();
    }

    @Test
    public void greenKartTest() throws InterruptedException {
        GreenKart.startGreenKart();
    }
}
