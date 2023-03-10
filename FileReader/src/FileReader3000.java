import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReader3000 {

	public static void main(String[] args) throws IOException {
		
		File file  = new File("/Users/three/OneDrive/Documents/captmidn.txt");
		Scanner scan = new Scanner(file);

		
		
		String fileContent ="";
		while(scan.hasNextLine()) {
			fileContent = fileContent.concat(scan.nextLine() + "\n");
		}
		FileWriter Writer = new FileWriter("/Users/three/OneDrive/Documents/newfile.txt");
		Writer.write(fileContent);
		Writer.close();
	}	

}
