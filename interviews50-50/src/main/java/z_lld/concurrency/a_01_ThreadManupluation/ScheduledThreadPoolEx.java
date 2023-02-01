package z_lld.concurrency.a_01_ThreadManupluation;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class StockMarketUpdater implements Runnable{

    @Override
    public void run() {
        System.out.println("Updating the Data from Web");
    }
}
public class ScheduledThreadPoolEx {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
        executorService.scheduleAtFixedRate(new StockMarketUpdater(), 1000,5000, TimeUnit.MILLISECONDS);
    }
}
