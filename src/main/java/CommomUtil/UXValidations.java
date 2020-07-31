package CommomUtil;

import org.openqa.selenium.WebElement;

public class UXValidations {

    public static void HeightWidthValidation(WebElement element) {
        //You can use the in-built methods of WebDriver to get the height and width of element to verify it from UX perspective.
        int height = element.getRect().getDimension().getHeight();
        int width = element.getRect().getDimension().getWidth();
        System.out.println(height);
        System.out.println(width);
    }
}
