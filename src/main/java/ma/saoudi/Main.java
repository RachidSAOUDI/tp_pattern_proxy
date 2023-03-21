package ma.saoudi;

import ma.saoudi.proxy.*;

public class Main {
    public static void main(String[] args) {
        SecurityContext.authenticate("user1","1234","ADMIN");
        Context context=new Context();
        // sans proxy
//        context.setService(new ServiceImpl());
        // via proxy
//        context.setService(new Proxy());
        // SECURITY PROXY
//        context.setService(new SecurityProxy());
        // Cache Proxy
//        context.setService(new CacheProxy());
//        context.compute(3);
//        context.compute(4);
//        context.compute(7);
//        context.compute(3);
//        context.compute(7);
//        context.compute(7);
        // Logging Proxy
        context.setService(new LogginProxy());
        context.compute(6);
    }
}
