package z_lld.logger;

public class LogManager {
    protected  static AbstractLogger buildChainOfLogger(){
       AbstractLogger infoLogger = new InfoLogger(1);
        AbstractLogger errorLogger = new ErrorLogger(1);
        AbstractLogger debugLogger = new DebugLogger(1);
        infoLogger.setNextLoggingLevel(errorLogger);
        errorLogger.setNextLoggingLevel(debugLogger);

        return infoLogger;
    }
    protected static LogSubject buildSubject(){
       LogSubject logSubject = new LogSubject();
       ConsoleLogger consoleLogger = new ConsoleLogger();
       FileLogger fileLogger = new FileLogger();
       logSubject.abbObserver(1, consoleLogger);
       logSubject.abbObserver(2, consoleLogger);
       logSubject.abbObserver(1, fileLogger);
       return logSubject;
    }
}
