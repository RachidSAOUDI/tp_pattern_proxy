package ma.saoudi.proxy;

public class Proxy implements Service {
    private ServiceImpl service=new ServiceImpl();
    @Override
    public double compute() {
        System.out.println("Proxy before");
        double result = service.compute();
        System.out.println("Proxy after");
        return result;
    }
}
