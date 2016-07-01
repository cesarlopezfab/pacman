package es.cesarlopezfab.starter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CellTest {

	@Test
	public void createsEmptyCell() {
		Cell cell = CellFactory.empty();
		
		assertTrue(cell.isEmpty());
	}
	
	@Test
	public void connectsNorthSouthTwoEmptyCells() {
		Cell north = CellFactory.empty();
		Cell south = CellFactory.empty();
		
		north.connectSouth(south);
		
		assertEquals(south, north.south());
		assertEquals(north, south.north());
	}
	
	@Test
	public void connectsSouthNorthTwoEmptyCells() {
		Cell north = CellFactory.empty();
		Cell south = CellFactory.empty();
		
		south.connectNorth(north);
		
		assertEquals(south, north.south());
		assertEquals(north, south.north());
	}
	
	@Test
	public void connectsEastWestTwoEmptyCells() {
		Cell east = CellFactory.empty();
		Cell west = CellFactory.empty();
		
		east.connectWest(west);
		
		assertEquals(west, east.west());
		assertEquals(east, west.east());
	}
	
	@Test
	public void connectsWestEastTwoEmptyCells() {
		Cell west = CellFactory.empty();
		Cell east = CellFactory.empty();
		
		west.connectEast(east);
		
		assertEquals(east, west.east());
		assertEquals(west, east.west());
	}
	
}
