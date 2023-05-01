package IOStream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import IOStream.FormCreated; 

public class StudentRecordOutput {
	DataOutputStream dataOutput;
	
	public StudentRecordOutput(String outputFile) throws IOException {
		
		dataOutput = new DataOutputStream(new FileOutputStream(outputFile));
	}
	
	public void writer(FormCreated student) throws IOException {
		dataOutput.writeUTF(student.getName());
		dataOutput.writeBoolean(student.isGender());
		dataOutput.writeInt(student.getAge());
		dataOutput.writeFloat(student.getGrade());
	}
	
	public void save() throws IOException {
		dataOutput.close();
	}
	
	
	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("Please provide output file");
			System.exit(0);
		}
		
		String outputfile = args[0];
		
		List<FormCreated> listStudent = new ArrayList<>(); 
		
		listStudent.add(new FormCreated("Nandini", false, 21, 95.1f));
		listStudent.add(new FormCreated("Vanshu", false, 21, 94.5f));
		listStudent.add(new FormCreated("Avinash", true, 18, 93.1f));
		listStudent.add(new FormCreated("Avi", true, 19, 92.1f));
		
		try {
			StudentRecordOutput outputWriter = new StudentRecordOutput(outputfile);
			
			for(FormCreated student: listStudent) {
				outputWriter.writer(student);
			}
			
			outputWriter.save();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}





