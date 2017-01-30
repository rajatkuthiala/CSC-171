import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class Part5 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String wordinlist="yes";
		System.out.print("Enter name of file to open: ");
		String file = input.nextLine();
		try{
			Scanner line = new Scanner(new File(file));
			List<String> words = new ArrayList<String>();
			while(line.hasNextLine()){
				words.add(line.nextLine());
			}
				System.out.println(words);
				System.out.print("Eneter word to lookup: ");
				String lookup = input.nextLine();
				
				for(int i = 0; i<words.size();i++){
					if(lookup.equalsIgnoreCase(words.get(i))){
						System.out.println("Word in list");
						wordinlist = "yes";
						break;
					}
					else{
						wordinlist="no";
					}
				}
				if(wordinlist.equalsIgnoreCase("no")){
					System.out.println("Word Not in List" );
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
