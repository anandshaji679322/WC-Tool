import java.io.*;
import java.util.Scanner;

public class ccwc {
    static int findByteCount(String fileName) throws IOException {
        int count = 0;
        try (FileInputStream file = new FileInputStream(fileName)) {
            while (file.read() != -1) {
                count++;
            }
        }
        return count;
    }
    static  int findLineCount(String fileName) throws  FileNotFoundException{
        int count =0;
        try(Scanner sc = new Scanner(new File(fileName))){
            while (sc.hasNextLine()){
                count++;
                sc.nextLine();
            }
        }
        return count;
    }
    static  int wordCount(String fileName)throws  FileNotFoundException {
        int count = 0;
        try (Scanner sc = new Scanner(new File(fileName))) {
            while (sc.hasNext()) {
                count++;
                sc.next();
            }

        }
        return count;
    }
    static int findCharacterCount(String fileName)throws IOException{
        int count=0;
        try(FileReader fl = new FileReader(fileName)){
            while (fl.read()!=-1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) throws IOException {

        if(args.length == 1){
            System.out.println(findByteCount(args[0]) + " " + findLineCount(args[0]) + " " + wordCount(args[0]) + " " + findCharacterCount(args[0]) + " "+args[0]);
        }else if(args.length == 2){
            String fileName = args[1];
            int count = 0;
            switch (args[0]){
                case "-c":
                    System.out.println(fileName+" "+ findByteCount(fileName));
                    break;
                case  "-l":
                    System.out.println(fileName+" "+ findLineCount(fileName));
                    break;
                case "-w":
                    System.out.println(fileName+" "+ wordCount(fileName));
                    break;
                case "-m":
                    System.out.println(fileName+" "+ findCharacterCount(fileName));
                    break;
                default:
                    System.out.println("Invalid Flag -c, -w, -l, or -m");

            }
        }else {
            System.out.println("Usage: java ccwc [option] filename");
        }
    }
}