package mang.demo.cxf.spring.ws;

import javax.jws.WebService;

@WebService
public interface WsDemoService {
	public String sayHello(String name);
}
