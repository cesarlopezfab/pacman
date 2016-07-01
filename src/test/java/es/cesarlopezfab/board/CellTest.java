package es.cesarlopezfab.board;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.junit.runner.RunWith;

import de.bechte.junit.runners.context.HierarchicalContextRunner;
import es.cesarlopezfab.board.Cell;
import es.cesarlopezfab.board.CellFactory;
import es.cesarlopezfab.board.Content;

@RunWith(HierarchicalContextRunner.class)
public class CellTest {

	@Test
	public void createsEmptyCell() {
		Cell cell = CellFactory.empty();

		assertEquals(Content.EMPTY, cell.content());
	}

	@Test
	public void createCellWithContent() {
		Cell cell = CellFactory.withPacman();

		assertFalse(Content.EMPTY.equals(cell.content()));
	}

	public class Connection {
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

}
