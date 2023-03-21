package ma.saoudi.proxy;

public class Proxy implements Service {
    private ServiceImpl service=new ServiceImpl();
    @Override
    public double compute(int parameter) {
        System.out.println("Proxy 1");
        double result = service.compute(parameter);;
        return result;
    }
}
