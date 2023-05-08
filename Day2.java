import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class Day2 {
	public static void main(String[] args) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		int[] chars = new int[26];
		int triplets = 0;
		int doubles = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader("input.txt"));
			String line;
			while ((line = br.readLine()) != null) {
				Arrays.fill(chars, 0);
				for (int i = 0; i < line.length(); i++) {
					char c = line.charAt(i);
					chars[alphabet.indexOf(c)]++;
				}
				boolean doubleInstance = false;
				boolean tripletInstance = false;
				for (int numberOfInstances : chars) {
					if (numberOfInstances == 2) {
						doubleInstance = true;
					}
					if (numberOfInstances == 3) {
						tripletInstance = true;
					}
				}
				doubles += doubleInstance ? 1 : 0;
				triplets += tripletInstance ? 1 : 0;
			}
			System.out.println(doubles * triplets);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}