package ma.youhad.proxy_pattern.service_impl;

import ma.youhad.proxy_pattern.service_interface.IService;

public class Proxy implements IService {

    private IService service;

    public Proxy(IService service) {
        this.service = service;
    }

    @Override
    public double compute(int param) {
        System.out.println("Proxy Before");
        double result = service.compute(param);
        System.out.println("Proxy After");
        return result;
    }
}
