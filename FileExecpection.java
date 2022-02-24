package New1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExecpection {
	public static void main(String[] args) throws IOException,FileNotFoundException {
		
		FileWriter fw = new FileWriter("CopySample.txt");
		FileReader fr = new FileReader("4Sample.txt");
		int i=0;
		while((i=fr.read())!=-1) {
			char j=(char)i;
			fw.write(j);
		}
		fr.close();
		fw.close();
	}

}
