package java8.SoapService;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class SoapService {

    @WebMethod
    public sinhvien say(String name) {
        return new sinhvien(name,29);
    }

    public static class sinhvien{
        public void setTen(String ten) {
            this.ten = ten;
        }

        private String ten;
        private Integer tuoi;

        public sinhvien() {}

        public sinhvien(String t, Integer tu) {
            this.ten = t;
            this.tuoi = tu;
        }

        public Integer getTuoi() {
            return tuoi;
        }

        public void setTuoi(Integer tuoi) {
            this.tuoi = tuoi;
        }

        public String getTen() {
            return ten;
        }

        /*@Override
        public String toString() {
            return "sinhvien{" +
                    "ten='" + ten + '\'' +
                    ", tuoi=" + tuoi +
                    '}';
        }*/
    }
    //"C:\Program Files\Java\jdk1.8.0_171\bin\wsimport" -d . -p wsclient -keep http://localhost:1212/say?wsdl
}
