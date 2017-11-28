package org.kutyla.openshift.testenv;

public class Environment {
    private final String dummyServiceDnsName;

    public Environment(String dummyServiceDnsName) {
        this.dummyServiceDnsName = dummyServiceDnsName;
    }

    public String getHttpBaseUrl() {
        return "http://" + dummyServiceDnsName;
    }
}
