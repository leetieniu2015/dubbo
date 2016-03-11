package org.leetieniu.dubbo;


import org.leetieniu.dubbo.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Consumer {
 
    public static void main(String[] args) throws Exception {
        @SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:consumer.xml");
        context.start();
 
        //DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
        DemoService demoService = context.getBean(DemoService.class); // 获取远程服务代理
        String hello = demoService.sayHello("world"); // 执行远程方法
 
        System.out.println( hello ); // 显示调用结果
        //context.close();
    }
}
