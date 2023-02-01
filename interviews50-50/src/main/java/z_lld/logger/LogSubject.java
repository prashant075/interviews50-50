package z_lld.logger;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogSubject {
   // List<LogObserver> logObservers = new ArrayList<>();
    Map<Integer, List<LogObserver>> logObserves = new HashMap<>();
    void abbObserver(int level,LogObserver logObserver){
        List<LogObserver> logObserverslist = logObserves.getOrDefault(level, new ArrayList<>());
        logObserverslist.add(logObserver);
        logObserves.put(level,logObserverslist);
    }
    void notifyAllObserver(int level, String msg){
        for(Map.Entry<Integer, List<LogObserver>> entry: logObserves.entrySet()){
            if(entry.getKey()==level){
                entry.getValue().forEach(observer-> observer.log(msg));
            }

        }
    }
}
