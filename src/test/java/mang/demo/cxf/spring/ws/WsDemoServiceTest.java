package mang.demo.cxf.spring.ws;

import org.junit.Test;

import mang.demo.cxf.spring.ws.stub.WsDemoServiceService;
import mang.demo.cxf.spring.ws.stub.WsDemoService;


public class WsDemoServiceTest {
	
	@Test
	public void testDemoWs(){
		WsDemoServiceService wsdss=new WsDemoServiceService();
		WsDemoService wsd=wsdss.getWsDemoServicePort();
		String result=wsd.sayHello("ma");
		System.out.println(result);
		
	}
}
