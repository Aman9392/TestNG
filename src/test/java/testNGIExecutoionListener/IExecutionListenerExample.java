package testNGIExecutoionListener;

import org.testng.IExecutionListener;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class IExecutionListenerExample implements IExecutionListener {
    private long startTime;
    @Override
    public void onExecutionStart(){
        System.out.println("TestNG Is going Start");
        startTime = System.currentTimeMillis();
        String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
        System.out.println("TestNG is Starting at:"+ timeStamp);
    }

    @Override
    public void  onExecutionFinish(){
        System.out.println("TestNG is Finished at :"+((System.currentTimeMillis())-startTime)+ "ms");
    }
}
