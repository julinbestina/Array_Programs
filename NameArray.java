import java.util.Scanner;

	public class  NameArray {
		public static void main(String[] args) {
			String[] name = new String[5];
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter 5 names:");
			for ( int i = 0; i < name.length; i++) {
				name[i] = scanner.nextLine();
			}
			for( int i = 0; i < name.length; i++) {
				System.out.println("Hi " + name[i]);
			}
		}
	}
