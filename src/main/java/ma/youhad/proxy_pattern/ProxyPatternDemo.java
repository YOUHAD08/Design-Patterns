package ma.youhad.proxy_pattern;

import ma.youhad.proxy_pattern.Controllers.Client;
import ma.youhad.proxy_pattern.Controllers.SecurityContext;
import ma.youhad.proxy_pattern.service_impl.*;

public class ProxyPatternDemo {
    public static void main(String[] args) {

        Client client = new Client();

        /* ************** Generale Implementation Of a Proxy *********** */
        System.out.println("---------- Proxy Pattern ---------");
        client.setService(new Proxy(new ServiceImpl()));
        client.compute(400);


       /* ************** Security Proxy *********** */
        System.out.println("----------Security Proxy  ---------");
        SecurityContext.authenticate("Ayoub","uyé_èu_ç","admin");
        client.setService(new SecurityProxy(new ServiceImpl()));
        client.compute(407);

        /* ************** Cache Proxy *********** */
        System.out.println("----------Cache Proxy  ---------");
        client.setService(new CacheProxy(new ServiceImpl()));
        client.compute(404);
        client.compute(402);
        client.compute(405);
        client.compute(402);

        /* ************** Logging Proxy *********** */
        System.out.println("----------Logging Proxy  ---------");
        client.setService(new LoggingProxy(new ServiceImpl()));
        client.compute(406);

        /* ************** Composed Proxy *********** */
        System.out.println("----------Composed Proxy  ---------");
        SecurityContext.authenticate("Ayoub","uyé_èu_ç","admin");
        client.setService(new LoggingProxy(new SecurityProxy(new ServiceImpl())));
        client.compute(10);
    }
}
