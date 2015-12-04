package cn.sinobest.share.dubbo.impl;

import cn.sinobest.share.dubbo.Hello;

/**
 * Decription:
 * Created on 2015/12/4 0004
 *
 * @author chenjianhua
 */
public class HelloImpl implements Hello {
    @Override
    public String sayHello(String name) {
        String hello = String.format("Hello,%s!",name);
        System.out.println(hello);
        return hello;
    }
}
