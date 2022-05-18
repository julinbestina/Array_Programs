
	public class ArraySortWithLoop {
		public static void main(String[] args) {
			int[] num = {56, 28, 53, 13, 43, 87, 68, 76, 56, 16};
			System.out.println("Sorted Array:");
			for( int i = 0; i < num.length; i++) {
				for( int j = i+1; j < num.length; j++) {
					int temp = 0;
					if( num[i] > num[j]) {
						temp = num[i];
						num[i] = num[j];
						num[j] = temp;
					}
				}
				System.out.print(num[i] + " ");
			}
		}
	}
