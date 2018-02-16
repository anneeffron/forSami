import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
//12.15
public class writeFile {

	public static void main(String[] args) throws FileNotFoundException {
	
		java.io.File file = new java.io.File("Exercise12_15.txt");
		if (file.exists()) {
			System.out.println("File already exists");
			System.exit(1);
		}
		java.io.PrintWriter output = new java.io.PrintWriter(file);
		int num = 0;
		for (int i = 0; i <=100; i ++) {
			num = (int) (Math.random() *100 ) +1;
			output.print(num + " ");
			
		}
		output.close();
		
		ArrayList<Integer> numList = new ArrayList<>();
		Scanner input = new Scanner(file);
		while(input.hasNext()) {
			int number = input.nextInt();
			numList.add(number);
		}
		
		java.util.Collections.sort(numList);
		
		for (int i = 0; i < numList.size(); i++) {
			System.out.print(numList.get(i) + "\n");
		}
		
		// TODO Auto-generated method stub

	}

}
