/**
 * 
 */
package exercise7_17;

import java.security.SecureRandom;
import java.util.Arrays;


/**
 * @author gideon
 *
 */
public class Dice {
	private final SecureRandom random = new SecureRandom();
	private int[] tally = new int[11];
	
	public int rollDice() {
		int sum;
		sum = 1 + random.nextInt(6);
		sum += 1 + random.nextInt(6);
		return sum;
	}
	
	public void countFrequency() {
		int index;
		for(int i = 0; i < 36000000; i++) {
			index = rollDice() - 2;
			tally[index]++;
		}
		
		System.out.println(Arrays.toString(tally));
	}
	
	
	
//	public void 
}
