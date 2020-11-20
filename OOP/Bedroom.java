package com.codewithjacky;

public class Bedroom {

    private String name;
    private Wallr wall1;
    private Wallr wall2;
    private Wallr wall3;
    private Wallr wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, Wallr wall1, Wallr wall2, Wallr wall3, Wallr wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return this.lamp;
    }

    public void makeBed() {
        System.out.println("Bedroom -> make bed");
        bed.make();
    }
}
