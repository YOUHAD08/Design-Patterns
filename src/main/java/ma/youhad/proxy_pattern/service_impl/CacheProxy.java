package ma.youhad.proxy_pattern.service_impl;

import ma.youhad.proxy_pattern.service_interface.IService;

import java.util.HashMap;
import java.util.Map;

public class CacheProxy implements IService {
    private Map<Integer,Double> cache = new HashMap<>();
    private IService service;

    public CacheProxy(IService service) {
        this.service = service;
    }
    @Override
    public double compute(int Param) {
        Double cachValue = cache.get(Param);
        if (cachValue != null){
            System.out.println("-------------- Cache Result ----------------");
            return cachValue;
        }
        else{
            double res= service.compute(Param);
            cache.put(Param,res);
            System.out.println("-------------- New Cache Result ----------------");

            return res;
        }
    }
}
