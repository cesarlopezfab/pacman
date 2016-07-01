package es.cesarlopezfab.starter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CellTest {

	@Test
	public void emptyCell() {
		Cell cell = new Cell();
		
		assertTrue(cell.isEmpty());
	}
	
	@Test
	public void connectNorthSouthTwoEmptyCells() {
		Cell north = new Cell();
		Cell south = new Cell();
		
		north.connectSouth(south);
		
		assertEquals(south, north.southCell());
		assertEquals(north, south.northCell());
	}
	
	@Test
	public void connectSouthNorthTwoEmptyCells() {
		Cell north = new Cell();
		Cell south = new Cell();
		
		south.connectNorth(north);
		
		assertEquals(south, north.southCell());
		assertEquals(north, south.northCell());
	}
	
}
