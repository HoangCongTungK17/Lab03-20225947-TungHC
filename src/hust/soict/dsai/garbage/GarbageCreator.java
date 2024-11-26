package hust.soict.dsai.garbage;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
public class GarbageCreator {
	

	    public static void main(String[] args) {
	        String filename = "test.exe"; // Tên hoặc đường dẫn đến file thực thi
	        byte[] inputBytes = {};
	        long startTime, endTime;

	        try {
	            inputBytes = Files.readAllBytes(Paths.get(filename));
	        } catch (IOException e) {
	            e.printStackTrace();
	            return;
	        }

	        startTime = System.currentTimeMillis();
	        StringBuilder outputString = new StringBuilder();
	        for (byte b : inputBytes) {
	            outputString.append((char) b);
	        }
	        endTime = System.currentTimeMillis();

	        System.out.println(endTime - startTime);
	    }
	}

