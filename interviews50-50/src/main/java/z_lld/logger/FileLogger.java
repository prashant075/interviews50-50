package z_lld.logger;

public class FileLogger implements LogObserver {

    @Override
    public void log(String msg) {
        System.out.println("FILE :"+msg);
    }
}
