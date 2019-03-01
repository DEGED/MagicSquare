package model;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlgorithmMagicSquareTestTest {

	private AlgorithmMagicSquare k;
	@Test
	void test() {
		negativeTest();
		parTest();
		upNo();
		upNe();
		leftNo();
		leftSo();
		rigthNe();
		rigthSe();
		downSe();
		DownSo();
		 
	}
	private void setupscenary1() {
		
	}
	private void setupscenary2(){
		k = new AlgorithmMagicSquare(-5,1,1);
		
	}
	private void setupscenary3(){
		k = new AlgorithmMagicSquare(4,1,1);
	}
	private void setupscenary4(){
		k = new AlgorithmMagicSquare(5,1,2);
	}
	private void setupscenary5(){
		k = new AlgorithmMagicSquare(5,1,2);
	}
	private void setupscenary6(){
		k = new AlgorithmMagicSquare(5,2,2);
	}
	private void setupscenary7() {
		k = new AlgorithmMagicSquare(5,2,3);
	}
	private void setupscenary8() {
		k = new AlgorithmMagicSquare(5,3,2);
	}
	private void setupscenary9() {
		k = new AlgorithmMagicSquare(5,3,4);
	}
	private void setupscenary10() {
		k = new AlgorithmMagicSquare(5,4,3);
	}
	private void setupscenary11() {
		k = new AlgorithmMagicSquare(5,4,4);
	}
	public void negativeTest() {
		setupscenary2();
		fail("The magic Square can't generate with a negative size.");
	}
	public void parTest() {
		setupscenary3();
		
	}
	public void upNo() {
		setupscenary4();
		int[][] generated = k.getMagicSquare();
		int[][] goodOne = {{15,8,1,24,17},{16,14,7,5,23},{22,20,13,6,4},{3,21,19,12,10},{9,2,25,18,11}};
		for(int i = 0; i<goodOne.length; i++) {
			for(int j = 0; j<goodOne[i].length; j++) {
			assertTrue(generated[i][j] == goodOne[i][j]);
			}
		}
		
	}
	 void upNe() {
		setupscenary5();
		int[][] generated = k.getMagicSquare();
		int[][] goodOne = {{15,24,1,8,15},{17,5,7,14,16},{4,6,13,20,22},{10,12,19,21,3},{11,18,25,2,9}};
		for(int i = 0; i<goodOne.length; i++) {
			for(int j = 0; j<goodOne[i].length; j++) {
				assertTrue("Is correct", generated[i][j] == goodOne[i][j]);
			}
		}
		
	}
	 void leftNo() {
		setupscenary6();
		int[][] generated = k.getMagicSquare();
		int[][] goodOne = {{15,16,22,3,9},{8,14,20,21,2},{1,7,13,19,25},{24,5,6,12,18},{17,23,4,10,11}};
		for(int i = 0; i<goodOne.length; i++) {
			for(int j = 0; j<goodOne[i].length; j++) {
				assertTrue("Is correct", generated[i][j] == goodOne[i][j]);
			}
		}
		
	}
	 void leftSo() {
		setupscenary7();
		int[][] generated = k.getMagicSquare();
		int[][] goodOne = {{17,23,4,10,11},{24,5,6,12,18},{1,7,13,19,25},{8,14,20,21,2},{15,16,22,3,9}};
		for(int i = 0; i<goodOne.length; i++) {
			for(int j = 0; j<goodOne[i].length; j++) {
				assertTrue("Is correct", generated[i][j] == goodOne[i][j]);
			}
		}
		
	}
	public void rigthNe() {
		setupscenary8();
		int[][] generated = k.getMagicSquare();
		int[][] goodOne = {{9,3,22,16,15},{2,21,20,14,8},{25,19,13,7,1},{18,12,6,5,24},{11,10,4,23,17}};
		for(int i = 0; i<goodOne.length; i++) {
			for(int j = 0; j<goodOne[i].length; j++) {
				assertTrue("Is correct", generated[i][j] == goodOne[i][j]);
			}
		}
		
	}
	public void rigthSe() {
		setupscenary9();
		int[][] generated = k.getMagicSquare();
		int[][] goodOne = {{11,10,4,23,17},{18,12,6,5,24},{25,19,13,7,1},{2,21,20,14,8},{9,3,22,16,15}};
		for(int i = 0; i<goodOne.length; i++) {
			for(int j = 0; j<goodOne[i].length; j++) {
				assertTrue("Is correct", generated[i][j] == goodOne[i][j]);
			}
		}
		
	}
	public void downSe() {
		setupscenary10();
		int[][] generated = k.getMagicSquare();
		int[][] goodOne = {{11,18,25,2,9},{10,12,19,21,3},{4,6,13,20,22},{23,5,7,14,16},{17,24,1,8,15}};
		for(int i = 0; i<goodOne.length; i++) {
			for(int j = 0; j<goodOne[i].length; j++) {
				assertTrue("Is correct", generated[i][j] == goodOne[i][j]);
			}
		}
		
	}
	public void DownSo() {
		setupscenary11();
		int[][] generated = k.getMagicSquare();
		int[][] goodOne = {{9,2,25,18,11},{3,21,19,12,10},{22,20,13,6,4},{16,14,7,5,23},{15,8,1,24,17}};
		for(int i = 0; i<goodOne.length; i++) {
			for(int j = 0; j<goodOne[i].length; j++) {
				assertTrue("Is correct", generated[i][j] == goodOne[i][j]);
			}
		}
		
	}
	
}
