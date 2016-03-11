package org.leetieniu.dubbo.service.provider;

import org.leetieniu.dubbo.service.DemoService;

public class DemoServiceImpl implements DemoService {

	@Override
	public String sayHello(String name) {
		return "Hello " + name;
	}
}
