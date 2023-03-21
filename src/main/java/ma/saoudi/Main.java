package ma.saoudi;

import ma.saoudi.proxy.Context;
import ma.saoudi.proxy.Proxy;
import ma.saoudi.proxy.ServiceImpl;

public class Main {
    public static void main(String[] args) {
        Context context=new Context();
        // sans proxy
//        context.setService(new ServiceImpl());
        // via proxy
        context.setService(new Proxy());
        context.compute();
    }
}
