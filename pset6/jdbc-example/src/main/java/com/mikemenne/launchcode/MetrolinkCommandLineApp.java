package com.mikemenne.launchcode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * User: mpmenne
 * Date: 7/3/14
 * Time: 1:51 AM
 */
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

    private MetrolinkDao metrolinkDao;
    private AppOutput appOutput;

    public void setMetrolinkDao(MetrolinkDao metrolinkDao) {
        this.metrolinkDao = metrolinkDao;
    }

    public void setAppOutput(AppOutput appOutput) {
        this.appOutput = appOutput;
    }
}
