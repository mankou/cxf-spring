package mang.demo.cxf.spring.ws.stub;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2017-11-18T22:44:36.643+08:00
 * Generated source version: 3.2.1
 * 
 */
@WebService(targetNamespace = "http://ws.spring.cxf.demo.mang/", name = "WsDemoService")
@XmlSeeAlso({ObjectFactory.class})
public interface WsDemoService {

    @WebMethod
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://ws.spring.cxf.demo.mang/", className = "mang.demo.cxf.spring.ws.stub.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://ws.spring.cxf.demo.mang/", className = "mang.demo.cxf.spring.ws.stub.SayHelloResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String sayHello(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
}
