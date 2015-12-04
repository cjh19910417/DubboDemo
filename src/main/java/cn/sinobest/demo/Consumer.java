package cn.sinobest.demo;

import cn.sinobest.share.dubbo.Hello;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
 
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext-consumer.xml"});
        context.start();
 
        Hello service = (Hello)context.getBean("helloService"); // ��ȡԶ�̷������
        String hello = service.sayHello("chenjianhua"); // ִ��Զ�̷���
 
        System.out.println( hello ); // ��ʾ���ý��
    }
 
}