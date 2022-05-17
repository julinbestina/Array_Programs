	public class ArrayOfNum {
		public static void main(String[] args) {
			int[] number = new int[10];
			for( int i = 0; i < 10; i++) {
				number[i] = i+1;
			}
			for( int i = 0; i < 10; i++) {
				System.out.println("index" +" " + i +" = " + number[i]);
			}
		}
	}
