import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Random;
import java.util.Scanner;

public class Part3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter Filename and format: ");
		Scanner input = new Scanner(System.in);
		String filename = input.nextLine();
		try(Writer writer = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(filename),"utf-8"))){
			System.out.println("Enter Random number: ");
			int random = input.nextInt();
			for(int i=0; i<random ;i++){
				Random ran = new Random();
				int randomnumber = ran.nextInt(1001)+0; 
				writer.write(Integer.toString(randomnumber)+",");
				}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
