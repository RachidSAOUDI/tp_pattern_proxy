package ma.saoudi.proxy;

import java.util.HashMap;
import java.util.Map;

public class CacheProxy implements Service {
    private Map<Integer, Double> cache=new HashMap<>();
    private ServiceImpl service=new ServiceImpl();
    @Override
    public double compute(int parameter) {
        Double cacheValue=cache.get(parameter);
        if (cacheValue!=null){
            System.out.println("---- Cache Result -----");
            return cacheValue;
        } else {
            double result = service.compute(parameter);
            cache.put(parameter,result);
            System.out.println("---- New compute result -----");
            return result;
        }
    }
}
