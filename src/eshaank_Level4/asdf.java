package eshaank_Level4;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class asdf {
public static void main(String[] args) {
Checkword();
}
public static boolean Checkword() {
	String randomString = "iceman";
	String word = "dog";
	{
		for (int i = 0; i < word.length(); i++) {
			if (randomString.contains(word.substring((i)))) {
				System.out.println("true");
				return true;

			}
		}
		System.out.println("false");
		return false;
		
	}
}
}
