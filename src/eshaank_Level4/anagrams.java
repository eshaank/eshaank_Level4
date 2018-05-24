package eshaank_Level4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class anagrams {
	ArrayList<String> splits = new ArrayList<String>();
	ArrayList<String> goodWords = new ArrayList<String>();
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

		// System.out.println(splits.size());
		Scanner scan = new Scanner(new File("src/eshaank_Level4/dictionary.txt"));
		while (scan.hasNextLine()) {
			String str = scan.nextLine();
			for (int i = 0; i < splits.size(); i++) {
				if (str.contains(splits.get(0)) && str.contains(splits.get(1)) && str.contains(splits.get(2))
						&& str.contains(splits.get(3)) && str.contains(splits.get(4)) && str.contains(splits.get(5))
						&& str.length() == word.length()) {
					JOptionPane.showMessageDialog(null , "" + str);
				}
			}

		}
	}
}