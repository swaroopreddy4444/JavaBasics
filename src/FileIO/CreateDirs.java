package FileIO;

import java.io.File;
import java.io.IOException;

public class CreateDirs {

	public static void main(String[] args) throws IOException {

		String newdir = "."+File.separator+"parent_dir"+File.separator+"child_dir";
		
		File dir=new File(newdir);
		
		if(!dir.exists()) {
			dir.mkdirs();
			}
		System.out.println(dir.getAbsolutePath());	
		System.out.println(dir.getPath());	
		System.out.println(dir.getName());
	}

}
