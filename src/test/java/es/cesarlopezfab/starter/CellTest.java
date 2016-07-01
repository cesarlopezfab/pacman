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
		
		assertEquals(south, north.southCell());
		assertEquals(north, south.northCell());
	}
	
	@Test
	public void connectsSouthNorthTwoEmptyCells() {
		Cell north = CellFactory.empty();
		Cell south = CellFactory.empty();
		
		south.connectNorth(north);
		
		assertEquals(south, north.southCell());
		assertEquals(north, south.northCell());
	}
	
}
