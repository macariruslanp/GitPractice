
public class Test {
	public static void main(String[] args) {
		if(args.length > 0 && args[0].equals("Test")) {
			System.out.println("Test");
			System.exit(0);
		}
		System.out.println("Hello Git");
		System.out.println("new line");
		newFeature();
	}
	
	public static void newFeature() {
		String arr[] = {"Test"};
		Test test = new Test();
		test.main(arr);
	}
}
