package exercise7_17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DiceRollingTest {
	Dice dice;
	@BeforeEach
	void setUp() throws Exception {
		dice = new Dice();
	}

	@Test
	void test() {
		assertNotNull(dice);
	}
	
	@Test 
	void rollDiceTest() {
		assert(dice.rollDice() <= 12);
	}
	
	@Test
	void countFrequencyTest() {
		dice.countFrequency();
	}

}
