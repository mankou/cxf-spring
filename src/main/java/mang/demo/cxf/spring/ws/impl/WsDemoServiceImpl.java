package mang.demo.cxf.spring.ws.impl;

import mang.demo.cxf.spring.ws.WsDemoService;

public class WsDemoServiceImpl implements WsDemoService {

	@Override
	public String sayHello(String name) {
		String result="hello "+name;
		return result;
	}

}
