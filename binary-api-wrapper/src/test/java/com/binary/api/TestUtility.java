package com.binary.api;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author Morteza Tavanarad
 * @version 1.0.0
 * @since 8/4/2017
 */
public class TestUtility {
    private ApiWrapper api;
    private Properties properties;

    public TestUtility() throws Exception {
        this.properties = new Properties();
        InputStream inputStream = ClassLoader.getSystemResourceAsStream("TestEnvironment.properties");
        try{
            properties.load(inputStream);
            this.api = ApiWrapper.build("10");
        }
        catch (IOException ex){
            throw ex;
        }
    }

    public ApiWrapper getApi() {
        return api;
    }

    public Properties getProperties() {
        return properties;
    }
}
