package day0419;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

public class WordCount01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fname = args[0];
		File file = new File(fname);
		try {
			int count=0;
			FileInputStream fr = new FileInputStream(file);
			byte[] buffer = new byte[(int)file.length()];
			fr.read(buffer);
			String s = new String(buffer);
			String[] data = s.split(" ");
			ArrayList resultList = new ArrayList<String>();
			
			for(int i=0; i<data.length;i++) {
				if(!resultList.contains(data[i])) {
					resultList.add(data[i]+"");
					System.out.print(data[i]+" ");
					count++;
				}
				
			}
			System.out.println("화일의 단어 수는 "+count);
			fr.close();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
