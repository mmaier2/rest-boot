package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("rest")
public class RestProperties {
    public RestProperties() {
    }

    String endpointName;
    String replymsg;

    public String getEndpointName() {
        return endpointName;
    }

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    public String getReplymsg() {
        return replymsg;
    }

    public void setReplymsg(String replymsg) {
        this.replymsg = replymsg;
    }
}
