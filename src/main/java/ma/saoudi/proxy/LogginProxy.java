package ma.saoudi.proxy;

public class LogginProxy implements Service {
    private Service service;
    public LogginProxy(Service service) {
        this.service = service;
    }
    @Override
    public double compute(int parameter) {
        long t1=System.currentTimeMillis();
        double result = service.compute(parameter);
        long t2=System.currentTimeMillis();
        System.out.println("Run Time : "+(t2-t1));
        return result;
    }
}
