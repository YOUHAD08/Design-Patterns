package ma.youhad.adapter_pattern.devices.hdmi;

import ma.youhad.adapter_pattern.Interfaces.HDMI;

public class TV implements HDMI {
    @Override
    public void plot(byte[] data) {
        System.out.println("========== TV ========");
        System.out.println(new String(data));
        System.out.println("=======================");
    }
}
