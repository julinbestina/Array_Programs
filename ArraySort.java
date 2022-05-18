import java.util.Arrays;

	public  class ArraySort {
		public static void main(String[] args) {
			int[] num = { 45, 58, 98, 62, 75, 43, 29, 36, 18, 84};
			Arrays.sort(num);
			System.out.println("Sorted Array:");
			for( int i = 0; i < num.length; i++) {
				System.out.print(num[i] + " ");
			}
		}
	}
