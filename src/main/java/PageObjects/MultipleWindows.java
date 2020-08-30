package PageObjects;

import CommomUtil.BaseClass;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class MultipleWindows {

    public static void main(String[] args) {
        BaseClass baseClass = new BaseClass();
        WebDriver driver = baseClass.initializeDriver("firefox");
        baseClass.launchURL(driver, "https://accounts.google.com/signup");
        baseClass.getTitle(driver);
        // Storing all the Windows Ids in a set Object
        Set<String> ids = driver.getWindowHandles();
        System.out.println("size of Window handles = " + ids.size());
        //Creating an Iterator Object to iterate over the windows
        Iterator<String> iterator = ids.iterator();
        //Storing the id of Parent into ParentId
        String parentId = iterator.next();
        //Storing the id of Child into ChildId
        String childId = iterator.next();
        //Switching to Child Window
        driver.switchTo().window(childId);
        baseClass.tearDownDriver(driver);
    }
}
