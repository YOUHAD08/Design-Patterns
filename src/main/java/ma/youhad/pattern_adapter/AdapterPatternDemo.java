package ma.youhad.pattern_adapter;

import ma.youhad.pattern_adapter.adapters.VGAHDMIAdapterComposition;
import ma.youhad.pattern_adapter.adapters.VGAHDMIAdapterInheritance;
import ma.youhad.pattern_adapter.client.Computer;
import ma.youhad.pattern_adapter.devices.hdmi.TV;
import ma.youhad.pattern_adapter.devices.vga.Monitor;
import ma.youhad.pattern_adapter.devices.vga.VideoProjector;

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
