package ma.youhad.pattern_adapter.devices.vga;

import ma.youhad.pattern_adapter.Interfaces.VGA;

public class Monitor implements VGA {
    @Override
    public void print(String message) {
        System.out.println("--------- Monitor ------");
        System.out.println(message);
        System.out.println("------------------------");
    }
}
