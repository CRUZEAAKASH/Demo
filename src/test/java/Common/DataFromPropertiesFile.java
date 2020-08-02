package Common;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//Class to read the Properties from .properties file
public class DataFromPropertiesFile {

    /***
     *
     * @param key Passing the key for which value needs to be returned
     * @return value of the key
     */
    public static String getValueFromPropertyFile(String key) throws IOException {
        FileInputStream fileInputStream = null;
        fileInputStream = new FileInputStream("src/test/resources/data.properties");
        Properties properties = new Properties();
        properties.load(fileInputStream);
        System.out.println("UserName = " + properties.getProperty(key));
        return properties.getProperty(key);
    }
}
