package week2;

public class clsFormulateMethods {

	private static void Startup() {
		// Startup procedure
		System.out.println("Start engine");
		System.out.println("Untie from buoy");
		System.out.println("Move into forward gear");
		System.out.println("Acclerate");
		System.out.println("Cruise North");
		System.out.println("Cruise Northeast");
		System.out.println("Accelerate");
	}

	private static void SafetyCheck() {
		// Safety check
		System.out.println("Check Starboard");
		System.out.println("Check Port");
		System.out.println("Check speed");
		System.out.println("Check fuel level");
		System.out.println("Check temperature level");
		System.out.println("Check for debris in water");
		System.out.println("Cruise Northeast");
	}

	private static void MonitorBoatTraffic() {
		// Monitor boat traffic
		System.out.println("Check VHF channel 16");
		System.out.println("Check for navigational lights");
		System.out.println("Listen for fog horns");
		System.out.println("Cruise Northwest");
	}

	private static void Shutdown() {
		// Shutdown boat and moor
		System.out.println("Secure boat to buoy");
		System.out.println("Turn off motor");
		System.out.println("Turn off electrical");
		System.out.println("Lock boat motor");
	}

	public static void main(String[] args) {
		Startup();
		SafetyCheck();
		SafetyCheck();
		MonitorBoatTraffic();
		SafetyCheck();
		MonitorBoatTraffic();
		SafetyCheck();
		Shutdown();
	}

}
