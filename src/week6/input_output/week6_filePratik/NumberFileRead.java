package week6.input_output.week6_filePratik;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class NumberFileRead {
    public static void main(String[] args) {


        try{
            // fileReader used
            FileReader fileReader = new FileReader("number.txt");
            // buffreader used
            BufferedReader bufferedReader = new BufferedReader(fileReader);



            String i = bufferedReader.readLine();
            int flag = 0;
            while (i != null) {
                // string-- > integer with ParseInt
                int num = Integer.parseInt(i);
                System.out.println(num);
                i = bufferedReader.readLine();
                flag += num;
            }
            System.out.println("Total number : " +  flag);

            fileReader.close();
            bufferedReader.close();
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
