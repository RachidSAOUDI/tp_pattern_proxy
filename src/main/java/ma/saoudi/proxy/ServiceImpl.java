package ma.saoudi.proxy;

public class ServiceImpl implements Service {
    @Override
    public double compute() {
        double value=55;
        return value*23;
    }
}
