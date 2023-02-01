package z_lld.concurrency.a_01_ThreadManupluation;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

class Processor implements Callable<String>{
    private int id;
    public  Processor(int id){
        this.id = id;
    }
    @Override
    public String call() throws Exception {
        Thread.sleep(2000);
        return "Id: "+id;
    }
}
public class CallableAndFuture {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Future<String>> list =  new ArrayList<>();
        for(int i=0;i<10;i++){
            Future<String> future = executorService.submit(new Processor(i+1));
            list.add(future);
        }
        for(Future<String> f:list) {
            try {
                System.out.println(f.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
