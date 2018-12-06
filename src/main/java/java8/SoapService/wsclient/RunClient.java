package java8.SoapService.wsclient;

public class RunClient {
    public static void main(String[] args) {
        SoapServiceService ss = new SoapServiceService();
        SoapService say = ss.getSoapServicePort();
        Sinhvien str = say.say("nam");
        System.out.println(str.toString());
    }
}
