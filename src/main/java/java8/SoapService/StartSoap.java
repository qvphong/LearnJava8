package java8.SoapService;

import javax.xml.ws.Endpoint;

public class StartSoap {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:1212/say", new SoapService());
        System.out.println("Started !!");
    }
}
