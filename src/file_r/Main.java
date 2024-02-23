package file_r;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {
	
	private static final String FILE = Main.class.getResource("/data.txt").getFile();
	private static final String FILE2 = Main.class.getResource("/file_r/data.txt").getFile();
	
	public static void main(String[] args) throws IOException {
		
		String result = processFileLimited(FILE);
	    System.out.println(result);
	    System.out.println("--------------");
		
	    String result2 = processFileLimited(FILE2);
	    System.out.println(result);
	}
	public static String processFileLimited(String x) throws IOException {
	    try (BufferedReader br = new BufferedReader(new FileReader(x))) {
	      return br.readLine();
	    }
	  }
	

}
