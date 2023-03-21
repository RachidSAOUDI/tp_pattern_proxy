package ma.saoudi.proxy;

public class SecurityProxy implements Service {
    private ServiceImpl service=new ServiceImpl();
    @Override
    public double compute() {
        if (SecurityContext.role.equals("ADMIN")){
            double result=service.compute();
            return result;
        } else {
            throw new RuntimeException("Not authorized");
        }
    }
}
