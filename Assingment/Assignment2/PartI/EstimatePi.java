
public class EstimatePi {

	
	public static int estimatePi() {
		int iterations = 0;

		double sum = 0.0;
		while(true) {
			sum += 1.0 / ((iterations + 1) * (iterations + 1) );
			double piEstimate = Math.sqrt(sum * 6);
			iterations++;
			
			if (Math.abs(piEstimate - Math.PI) < 0.0001 ) {
				System.out.println("Pi is estimated as " + piEstimate + " after " + iterations + " iterations");
				break;
			}
			
		}
		return iterations;
		
	}
	
	public static void main(String[] args) {	
		estimatePi();
	}
	
}
