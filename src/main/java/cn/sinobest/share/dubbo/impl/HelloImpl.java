package cn.sinobest.share.dubbo.impl;

import cn.sinobest.share.dubbo.Hello;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * Decription:
 *
 * @author chenjianhua
 */
@Service(version = "1.0")
public class HelloImpl implements Hello {
    @Override
    public String sayHello(String name) {
        String hello = String.format("Hello,%s!",name);
        System.out.println(hello);
        return hello;
    }
}
