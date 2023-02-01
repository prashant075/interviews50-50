package company.a_17_arcecium;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();
        ses.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                sendScreenShot();
            }
        }, 10, 5, TimeUnit.SECONDS);
    }

    private static void sendScreenShot() {
        System.out.println("ok");
       Object o =   new Object();

    }
}


