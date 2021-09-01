package com.company;

public class Position {
    int             positionID;
    PositionName    positionName;

    @Override
    public String toString() {
        return "Position{" +
                "positionID=" + positionID +
                ", positionName=" + positionName +
                '}';
    }
}
