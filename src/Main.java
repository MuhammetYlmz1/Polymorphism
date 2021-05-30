
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<BaseLogger> loggers=new ArrayList<>();
        loggers.add(new FileLogger());
        loggers.add(new DataBaseLogger());
        loggers.add(new EmailLogger());



        CustomerManager manager=new CustomerManager(loggers);
        manager.Add();
    }
}
