package ma.saoudi;

import ma.saoudi.proxy.*;

public class Main {
    public static void main(String[] args) {
        SecurityContext.authenticate("user1","1234","ADMIN");
        Context context=new Context();
        context.setService(new LogginProxy());
        context.compute(6);
    }
}
