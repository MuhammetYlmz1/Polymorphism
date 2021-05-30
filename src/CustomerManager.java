import java.util.List;

public class CustomerManager {

     List<BaseLogger> _baseLogger;
    public  CustomerManager(List<BaseLogger> baseLogger){
        this._baseLogger=baseLogger;
    }
    public void Add(){
        System.out.println("Müşterisi  Eklendi");
        for (BaseLogger log:_baseLogger) {
            log.log("log mesajı");
        }
    }
}
