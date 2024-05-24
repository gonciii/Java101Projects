package week5.mostRepeatedWord;


import java.util.HashMap;
import java.util.Scanner;

public class MostRepeatedWord {
    public static String mostRepeated(String text) {

        //hashMap
        HashMap<String,Integer> hashMap = new HashMap<>();

        // metindeki kelimeleri ayırıp ve küçük harfe dönüştürür,
        // noktalama işaretlerini boşluk karakteriyle değiştirir.
        String[] words = text.replaceAll("[^\\p{L}\\s]", " ").toLowerCase().split("\\s+");
        for(String s : words) {
            int count = hashMap.getOrDefault(s,0);
            hashMap.put(s,count+1);
        }
        System.out.println(hashMap);

        String mostRepeatedWord = "";
        int countMaxWord =0;
        for(String word: hashMap.keySet()) {
            int counter = hashMap.get(word);
            if(counter > countMaxWord) {
               countMaxWord = counter;
               mostRepeatedWord = word;
            }
        }
        return mostRepeatedWord;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Metin ifadesi giriniz : ");
        String text = scanner.nextLine();

        String mostRepeatedWord = mostRepeated(text);
        System.out.println("En çok tekrar eden kelime  : " + mostRepeatedWord);
    }

}

