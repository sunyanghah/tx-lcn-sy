package com.codingapi.tm.listener;

import com.codingapi.tm.Constants;
import org.springframework.boot.web.servlet.context.ServletWebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * create by lorne on 2017/8/7
 */
@Component
public class ApplicationStartListener implements ApplicationListener<ServletWebServerInitializedEvent> {

    private String getIp(){
        String host = null;
        try {
            host = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return host;
    }

    @Override
    public void onApplicationEvent(ServletWebServerInitializedEvent servletWebServerInitializedEvent) {
        int serverPort = servletWebServerInitializedEvent.getWebServer().getPort();
        String ip = getIp();
        Constants.address = ip+":"+serverPort;
    }
}
