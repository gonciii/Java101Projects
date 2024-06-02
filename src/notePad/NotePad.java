package notePad;

import java.io.*;
import java.util.Scanner;

public class NotePad {
    public static void main(String[] args) {

        // kullanıcıdan metin girmesin iste :
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text : ");
        String text = scanner.nextLine();


        String path= "C:\\Users\\MONSTER\\IdeaProjects\\java101\\src\\notePad\\notes.txt";

        try {
            // notes.txt dosyası oku
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String readerText = bufferedReader.readLine();
            bufferedReader.close();

            if (readerText != null) {
                System.out.println("Previous text : " + readerText);
            } else {
                System.out.println("Previous text is empty !");
            }

            // notes.txt dosyasına metin yaz
            FileWriter fileWriter = new FileWriter(path);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(text);
            printWriter.close();


        }catch (IOException exception) {
            System.out.println("Exception Warning : " + exception.getMessage());
        }
    }
}
