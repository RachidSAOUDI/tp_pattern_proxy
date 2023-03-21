package ma.saoudi.proxy;

public class Context {
    private Service service;

    public void compute(){
        System.out.println("*****************");
        double result = service.compute();
        System.out.println("Result : "+result);
        System.out.println("-----------------");
    }

    public void setService(Service service) {
        this.service = service;
    }
}
