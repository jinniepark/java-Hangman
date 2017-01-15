import java.net.URL;
import java.util.Random;
import java.util.Scanner;

public class HangmanGame {

	public static void main(String[] args) throws Exception {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a word: ");

		String answer = keyboard.nextLine();

		answer = answer.toUpperCase();
		String[] words = { "" };
		String chosenWord = "";
		String bars = "";
		String newbars = "";

		if (answer.equals("")) {
			

			System.out.print("Enter a URL: ");
			String u = keyboard.nextLine();
			Scanner sc = new Scanner(new URL(u).openStream());

			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				words = line.split(",");

			}
			Random rand = new Random();
			int randomWord = rand.nextInt(words.length);
			chosenWord = words[randomWord];
			chosenWord = chosenWord.toUpperCase();

			System.out.println("Selecting a random word.");
			


				System.out.print("[");

				while (newbars.length() < chosenWord.length()) {

					newbars += "-";

				}
				System.out.print(newbars + "]");

				for (int j = 6; j > 0; j--) {
					System.out.print(" You have " + j
							+ " left, enter a letter: ");
					String userChoice = keyboard.next();
					userChoice = userChoice.toUpperCase();
					boolean a = (chosenWord.indexOf(userChoice) != -1 && j > 0);
					if (chosenWord.indexOf(userChoice) != -1) {

						for (int i = 0; i < chosenWord.length(); i++) {
							if (chosenWord.charAt(i) == chosenWord
									.charAt(chosenWord
											.indexOf(userChoice))) {
								newbars = newbars.substring(0, i)
										+ userChoice
										+ newbars.substring(i + 1);
								if (newbars.equals(chosenWord)) {

									System.out
											.print("You win! The word was \""
													+ chosenWord
															.toUpperCase()
													+ "\"");
									return; //I got idea from a TA, Isaac.

								}

							} else {
								newbars = newbars;

							}

						}
						if (a) {
							System.out.println("Correct!");
							j++;
						}
					} else if (j > 1) {

						System.out.println("Incorrect!");

					} else {
					}

					if (j != 1 && !newbars.equals(chosenWord)) {
						System.out.print("[" + newbars + "]");
					}
					if (j == 1 && !newbars.equals(chosenWord)) {
						System.out.println("You lose! The word was \""
								+ chosenWord.toUpperCase() + "\"");
					}
				}

			}

					else {

						chosenWord = answer;

						System.out.print("[");

						while (newbars.length() < chosenWord.length()) {

							newbars += "-";

						}
						System.out.print(newbars + "]");

						for (int j = 6; j > 0; j--) {
							System.out.print(" You have " + j
									+ " left, enter a letter: ");
							String userChoice = keyboard.next();
							userChoice = userChoice.toUpperCase();
							boolean a = (chosenWord.indexOf(userChoice) != -1 && j > 0);
							if (chosenWord.indexOf(userChoice) != -1) {

								for (int i = 0; i < chosenWord.length(); i++) {
									if (chosenWord.charAt(i) == chosenWord
											.charAt(chosenWord
													.indexOf(userChoice))) {
										newbars = newbars.substring(0, i)
												+ userChoice
												+ newbars.substring(i + 1); 
										if (newbars.equals(chosenWord)) {

											System.out
													.print("You win! The word was \""
															+ chosenWord
																	.toUpperCase()
															+ "\"");
											return;

										}

									} else {
										newbars = newbars;

									}

								}
								if (a) {
									System.out.println("Correct!");
									j++;
								}
							} else if (j > 1) {

								System.out.println("Incorrect!");

							} else {
							}

							if (j != 1 && !newbars.equals(chosenWord)) {
								System.out.print("[" + newbars + "]");
							}
							if (j == 1 && !newbars.equals(chosenWord)) {
								System.out.println("You lose! The word was \""
										+ chosenWord.toUpperCase() + "\"");
							}
						}

					}
				}
			}
		

