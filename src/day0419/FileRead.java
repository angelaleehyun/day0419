package day0419;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname = args[0];
		String fname2 = args[1];
		try {
		FileInputStream fr = new FileInputStream(fname);
		FileOutputStream fw = new FileOutputStream (fname2);
		int a;
		byte[] buffer = new byte[512];
		a = fr.read(buffer);
		while(a != -1) {
			fw.write(buffer,0,a);
			System.out.println(a);
		}
		fr.close();
		fw.close();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
