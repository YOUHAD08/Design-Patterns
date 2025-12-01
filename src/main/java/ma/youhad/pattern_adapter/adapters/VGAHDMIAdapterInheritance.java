package ma.youhad.pattern_adapter.adapters;

import ma.youhad.pattern_adapter.Interfaces.VGA;
import ma.youhad.pattern_adapter.devices.hdmi.TV;

public class VGAHDMIAdapterInheritance extends TV implements VGA {


    @Override
    public void print(String message) {
        System.out.println("++++++++ Adapter VGA - HDMI  Inheritance +++++++");
        plot(message.getBytes());
        System.out.println("++++++++++++++++++++++++++++++++++");

    }

}
