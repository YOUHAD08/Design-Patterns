package ma.youhad.proxy_pattern.Controllers;

public class SecurityContext {
    public static String username;
    public static String password;
    public static String role;

    public static void authenticate(String username,String password,String role){
        SecurityContext.username=username;
        SecurityContext.password=password;
        SecurityContext.role=role;
    }
}
