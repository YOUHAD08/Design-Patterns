package ma.youhad.adapter_pattern.devices.vga;

import ma.youhad.adapter_pattern.Interfaces.VGA;

public class Monitor implements VGA {
    @Override
    public void print(String message) {
        System.out.println("--------- Monitor ------");
        System.out.println(message);
        System.out.println("------------------------");
    }
}
