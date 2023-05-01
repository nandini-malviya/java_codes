package IOStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class FileStreams {
	public static void main(String[] args) throws IOException {
		/*FileOutputStream fout = new FileOutputStream("C:\\Users\\hp\\eclipse-workspace\\Wiley_core_java\\data\\data4.txt");
String str = "Wiley fullstack project";
byte[] b= str.getBytes();
fout.write(b);
fout.flush();
fout.close();*/
FileInputStream fin = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\Wiley_core_java\\data4.txt");
	int i=0;
	while((i=fin.read())!=1) {
		System.out.println((char)i);
	}
	fin.close();
	}

}
