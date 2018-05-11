package eshaank_Level4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class anagrams {
	ArrayList <String> check = new ArrayList <String>();
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
		String word = JOptionPane.showInputDialog("Type a word");
		// System.out.println(word);

		Scanner scan = new Scanner(new File("src/eshaank_Level4/dictionary.txt"));
		while (scan.hasNextLine()) {
			String str = scan.nextLine();
			if (str.length() == word.length()) {
			//	System.out.println(word.length());
			//	System.out.println(str);
				for (int i = 0; i < word.length(); i++) {
					if (str.substring(i, word.length()-1) == word.substring(i)) {
						check.add(str);
						System.out.println(check);
						//System.out.println(str);
					
				}
				}
					

			}

		}

	}
}
