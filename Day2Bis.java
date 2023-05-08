import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Day2Bis {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            List<String> allTheStrings = new ArrayList<String>();

            String line;
            while ((line = br.readLine()) != null) {
                allTheStrings.add(line);
            }

            Iterator<String> iterator1 = allTheStrings.iterator();
            Iterator<String> iterator2;
            String correctBoxId = "";

            firstLineWhile: while (iterator1.hasNext()) {
                String line1 = iterator1.next();
                iterator2 = allTheStrings.iterator();

                secondLineWhile: while (iterator2.hasNext()) {
                    Boolean differenceFounded = false;
                    String line2 = iterator2.next();
                    for (int i = 0; i < line1.length(); i++) {
                        char c1 = line1.charAt(i);
                        char c2 = line2.charAt(i);

                        if (c1 != c2) {
                            if (differenceFounded) {
                                continue secondLineWhile;
                            }
                            differenceFounded = true;

                        }
                    }

                    if (differenceFounded) {
                        for (int i = 0; i < line1.length(); i++) {
                            char c1 = line1.charAt(i);
                            char c2 = line2.charAt(i);

                            if (c1 == c2) {
                                correctBoxId += c1;

                            }
                        }
                        break firstLineWhile;
                    }

                }
            }
            System.out.println(correctBoxId);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
