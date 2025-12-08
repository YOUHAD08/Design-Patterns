package ma.youhad.adapter_pattern;

import ma.youhad.adapter_pattern.adapters.VGAHDMIAdapterComposition;
import ma.youhad.adapter_pattern.adapters.VGAHDMIAdapterInheritance;
import ma.youhad.adapter_pattern.client.Computer;
import ma.youhad.adapter_pattern.devices.hdmi.TV;
import ma.youhad.adapter_pattern.devices.vga.Monitor;
import ma.youhad.adapter_pattern.devices.vga.VideoProjector;

public class AdapterPatternDemo {
    public static void main(String[] args){
        Computer computer = new Computer();
        computer.setVGA(new Monitor());
        computer.view("Hello There , Display this using Monitor");

        computer.setVGA(new VideoProjector());
        computer.view("Hello There , Display this using Video Projector");

        VGAHDMIAdapterComposition vgahdmiAdapterComposition = new VGAHDMIAdapterComposition();
        vgahdmiAdapterComposition.setHdmi(new TV());
        computer.setVGA(vgahdmiAdapterComposition);
        computer.view("Hello There , Display this using TV With Adapter Composition");

        VGAHDMIAdapterInheritance vgahdmiAdapterInheritance = new VGAHDMIAdapterInheritance();
        computer.setVGA(vgahdmiAdapterInheritance);
        computer.view("Hello There , Display this using TV With Adapter Inheritance");
    }
}
