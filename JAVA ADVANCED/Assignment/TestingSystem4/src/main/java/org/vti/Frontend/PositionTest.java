package org.vti.Frontend;

import org.vti.Backend.IPositionRepository;
import org.vti.Entity.Enumerate.PositionName;
import org.vti.Entity.Position;
import org.vti.Backend.PositionRepository;

import java.util.List;

public class PositionTest {
	public static void main(String[] args) {
		IPositionRepository repository = new PositionRepository();

		System.out.println("***********GET ALL POSITIONS***********");

		List<Position> positions = repository.getAllPositions();

		for (Position position : positions) {
			System.out.println(position);
		}

		System.out.println("\n\n***********CREATE POSITION***********");

		Position positionCreate = new Position();
		positionCreate.setName(PositionName.PM);
		repository.createPosition(positionCreate);

	}
}
