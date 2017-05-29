package com.yelisoft.mfc;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.FileNotFoundException;
import java.util.Arrays;

/**
 * Created by eliseev on 29.05.2017.
 */
public class SpringMain {
    public static void main(String[] args) throws FileNotFoundException {

        try (ConfigurableApplicationContext appCtx = new ClassPathXmlApplicationContext("spring/spring-app.xml")) {
            System.out.println("Bean definition names: " + Arrays.toString(appCtx.getBeanDefinitionNames()));
            Config config = appCtx.getBean(Config.class);
            config.init();
            System.out.println(config.getAffiliates());
        }
    }
}
