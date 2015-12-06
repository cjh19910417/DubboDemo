package cn.sinobest.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Decription:
 * 服务提供者
 *
 * @author chenjianhua
 */
public class Provider {
 
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext-provider.xml"});
        context.start();

        System.in.read(); // 按任意键退出
    }
 
}