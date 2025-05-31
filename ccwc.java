import java.io.*;
import java.util.Scanner;

public class ccwc {
    static int findByteCountFile(String fileName) throws IOException {
        int count = 0;
        try (FileInputStream file = new FileInputStream(fileName)) {
            while (file.read() != -1) {
                count++;
            }
        }
        return count;
    }
    static  int findLineCountFile(String fileName) throws  FileNotFoundException{
        int count =0;
        try(Scanner sc = new Scanner(new File(fileName))){
            while (sc.hasNextLine()){
                count++;
                sc.nextLine();
            }
        }
        return count;
    }
    static  int wordCountFile(String fileName)throws  FileNotFoundException {
        int count = 0;
        try (Scanner sc = new Scanner(new File(fileName))) {
            while (sc.hasNext()) {
                count++;
                sc.next();
            }

        }
        return count;
    }
    static int findCharacterCountFile(String fileName)throws IOException{
        int count=0;
        try(FileReader fl = new FileReader(fileName)){
            while (fl.read()!=-1){
                count++;
            }
        }
        return count;
    }

    static int findByteCount() throws IOException {
        int count = 0;
            while (System.in.read() != -1) {
                count++;
            }
        return count;
    }
    static  int findLineCount() throws  FileNotFoundException{
        int count =0;
        try(Scanner sc = new Scanner(System.in)){
            while (sc.hasNextLine()){
                count++;
                sc.nextLine();
            }
        }
        return count;
    }
    static  int wordCount()throws  FileNotFoundException {
        int count = 0;
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNext()) {
                count++;
                sc.next();
            }

        }
        return count;
    }
    static int findCharacterCount(Reader input)throws IOException{
        int count=0;
            while (input.read()!=-1){
                count++;
            }
        return count;
    }

    public static void main(String[] args) throws IOException {

        try{
            if(args.length == 1){
                switch (args[0]){
                    case "-c":
                        System.out.println("stdin"+" "+ findByteCount());
                        break;
                    case  "-l":
                        System.out.println("stdin"+" "+ findLineCount());
                        break;
                    case "-w":
                        System.out.println("stdin"+" "+ wordCount());
                        break;
                    case "-m":
                        System.out.println("stdin"+" "+ findCharacterCount(new InputStreamReader(System.in)));
                        break;
                    default:
                        System.out.println("Invalid Flag -c, -w, -l, or -m");

                }
            }else if(args.length == 2){
                String fileName = args[1];
                int count = 0;
                switch (args[0]){
                    case "-c":
                        System.out.println(fileName+" "+ findByteCountFile(fileName));
                        break;
                    case  "-l":
                        System.out.println(fileName+" "+ findLineCountFile(fileName));
                        break;
                    case "-w":
                        System.out.println(fileName+" "+ wordCountFile(fileName));
                        break;
                    case "-m":
                        System.out.println(fileName+" "+ findCharacterCountFile(fileName));
                        break;
                    default:
                        System.out.println("Invalid Flag -c, -w, -l, or -m");

                }
            }else {
                System.out.println("Usage: java ccwc [option] filename");
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}