package org.leejun.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Provider {
 
    public static void main(String[] args) throws Exception {
        
    	@SuppressWarnings("resource")
		final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:provider.xml");
    	
    	/*final Runnable service = new Runnable() {
			public void run() {
				 context.start();
			}
		};
		new Thread(service).start();*/
		
    	context.start();
    	  
    	System.out.println("--------service started----------");
    	
    	//context.close();
         
        System.in.read(); // 按任意键退出
    }
}
