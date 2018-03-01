public class RandomNumbers {

	public static void main(String[] args) {
		
		int[]numbers=new int[10];
		
		System.out.println("10 Random numbers from 0 to 50:\n");
		
		java.util.Random rand = new java.util.Random();
		
		for(int i=0; i<10; i++) {
		
			//int random = rand.nextInt(50)+1;
			
			int random = (int )(Math.random() * 50) + 1;
			
			numbers[i] = random;
			
			//System.out.println(numbers[i]);
		}
		
		for(int element : numbers) {
			System.out.println(element);
		}
	}

}
