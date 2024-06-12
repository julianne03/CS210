package week2;

public class CommandLineArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// args: Run -> Run Configurations -> Arguments
		System.out.println("The number of parameters is " + args.length);
		System.out.println(args[0]);
		
		for (int i = 0; i < args.length; i++) {
			System.out.print("args[" + i + "]: " + args[i]);
			System.out.println();
		}
	}

}
