package z_lld.logger;

public class ConsoleLogger implements LogObserver {
    @Override
    public void log(String msg) {
        System.out.println("CONSOLE :"+msg);
    }
}
