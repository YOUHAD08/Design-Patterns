package ma.youhad.adapter_pattern.adapters;

import ma.youhad.adapter_pattern.Interfaces.HDMI;
import ma.youhad.adapter_pattern.Interfaces.VGA;

public class VGAHDMIAdapterComposition implements VGA {

    private HDMI hdmi;

    @Override
    public void print(String message) {
        System.out.println("++++++++ Adapter VGA - HDMI  Composition +++++++++++");
        hdmi.plot(message.getBytes());
        System.out.println("++++++++++++++++++++++++++++++++++");

    }

    public void setHdmi(HDMI hdmi) {
        this.hdmi = hdmi;
    }
}
