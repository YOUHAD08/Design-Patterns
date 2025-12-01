package ma.youhad.pattern_adapter.devices.vga;

import ma.youhad.pattern_adapter.Interfaces.VGA;

public class VideoProjector implements VGA {
    @Override
    public void print(String message) {
        System.out.println("--------- Video Projector ------");
        System.out.println(message);
        System.out.println("------------------------");
    }
}
