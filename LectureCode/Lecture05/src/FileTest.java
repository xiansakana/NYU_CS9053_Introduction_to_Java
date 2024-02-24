import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		String workingDir = System.getProperty("user.dir");
		System.out.println("working directory: " + workingDir);
		File f = new File("data.txt");
		System.out.println("full path: " + f.getAbsolutePath());
		System.out.println("does this exist? "+ f.exists());
		System.out.println("is it a file?"+ f.isFile());
		System.out.println("is it a directory? "+ f.isDirectory());
		
		

	}

}
