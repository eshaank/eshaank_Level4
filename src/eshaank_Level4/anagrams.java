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
	String repeat;

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

		Scanner scan = new Scanner(new File("src/eshaank_Level4/dictionary.txt"));
		while (scan.hasNextLine()) {
			String str = scan.nextLine();

			if (containsChar(word, str) && str.length() == word.length()) {
				//System.out.println(str);
			}

		}
	}

	boolean containsChar(String word, String str) {

		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < splits.size(); j++) {
				if (splits.subList(j, j+1).equals(splits.subList(j+1, j+2))) {
					System.out.println("hi");
				}
					//System.out.println(repeat);
				}
			String letters = word.substring(i, i + 1);
			splits.add(word.substring(i, i + 1));
			if (!str.contains(letters)) {
				return false;
			}

		}
		return true;

	}
}