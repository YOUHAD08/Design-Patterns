package ma.youhad.proxy_pattern.service_impl;

import ma.youhad.proxy_pattern.service_interface.IService;

public class ServiceImpl implements IService {
    @Override
    public double compute(int param) {
        double value = 10;
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return value * param;
    }
}
