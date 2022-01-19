package Queue;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Test {
    public static void testQueue(){

        TimeZone zone = TimeZone.getTimeZone("GMT+8:00");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        sdf.setTimeZone(zone);

        String currentTime = sdf.format( new Date());

        System.out.println("测试计划执行队列,当前时间：" + currentTime );

//在这里编写处理业务相关的代码，

        MethodContext mc = MethodContext.getContext(Thread.currentThread());

        if (mc == null)

            mc = new MethodContext(null, null);

        if (mc.getAuthentication() == null) {

            SessionAuthenticator sa = new SessionAuthenticator();

            mc.setAuthentication(sa.setUserName(AdministrativeDomainHelper.ADMINISTRATOR_NAME));

        }

    }


}
