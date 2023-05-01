package IOStream;
import java.util.*;
import java.io.*;
import java.io.DataInputStream;
import java.lang.*;
public class StudentRecordReader {
  DataInputStream Datainput;  
  public StudentRecordReader (String inputFile) throws FileNotFoundException {
	 Datainput = new DataInputStream(new FileInputStream(inputFile));
}
  //data in byte
  public List<FormCreated>readAll()throws IOException{
	  List<FormCreated> listStudent = new ArrayList<>();
  try {
	  while(true) {
		  String name= Datainput.readUTF();
		  boolean gender =Datainput.readBoolean();
		  int age = Datainput.readInt();
		  float grade= Datainput.readFloat();
		  System.out.println("Name" + name);
		  FormCreated student = new FormCreated(name, gender, age, grade);
		  listStudent.add(student);
	  }
  }catch (Exception e) {
}
  Datainput.close();
  return listStudent;
  }
public static void main(String[] args) {
/*	if(args.length < 1) {
		System.out.println("please provide output file)");
        system.exit(0); }
*/ 
	String inputFile = "C:\\Users\\hp\\eclipse-workspace\\Wiley_core_java\\data.txt1";
	try { 
		StudentRecordReader reader = new StudentRecordReader(inputFile);
		List<FormCreated> ListOfStudents = reader.readAll();
		for(FormCreated student: ListOfStudents) {
			System.out.print(student.getName()+ "\t");
			System.out.print(student.isGender()+ "\t");
			System.out.print(student.getAge()+ "\t");
			System.out.print(student.getGrade());
		}		
	try {
		
	} catch (Exception ex) {
		ex.printStackTrace();
	}
	}
}
}