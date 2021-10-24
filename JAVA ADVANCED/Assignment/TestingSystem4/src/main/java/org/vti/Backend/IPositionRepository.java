package org.vti.Backend;

import org.vti.Entity.Position;

import java.util.List;

public interface IPositionRepository {
    List<Position> getAllPositions();
    void createPosition(Position position);
}
