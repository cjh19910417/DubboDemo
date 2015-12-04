package cn.sinobest.demo;

import cn.sinobest.share.dubbo.Hello;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
 
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext-consumer.xml"});
        context.start();
 
        Hello service = (Hello)context.getBean("helloService"); // 获取远程服务代理
        String hello = service.sayHello("chenjianhua"); // 执行远程方法
 
        System.out.println( hello ); // 显示调用结果
    }
 
}