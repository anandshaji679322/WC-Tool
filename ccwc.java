import java.io.FileInputStream;
import java.io.IOException;

public class ccwc {
    public static void main(String[] args) {
        if("-c".equals(args[0])){
            String fileName = args[1];
            try(FileInputStream file = new FileInputStream(fileName)){
                int count=0;
                while (file.read() != -1){
                    count++;
                }
                System.out.println(count +" "+ fileName);
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
}


