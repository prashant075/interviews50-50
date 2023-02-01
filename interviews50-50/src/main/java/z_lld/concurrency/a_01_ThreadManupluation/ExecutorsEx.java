package z_lld.concurrency.a_01_ThreadManupluation;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Task implements  Runnable{
    private int id;
    public Task(int id){
        this.id = id;
    }
    @Override
    public void run() {
        System.out.println("Task with id "+id+" is in work- thread id: "+Thread.currentThread().getName());
        long duration = (long) (Math.random()*5);
        try {
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class ExecutorsEx {
//    public static void main(String[] args) {
//        //it is a single thread that will execute the task sequentially
//        ExecutorService executors = Executors.newSingleThreadScheduledExecutor();
//        for(int i=0;i<5;i++){
//            executors.execute(new Task(i));
//        }
//        executors.shutdown();
//
//    }
    public static void main(String[] args) {
        ExecutorService executors = Executors.newFixedThreadPool(2);
        for(int i=0;i<10;i++){
            executors.execute(new Task(i+1));
        }
        //we prevent the executor to excute any further tasks
        executors.shutdown();

        // terminate actual (running) tasks
        try{
            if(!executors.awaitTermination(1000, TimeUnit.MILLISECONDS)){
               // executors.shutdownNow();  //Immidiate shutdown
            }
        }catch (InterruptedException e){
            executors.shutdownNow();
        }

    }


}
