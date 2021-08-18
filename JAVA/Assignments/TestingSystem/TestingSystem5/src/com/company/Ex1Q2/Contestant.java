package com.company.Ex1Q2;

public class Contestant {
    private int ID;
    private String name;
    private String address;
    private int priorityLevel;
    private Block block;

    public int getID() {
        return ID;
    }

    public Contestant(int ID, String name, String address, int priorityLevel, Block block) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.priorityLevel = priorityLevel;
        this.block= block;
    }

    @Override
    public String toString() {
        return "Contestant{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priorityLevel=" + priorityLevel +
                ", block=" + block.getName() + "["+block.getSubject()+"]"+
                '}';
    }
}
