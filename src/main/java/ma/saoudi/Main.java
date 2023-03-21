package ma.saoudi;

import ma.saoudi.proxy.Context;
import ma.saoudi.proxy.ServiceImpl;

public class Main {
    public static void main(String[] args) {
        Context context=new Context();
        context.setService(new ServiceImpl());
        context.compute();
    }
}
