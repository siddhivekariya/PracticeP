package Data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteTextFile {

	public static void main(String[] args) throws IOException {
		
				File f = new File("C:\\Users\\vekar\\Desktop\\Java\\testing\\temp.txt");
				f.createNewFile();
				
				
				FileWriter fw = new FileWriter(f);
				@SuppressWarnings("resource")
				BufferedWriter out = new BufferedWriter(fw);
				
				out.write("This is 1st line");
				out.newLine();                  
				out.write("This is 2nd line");
				out.newLine();  
				out.write("This is 3rd line");
				out.flush();
				
				FileReader r = new FileReader(f);
				@SuppressWarnings("resource")
				BufferedReader rd = new BufferedReader(r);
				
				String x;
				int i = 0;
				while((x=rd.readLine()) != null) {
					System.out.println(x);
					i++;
				}
				System.out.println("Number of lines"+i);
				
				
				
				

			}

	

}
