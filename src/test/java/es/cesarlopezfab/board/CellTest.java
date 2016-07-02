package es.cesarlopezfab.board;

import static es.cesarlopezfab.pacman.Direction.EAST;
import static es.cesarlopezfab.pacman.Direction.NORTH;
import static es.cesarlopezfab.pacman.Direction.SOUTH;
import static es.cesarlopezfab.pacman.Direction.WEST;
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

			north.connect(SOUTH, south);

			assertEquals(south, north.at(SOUTH));
			assertEquals(north, south.at(NORTH));
		}

		@Test
		public void connectsSouthNorthTwoEmptyCells() {
			Cell north = CellFactory.empty();
			Cell south = CellFactory.empty();

			south.connect(NORTH, north);

			assertEquals(south, north.at(SOUTH));
			assertEquals(north, south.at(NORTH));
		}

		@Test
		public void connectsEastWestTwoEmptyCells() {
			Cell east = CellFactory.empty();
			Cell west = CellFactory.empty();

			east.connect(WEST, west);

			assertEquals(west, east.at(WEST));
			assertEquals(east, west.at(EAST));
		}

		@Test
		public void connectsWestEastTwoEmptyCells() {
			Cell west = CellFactory.empty();
			Cell east = CellFactory.empty();

			west.connect(EAST, east);

			assertEquals(east, west.at(EAST));
			assertEquals(west, east.at(WEST));
		}
	}

}
