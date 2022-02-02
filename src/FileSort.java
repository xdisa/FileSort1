import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class FileSort {

    private static String readUsingScanner(String fileName) throws IOException {
        Scanner scanner = new Scanner(Paths.get(fileName), StandardCharsets.UTF_8.name());

        String data = scanner.useDelimiter("\\A").next();
        scanner.close();
        return data;
    }


    public static void main(String[] args) throws IOException {

        String contents = readUsingScanner("C:\\Users\\disa\\Documents\\GitHub\\FileSort\\text.txt");
        String[] temp = new String[]{ contents };
        ArrayList<String> list = new ArrayList<String>();
        for(String sT:temp){
            String[] tempArray = sT.split(" ");
            for(String sA:tempArray){
                String str1 = sA.toLowerCase();
                list.add(str1);}
        }

        /*
        //read and write to array

        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\disa\\Documents\\GitHub\\FileSort\\text.txt"));
        String str;

        ArrayList<String> list = new ArrayList<String>();
        while ((str = reader.readLine()) != null) {
            if (!str.isEmpty()) {
                String str1 = str.toLowerCase();
                list.add(str1);
            }
        }
        */

        //System.out.println(list);

        TreeMap<String, Set<String>> map0 = new TreeMap<String, Set<String>>();
        Set<String> none0 = new HashSet<>();


        map0.put("e", new HashSet<>());
        map0.put("a", new HashSet<>());
        map0.put("u", new HashSet<>());
        map0.put("i", new HashSet<>());
        map0.put("o",new HashSet<>());
        map0.put("y", new HashSet<>());

        Map<String, ArrayList<String>> map2 = new TreeMap<String, ArrayList<String>>();
        ArrayList<String> none2 = new ArrayList<>();


        map2.put("q", new ArrayList<String>());
        map2.put("w", new ArrayList<String>());
        map2.put("r", new ArrayList<String>());
        map2.put("t", new ArrayList<String>());
        map2.put("y", new ArrayList<String>());
        map2.put("p", new ArrayList<String>());
        map2.put("s", new ArrayList<String>());
        map2.put("d", new ArrayList<String>());
        map2.put("f", new ArrayList<String>());
        map2.put("g", new ArrayList<String>());
        map2.put("h", new ArrayList<String>());
        map2.put("j", new ArrayList<String>());
        map2.put("k", new ArrayList<String>());
        map2.put("l", new ArrayList<String>());
        map2.put("z", new ArrayList<String>());
        map2.put("x", new ArrayList<String>());
        map2.put("c", new ArrayList<String>());
        map2.put("v", new ArrayList<String>());
        map2.put("b", new ArrayList<String>());
        map2.put("n", new ArrayList<String>());
        map2.put("m", new ArrayList<String>());



        for (String x : list) {


           int last = x.length() - 1;
           char ch = x.charAt(last);
           String s1 = String.valueOf(ch);
            switch (s1) {
                case "e", "a", "u", "i", "o" ->  map0.get(s1).add(x);
                case "q", "w", "r", "t", "p", "s", "d", "f", "g", "h", "j", "k" , "l", "z", "x", "c", "v", "b", "n", "m"->  map2.get(s1).add(x);
            }


        }
//Collections.reverse(list);

        //удаляю пустые мапы
for(String a : map0.keySet()) {

    if(map0.get(a)==none0){
        map0.remove(a);
    }
}
        for(String a : map2.keySet()) {

            if(none2 == map2.get(a)){
                map2.remove(a);
            }
        }

        System.out.println(map0);
        System.out.println(map2);


 }}