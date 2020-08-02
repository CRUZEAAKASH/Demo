package Common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//Class to read the Properties from .properties file
public class DataFromPropertiesFile {

    /***
     *
     * @param key Passing the key for which value needs to be returned
     * @return value of the key
     */
    public static String getValueFromPropertyFile(String key) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("src/test/resources/data.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Properties properties = new Properties();
        try {
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("UserName = " + properties.getProperty(key));
        return properties.getProperty(key);
    }
}
