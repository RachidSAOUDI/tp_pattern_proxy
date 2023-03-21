package ma.saoudi.proxy;

public class SecurityProxy implements Service {
    private Service service;
    public SecurityProxy(Service service) {
        this.service = service;
    }
    @Override
    public double compute(int parameter) {
        if (!SecurityContext.role.equals("ADMIN")){
            throw new RuntimeException("Not authorized");
        }
        double result=service.compute(parameter);
        return result;
    }
}
