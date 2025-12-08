package ma.youhad.proxy_pattern.context;

import ma.youhad.proxy_pattern.service_interface.IService;

public class Context {
    private IService service;

    public void compute(int param) {
        double result = service.compute(param);
        System.out.println("***************************");
        System.out.println("The result is: " + result);
        System.out.println("***************************");
    }

    public void setService(IService service) {
        this.service = service;
    }
}
