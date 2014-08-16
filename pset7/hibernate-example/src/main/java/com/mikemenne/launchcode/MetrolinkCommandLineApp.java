package com.mikemenne.launchcode;

import com.mikemenne.launchcode.models.Stop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * User: mpmenne
 * Date: 7/3/14
 * Time: 1:51 AM
 */

@WrittenWatchingTV
@Component
public class MetrolinkCommandLineApp {

    public static void main(String[] varArgs) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        MetrolinkCommandLineApp metrolinkCommandLineApp =
                (MetrolinkCommandLineApp) context.getBean("metrolinkCommandLineApp");
        metrolinkCommandLineApp.run();
    }

    private void run() {
        List<Stop> stopsAllStops = metrolinkDao.getStopsAllStops();
        for (Stop stop : stopsAllStops) {
            appOutput.print(String.format("--- %s ---", stop.getStopName()));
        }
    }

    @Autowired
    private MetrolinkDao metrolinkDao;
    @Autowired
    private AppOutput appOutput;

}
