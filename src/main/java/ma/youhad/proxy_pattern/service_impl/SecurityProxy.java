package ma.youhad.proxy_pattern.service_impl;

import ma.youhad.proxy_pattern.context.SecurityContext;
import ma.youhad.proxy_pattern.service_interface.IService;

public class SecurityProxy implements IService {

    private IService service;

    public SecurityProxy(IService service) {
        this.service = service;
    }
    @Override
    public double compute(int param) {
        if (!SecurityContext.role.equals("admin")) {
            throw new RuntimeException("You are not allowed to access this service");
        }
        System.out.println("You are an admin role.");
        double result = service.compute(param);
        System.out.println("Access granted.");
        return result;
    }
}
