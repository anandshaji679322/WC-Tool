import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class ccwc {
    public static void main(String[] args) {
        String fileName = args[1];
        int count = 0;
        switch (args[0]){
            case "-c":
                try(FileInputStream file = new FileInputStream(fileName)){
                    while (file.read() != -1){
                        count++;
                    }
                }catch (IOException e){
                    System.out.println(e.getMessage());
                }
                break;
            case  "-l":
                try(Scanner sc = new Scanner(new File(fileName))){
                    while (sc.hasNextLine()){
                        count++;
                        sc.nextLine();
                    }
                }catch (FileNotFoundException e){
                    System.out.println(e.getMessage());
                }
                break;
            case "-w":
                try(Scanner sc = new Scanner(new File(fileName))){
                    while (sc.hasNext()){
                        count++;
                        sc.next();
                    }
                }catch (FileNotFoundException e){
                    System.out.println(e.getMessage());
                }

        }
        System.out.println(count + " " + fileName);
    }
}