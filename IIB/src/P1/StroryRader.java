package P1;

import java.io.BufferedReader;
import java.io.FileReader;

public class StroryRader {

	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader("bahubali.txt");
			BufferedReader br=new BufferedReader(fr);
			String story="";
			while((story=br.readLine())!=null) {
				System.out.println(story);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
