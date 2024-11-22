package de.neuefische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

	@Test
	void add() {
		int a = 1;
		int b = 2;
		int expected = 3;

		int actual = Main.add(a, b);

		Assertions.assertEquals(expected, actual);
	}
}
