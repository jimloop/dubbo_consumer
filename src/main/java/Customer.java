import com.dubbo.api.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Customer {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("customer.xml");
        context.start();
        System.out.println("dubbo服务消费端已启动。。。");
        DemoService demoService=(DemoService) context.getBean("demoService");
        String hello=demoService.sayHello("wanger");
        System.out.println(hello);
        System.in.read();//按任意键退出
    }
}
