package ma.youhad.adapter_pattern.adapters;

import ma.youhad.adapter_pattern.Interfaces.VGA;
import ma.youhad.adapter_pattern.devices.hdmi.TV;

public class VGAHDMIAdapterInheritance extends TV implements VGA {


    @Override
    public void print(String message) {
        System.out.println("++++++++ Adapter VGA - HDMI  Inheritance +++++++");
        plot(message.getBytes());
        System.out.println("++++++++++++++++++++++++++++++++++");

    }

}
