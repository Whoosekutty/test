import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		
		System.out.println("working");
		
		Map<String, String> env = System.getenv();
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		System.out.println(timeStamp);
		File file = new File("src/Excel/hello.txt"+timeStamp);
		
		FileWriter w = new FileWriter(file);
		for(String s : env.keySet()) {
			//System.out.println(s);
			//System.out.println(env.get(s));
			if(s.equals("date")) {
				//System.exit(1);
				w.append(s);
				w.append(env.get(s));
			}
			
		}
		System.out.println(file.getAbsolutePath());
		System.setProperty("Filename", file.getAbsolutePath());
		w.close();
	}

}
