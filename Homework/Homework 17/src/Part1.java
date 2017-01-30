import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

public class Part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter Filename and format");
		Scanner input = new Scanner(System.in);
		String filename = input.nextLine();
		System.out.print("Enter text");
		String text = input.next();
		try(Writer writer = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(filename),"utf-8"))){
			writer.write(text);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
