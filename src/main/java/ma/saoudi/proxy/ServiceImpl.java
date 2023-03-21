package ma.saoudi.proxy;

public class ServiceImpl implements Service {
    @Override
    public double compute(int parameter) {
        double value=53;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return value*parameter;
    }
}
