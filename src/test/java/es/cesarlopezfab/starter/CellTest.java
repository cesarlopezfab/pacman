package es.cesarlopezfab.starter;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CellTest {

	@Test
	public void emptyCell() {
		Cell cell = new Cell();
		
		assertTrue(cell.isEmpty());
	}
}
