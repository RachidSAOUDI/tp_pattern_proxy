package ma.saoudi.proxy;

public class SecurityProxy implements Service {
    private ServiceImpl service=new ServiceImpl();
    @Override
    public double compute(int parameter) {
        if (!SecurityContext.role.equals("ADMIN")){
            throw new RuntimeException("Not authorized");
        }
        double result=service.compute(parameter);
        return result;
    }
}
