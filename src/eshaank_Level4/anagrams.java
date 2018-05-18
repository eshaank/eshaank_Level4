package eshaank_Level4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class anagrams {
	ArrayList<String> splits = new ArrayList<String>();
	String word;
	String wordPick;
	Boolean yes = true;
	public static void main(String[] args) {
		anagrams a = new anagrams();

		try {
			a.anagramSearch();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	void anagramSearch() throws FileNotFoundException {
		word = JOptionPane.showInputDialog("Type a word");
		wordPick = word;
		// System.out.println(word);
		for (int i = 0; i < word.length(); i++) {
			splits.add(word.substring(i, i + 1));

		}

		System.out.println(splits);
		Scanner scan = new Scanner(new File("src/eshaank_Level4/dictionary.txt"));
		while (scan.hasNextLine()) {
			String str = scan.nextLine();
			if (str.length() == word.length()) {
				{
					for (int i = 0; i < wordPick.length(); i++) {
						if (str.contains(wordPick.substring((i)))) {
							yes = true;
							if (yes == true) {
								System.out.println(str);
							}

						}
					}
					

				}
			}
		}

	}

}
