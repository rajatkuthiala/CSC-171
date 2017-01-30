import java.util.Scanner;
import java.io.*;

public class Part4 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter name of file to open: ");
		String file = input.nextLine();
		try(BufferedReader reader = new BufferedReader(new FileReader(file))){
			String line;
			while((line = reader.readLine()) !=null){
				String[] text = line.split(",");
				int[] numbers = new int[text.length];
				for(int i=0; i< text.length;i++){
					numbers[i]= Integer.parseInt(text[i]);
				}
				int sum = 0;
				for(int i:numbers){
					sum+=i;
				}
				double average = sum/numbers.length;
				System.out.println(average);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
	}

}
