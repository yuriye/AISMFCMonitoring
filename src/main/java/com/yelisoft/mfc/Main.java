package com.yelisoft.mfc;

import com.yelisoft.mfc.model.Affiliate;
import com.yelisoft.mfc.util.TicketsUtils;

/**
 * Created by eliseev on 22.05.2017.
 */
public class Main {
    public static void main(String[] args) {

        Config config = Config.getInstance();

        for (Affiliate affiliate : config.getAffiliates()) {
            //"e5ccab36-24df-481e-b036-ee8252f3ec01"
            TicketsUtils.getAllTicketsForAffiliate(config.getUrl(),affiliate.getDeviceUuid())
                    .forEach(System.out::println);
        }
    }
}
