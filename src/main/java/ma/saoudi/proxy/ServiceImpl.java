package ma.saoudi.proxy;

public class ServiceImpl implements Service {
    @Override
    public double compute(int parameter) {
        double value=53;
        return value*parameter;
    }
}
