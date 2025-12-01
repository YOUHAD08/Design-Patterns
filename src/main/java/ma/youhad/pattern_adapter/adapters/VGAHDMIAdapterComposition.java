package ma.youhad.pattern_adapter.adapters;

import ma.youhad.pattern_adapter.Interfaces.HDMI;
import ma.youhad.pattern_adapter.Interfaces.VGA;

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
