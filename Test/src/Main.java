import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("working");
		
		Map<String, String> env = System.getenv();
		
		for(String s : env.keySet()) {
			System.out.println(s);
			System.out.println(env.get(s));
		}

	}

}
