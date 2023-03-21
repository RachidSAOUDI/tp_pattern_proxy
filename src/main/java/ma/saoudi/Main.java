package ma.saoudi;

import ma.saoudi.proxy.*;

public class Main {
    public static void main(String[] args) {
        SecurityContext.authenticate("user1","1234","ADMIN");
        Context context=new Context();
        // Sec Proxy=>Cache Prox=>Loggin Proxy=>Servi Impl
        context.setService(new SecurityProxy(new CacheProxy(new LogginProxy(new ServiceImpl()))));
        context.compute(6);
        context.compute(6);
    }
}
