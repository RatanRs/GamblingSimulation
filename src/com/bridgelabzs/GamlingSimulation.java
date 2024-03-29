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

	public int startGambling() {
		int startingAmount = 100;
		int bet_Per_Game = 1;
		while (startingAmount != 150 || startingAmount != 50) {
			int bet_result = (int) (Math.random() * 10) % 2;
			if (bet_result == 0) {
				startingAmount -= bet_Per_Game;
			} else {
				startingAmount += bet_Per_Game;
			}
			if (startingAmount == 150) {
				break;
			} else if (startingAmount == 50) {
				break;
			}
		}
		return startingAmount;
	}

	public void playFor20Days() {
		int total_Amount_Invested_In_20_Days = 2000;
		int amount_After_20Days = 0;
		int profit = 0;
		for (int i = 1; i <= 20; i++) {
			int result = startGambling();
			amount_After_20Days += result;
			if (result == 50) {
				System.out.println(" Unlucky day Lost 50$ in day " + i);
			}
			if (result == 150) {
				System.out.println("Lucky day Won 50$ in day " + i);
			}
		}
		System.out.println("Amount after 20 day is " + amount_After_20Days);
		if (amount_After_20Days > total_Amount_Invested_In_20_Days) {
			profit = amount_After_20Days - total_Amount_Invested_In_20_Days;
			System.out.println("Total profit after 20 days is = " + profit);

		} else if (amount_After_20Days < total_Amount_Invested_In_20_Days) {
			int loss = total_Amount_Invested_In_20_Days - amount_After_20Days;
			System.out.println("Total loss after 20 days is = " + loss);
		} else
			System.out.println("No profit No loss");
		if (amount_After_20Days > total_Amount_Invested_In_20_Days) {
			System.out.println("===============================================");
			System.out.println("Won " + profit + "$ Last month. Play Again");
			playFor20Days();
		}

	}

	public static void main(String[] args) {
		GamlingSimulation play = new GamlingSimulation();
		play.playFor20Days();
	}
}