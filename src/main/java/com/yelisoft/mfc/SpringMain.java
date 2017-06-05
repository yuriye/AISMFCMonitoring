package com.yelisoft.mfc;

import com.yelisoft.mfc.model.Affiliate;
import com.yelisoft.mfc.util.TicketsUtils;
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

            /*Config config = appCtx.getBean(Config.class);

            for (Affiliate affiliate : config.getAffiliates()) {
                //"e5ccab36-24df-481e-b036-ee8252f3ec01"
                TicketsUtils.getAllTicketsForAffiliate(config.getUrl(),affiliate.getDeviceUuid())
                        .forEach(System.out::println);
            }*/

        }

    }
}
