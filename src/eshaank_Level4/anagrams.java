package eshaank_Level4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class anagrams {
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
		while(scan.hasNextLine()) {
			String str = scan.nextLine();
			if (str.length() == word.length() && str.matches(word)) {
				System.out.println(word.length());
				System.out.println(str);
			}
			
		}

	}
}
