package ma.saoudi.proxy;

public class SecurityContext {
    public static String username="";
    public static String password="";
    public static String role="";

    public static void authenticate(String u,String pwd, String r){
        username=u;
        password=pwd;
        role=r;
    }
}
