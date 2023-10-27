import java.io.*;

class FileIOByteStreamClass {
	public static void main(String[] args) {
		try {
			FileOutputStream fo = new FileOutputStream("NewFile.txt");
			System.out.println("NewFile.txt Created Successfully\n");
			fo.close();
		} catch(FileNotFoundException e) {
			System.out.println("Exception : " + e);
		} catch(IOException e) {
			System.out.println("Exception : " + e);
		}
	}
}
