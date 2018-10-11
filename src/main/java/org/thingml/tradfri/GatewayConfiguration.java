package org.thingml.tradfri;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

class GatewayConfiguration {
    String gatewayIp;
    String securityKey;

    public GatewayConfiguration() {
        Properties defaultProps = new Properties();
        FileInputStream in;
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("default.properties").getFile());
            in = new FileInputStream(file);
            defaultProps.load(in);
            in.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        Properties applicationProps = new Properties(defaultProps);
        gatewayIp = applicationProps.getProperty("gatewayIp");
        securityKey = applicationProps.getProperty("securityKey");
    }
}
