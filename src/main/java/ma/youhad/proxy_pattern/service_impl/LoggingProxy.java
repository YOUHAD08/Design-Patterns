package ma.youhad.proxy_pattern.service_impl;

import ma.youhad.proxy_pattern.service_interface.IService;

public class LoggingProxy implements IService {
    private IService service;

    public  LoggingProxy(IService service) {
        this.service = service;
    }
    @Override
    public double compute(int param) {
        long startTime = System.currentTimeMillis();
        double result = service.compute(param);
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime));
        return result;
    }
}
