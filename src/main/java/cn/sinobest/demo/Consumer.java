package cn.sinobest.demo;

import cn.sinobest.share.dubbo.Hello;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Decription:
 * 服务消费者
 *
 * @author chenjianhua
 */
public class Consumer {
 
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext-consumer.xml"});
        context.start();

        Hello service = (Hello) context.getBean("helloService"); // 获取远程服务代理
        for (int i = 0; i < 100; i++) {
            String hello = service.sayHello("World!-" + i); // 执行远程方法

            System.out.println(hello); // 显示调用结果
        }

    }
 
}