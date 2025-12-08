package ma.youhad.proxy_pattern;

import ma.youhad.proxy_pattern.context.Context;
import ma.youhad.proxy_pattern.context.SecurityContext;
import ma.youhad.proxy_pattern.service_impl.*;

public class ProxyPatternDemo {
    public static void main(String[] args) {

        Context context = new Context();

        /* ************** Generale Implementation Of a Proxy *********** */
        System.out.println("---------- Proxy Pattern ---------");
        context.setService(new Proxy(new ServiceImpl()));
        context.compute(400);


       /* ************** Security Proxy *********** */
        System.out.println("----------Security Proxy  ---------");
        SecurityContext.authenticate("Ayoub","uyé_èu_ç","admin");
        context.setService(new SecurityProxy(new ServiceImpl()));
        context.compute(407);

        /* ************** Cache Proxy *********** */
        System.out.println("----------Cache Proxy  ---------");
        context.setService(new CacheProxy(new ServiceImpl()));
        context.compute(404);
        context.compute(402);
        context.compute(405);
        context.compute(402);

        /* ************** Logging Proxy *********** */
        System.out.println("----------Logging Proxy  ---------");
        context.setService(new LoggingProxy(new ServiceImpl()));
        context.compute(406);

        /* ************** Composed Proxy *********** */
        System.out.println("----------Composed Proxy  ---------");
        SecurityContext.authenticate("Ayoub","uyé_èu_ç","admin");
        context.setService(new LoggingProxy(new SecurityProxy(new ServiceImpl())));
        context.compute(10);
    }
}
