
public class JavaWeek10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter tailCount,headCount;
		tailCount = new Counter();
		headCount = new Counter();
		
		for(int flip = 0; flip < 100 ; flip++) {
			if(Math.random() < 0.5) {
				headCount.increment();
			}else {
				tailCount.increment();
			}
		}
		
		System.out.println("There were " + headCount.getValue() + " heads.");
		System.out.println("There were " + tailCount.getValue() + " tails.");
		
	}

}

class Counter{
	
	private int cValue = 0;
			
	public void increment() {
		cValue++;
	}
	
	public int getValue() {
		return cValue;
	}
}
