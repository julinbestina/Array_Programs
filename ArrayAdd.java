
	public class ArrayAdd {
		public static void main(String[] args) {
			int[] num = new int[20];
			for( int i = 0; i < 20; i++) {
				num[i] = i+1;
			}
			int add = 0;
			for( int i = 0; i < 20; i++) {
				add += i;
			}
			System.out.println("Addition of given numbers = "+ add);
		}
	}
