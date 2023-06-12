package kh.lclass.helloworld;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HelloWorld {
	public static void main(String[] args) {
		String fileName = "HelloWorld.txt";

		try {
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write("HelloWorld");

			bw.close();
			fw.close();

			System.out.println("텍스트 파일이 생성되었습니다.");
		} catch (IOException e) {
			System.out.println("저장 실패");
			e.printStackTrace();

		}
	}
}
