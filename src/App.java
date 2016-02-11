
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File ("text.txt");
		BufferedReader br = null;
		
		try {
			FileReader fr = new FileReader(file);
			br = new BufferedReader(fr);
						
			String line;
				while((line = br.readLine())!= null){
				System.out.println(line);
			}
			///Java 7 can simply this part.
				
				
				
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + file.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to read file: "+ file.toString());
		}
		finally {
			System.out.println("ThankYou");
			
			try {
				br.close();
			} catch (IOException e) {
				System.out.println("Cant Close File: " + file.toString());
			}
			catch (NullPointerException ex){
				//Thrown because file was never opened. 
			}
			
			
			
		}
		
		
		
	}

}
