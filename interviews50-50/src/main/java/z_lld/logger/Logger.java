package z_lld.logger;

import java.io.Serializable;

import static z_lld.logger.LogManager.buildChainOfLogger;
import static z_lld.logger.LogManager.buildSubject;

public class Logger implements Cloneable, Serializable {
    private static volatile  Logger logger;
    private static volatile AbstractLogger chainOfLogger;
    private  static volatile LogSubject  logSubject;

    public Logger(){
        if(logger!=null) {
            throw new IllegalStateException("Object Already Present");
        }
    }

    public static Logger getLogger() {
        if(logger==null){
            synchronized (Logger.class){
                if(logger==null){
                    logger = new Logger();
                    chainOfLogger = buildChainOfLogger();
                    logSubject = buildSubject();
                }
            }
        }
        return logger;
    }

    protected Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }
    protected Object readResolve(){
        return logger;
    }

    private   void createLog(int level, String msg){
       chainOfLogger.logMessage(level, msg, logSubject);
    }
    public void info(String msg){
        createLog(1, msg);
    }

    public void debug(String msg){
        createLog(3, msg);
    }

    public void error(String msg){
        createLog(2, msg);
    }

}
