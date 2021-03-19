import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		
		System.out.println("working");
		
		Map<String, String> env = System.getenv();
		
		File file = new File("./h/");
		if(!file.exists()) {
			file.mkdirs();
		}
		FileWriter w = new FileWriter(file);
		for(String s : env.keySet()) {
			System.out.println(s);
			System.out.println(env.get(s));
			if(s.equals("date")) {
				//System.exit(1);
				w.append(s);
				w.append(env.get(s));
			}
			
		}
		w.close();
	}

}
