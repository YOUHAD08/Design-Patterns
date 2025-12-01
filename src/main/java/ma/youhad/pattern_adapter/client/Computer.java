package ma.youhad.pattern_adapter.client;

import ma.youhad.pattern_adapter.Interfaces.VGA;

public class Computer {
    private VGA vga;
    public void view(String message){
        System.out.println("*********** Computer ************");
        vga.print(message);
        System.out.println("*********************************");
    }
    public void setVGA(VGA vga){
        this.vga=vga;
    }
}
