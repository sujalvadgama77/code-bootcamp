import java.io.*;

class FileIOWrite {
	public static void main(String[] args) {
		try {
			FileInputStream fi = new FileInputStream("Input_File.txt");
			FileOutputStream fo = new FileOutputStream("Output_File.txt");
			int res;

			System.out.println("Read Data from Input_File.txt\n");
			do {
				res = fi.read();
				if(res != -1) {
					System.out.print((char)res);
					fo.write(res);
				}
			} while(res != -1);
			
			System.out.println("\nWrote data into Output_File.txt file Successfully.\n");
			fi.close();
			fo.close();
		} catch(FileNotFoundException e) {
			System.out.println("Exception : " + e);
		} catch(IOException e) {
			System.out.println("Exception : " + e);
		}
	}
}
