import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class ccwc {
    public static void main(String[] args) {
        String fileName = args[1];
        switch (args[0]){
            case "-c":
                try(FileInputStream file = new FileInputStream(fileName)){
                    int count=0;
                    while (file.read() != -1){
                        count++;
                    }
                    System.out.println(count +" "+ fileName);
                }catch (IOException e){
                    System.out.println(e.getMessage());
                }
                break;
            case  "-l":
                int count = 0;
                try {
                    Scanner sc = new Scanner(new File(fileName));
                    while (sc.hasNextLine()){
                        count++;
                        sc.nextLine();
                    }
                }catch (FileNotFoundException e){
                    System.out.println(e.getMessage());
                }
                System.out.println(count + " " + fileName);
                break;
        }
    }
}