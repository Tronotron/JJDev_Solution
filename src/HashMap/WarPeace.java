import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WarPeace {

    private static final String wordSearch = "he";
    public static int counter = 0;

    public static void main(String[] args) {
        File file = new File("wp.txt");
        HashMap<Integer, List<String>> dictionary = new HashMap<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                String line = scanner.nextLine();
                String[] sentence = line.split(" ");
                for (String s: sentence) {
                    if (wordSearch.equals(s)){
                        counter++;
                    }
                    if (dictionary.containsKey(s.length())){
                        List<String> list = dictionary.get(s.length());
                        list.add(s);
                    } else {
                        List<String> list = new ArrayList<>();
                        list.add(s);
                        dictionary.put(s.length(), list);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("file Off");
        }
        System.out.println("count of word " + counter);
        Set<Integer> integerSet = dictionary.keySet();
        for (Integer i: integerSet) {
            List<String> list = dictionary.get(i);
            System.out.println(i);
            for (String f: list) {
                System.out.println(f);
            }
        }
    }
}
