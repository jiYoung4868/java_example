package kh.lclass.helloworld;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HelloWorldLoad {
	public static void main(String[] args) {
		String fileName = "HelloWorld.txt";

		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);

			String line;

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
			fr.close();
		} catch (IOException e) {
			System.out.println("로드 실패");
			e.printStackTrace();
		}

	}
}
