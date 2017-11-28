package org.kutyla.openshift.testenv;

import java.util.HashMap;
import java.util.Map;

public class EnvironmentFactory {

    private static Map<String, Environment> environments = new HashMap() {{
        put("localhost", new Environment("localhost"));
        put("development", new Environment("dummy-service.development.svc"));
        put("test", new Environment("dummy-service.test.svc"));
        put("prod-blue", new Environment("dummy-service.prod-blue.svc"));
        put("prod-green", new Environment("dummy-service.prod-green.svc"));
    }};


    public static Environment getEnvironment() {
        return getEnvironment(System.getProperty("env"));
    }

    public static Environment getEnvironment(String name) {
        if (name == null) {
            name = "localhost";
        }
        return environments.get(name);
    }

}