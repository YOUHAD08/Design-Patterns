package ma.youhad.pattern_adapter.devices.hdmi;

import ma.youhad.pattern_adapter.Interfaces.HDMI;

public class TV implements HDMI {
    @Override
    public void plot(byte[] data) {
        System.out.println("========== TV ========");
        System.out.println(new String(data));
        System.out.println("=======================");
    }
}
