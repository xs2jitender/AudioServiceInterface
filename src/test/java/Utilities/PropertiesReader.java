package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    private static final String CONFIGFILEPATH = "./config.properties/config.properties";

    public static String getValue(String key) {
        File file = new File(CONFIGFILEPATH);
        FileInputStream fileInputStream;
        Properties properties = new Properties();
        try {
            fileInputStream = new FileInputStream(file);
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(key);
    }

    public static Long getTimeout() {
        String timeout = null;
        try {
            timeout = PropertiesReader.getValue("timeout");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Long.parseLong(timeout);
    }
}


