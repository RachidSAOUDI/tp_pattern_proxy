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
        context.setService(new SecurityProxy());
        context.compute();
    }
}
