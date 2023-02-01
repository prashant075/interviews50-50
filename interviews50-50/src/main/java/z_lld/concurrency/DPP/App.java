package z_lld.concurrency.DPP;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = null;
        Philosper[] philospers = null;
        Chopstick[] chopsticks =null;
        try{
            philospers = new Philosper[Constants.NUMBER_OF_PHILOSOPHERS];
            chopsticks = new Chopstick[Constants.NUMBER_OF_CHOPSTICKS];
            for(int i=0;i<Constants.NUMBER_OF_CHOPSTICKS;i++){
                chopsticks[i]= new Chopstick(i);
            }
            executorService = Executors.newFixedThreadPool(Constants.NUMBER_OF_PHILOSOPHERS);
            for(int i=0;i<Constants.NUMBER_OF_PHILOSOPHERS;i++){
                philospers[i]= new Philosper(i, chopsticks[i], chopsticks[(i+1)%Constants.NUMBER_OF_PHILOSOPHERS]);
                executorService.execute(philospers[i]);
            }
            Thread.sleep(Constants.SIMULATION_RUNNING_TIME);
            for(Philosper philosper:philospers){
                philosper.setFull(true);
            }
        }finally {
            executorService.shutdown();
            while(!executorService.isTerminated())
                Thread.sleep(1000);
            for(Philosper philosper:philospers){
                System.out.println(philosper+" eat # " +philosper.getEatingCounter()+" ");
            }
        }
    }
}
