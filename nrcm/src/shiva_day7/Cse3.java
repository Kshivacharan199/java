package shiva_day7;
import java.io.File;
import java.io.*;
import java.util.Scanner;


public class Cse3 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File Obj=new File("C:\\Users\\shiva charan\\OneDrive\\Desktop\\jasva.txt");
		Scanner Reader=new Scanner(Obj);
		       while(Reader.hasNextLine()) {
		String data=Reader.nextLine();
		   System.out.println(data);
		    //throw new FileNotFoundException("file not seen");
	}
	Reader.close();
	}

}