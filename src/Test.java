
public class Test {
	public static void main(String[] args) {
		if(args.length > 0 && args[0].equals("Test")) {
			System.out.println("Test");
			System.exit(0);
		}
		System.out.println("Hello Git");
		System.out.println("new line");
		test();
		newFeature();
	}
	
	public static void test() {
		System.out.println("test");
	}
	
	public static void newFeature() {
		System.out.println("new feature");
		System.out.println("...");
		System.out.println("new from master");
		System.out.println("new from testing");
	}
}
