package org.leejun.dubbo.service.provider;

import org.leejun.dubbo.service.DemoService;

public class DemoServiceImpl implements DemoService {

	@Override
	public String sayHello(String name) {
		return "Hello " + name;
	}
}
