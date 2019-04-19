package day0419;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator;

public class WordCountMap02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
				String fname = args[0];
				File file = new File(fname);
				HashMap m = new HashMap();
				try {
					
					FileInputStream fr = new FileInputStream(file);
					byte[] buffer = new byte[(int)file.length()];
					fr.read(buffer);
					String s = new String(buffer);
					String[] data = s.split(" ");

					
					for(int i=0; i<data.length;i++) {
							int cnt =1;
							if(m.containsKey(data[i])) {
								cnt = (int) m.get(data[i])+1;
							}

							m.put(data[i], cnt);
					}

					Iterator keys = m.keySet().iterator();
					while(keys.hasNext())
					{
						String key = (String) keys.next();
						Integer value = (Integer) m.get(key);
						System.out.println(key + "\t"+value);
					}
					System.out.println("화일의 단어 수는 "+m.size());
					fr.close();
				}catch(Exception ex) {
					System.out.println(ex.getMessage());
				}
				
				
			}

		}
