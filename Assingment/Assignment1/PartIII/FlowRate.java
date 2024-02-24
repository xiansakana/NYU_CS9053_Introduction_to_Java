public class FlowRate {

	public static double calculateFlowRate(double radius, double length, double dyanmicViscosity, double pressureChange, double eta) {

		double pi = Math.PI;
		double flowRate = 1000 * pressureChange * pi * radius * radius * radius * radius / 8 / eta / length;
		return flowRate;
	}
	
	public static void main(String[] args) {
		double radius = .0127;
		double length = 5;
		double eta = 8.9E-4;
		double pressureChange = 22000;
		double dyanmicViscosity = 8.9E-4;
		
		double flowRate = calculateFlowRate(radius, length, dyanmicViscosity, pressureChange, eta);
		System.out.println("The flow rate in liters/sec is: " + flowRate);

	}
}