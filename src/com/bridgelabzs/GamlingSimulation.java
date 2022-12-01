package com.bridgelabzs;

/***
 * 
 * @author Admin
 *
 */
public class GamlingSimulation {
	/***
	 * 
	 * @param args
	 */
	public void startGambling() {
		int startingAmount = 100;
		int bet_Per_Game = 1;
		int bet_result = (int) (Math.random() * 10) % 2;
		if (bet_result == 0) {
			startingAmount -= 1;
			System.out.println("Gambler lost amount left = " + startingAmount);
		} else {
			startingAmount += 1;
			System.out.println("Gambler won amount left =" + startingAmount);

		}
	}

	public static void main(String[] args) {
		GamlingSimulation play = new GamlingSimulation();
		play.startGambling();
	}
}
