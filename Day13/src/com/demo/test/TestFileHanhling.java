package com.demo.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileHanhling {

	public static void main(String[] args) {
		File f = new File("myfile1.txt");
		FileOutputStream fos = null;
		try {
			if (f.exists()) {
				fos = new FileOutputStream("myfile1.txt", true);

			} else {
				fos = new FileOutputStream("myfile1.txt");
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		try (FileInputStream fis = new FileInputStream("C:\\Users\\IET\\Desktop\\250845920050\\JAVA\\Day13\\src\\myfile.txt"); FileOutputStream fos2 = fos;) {
			int i = fis.read();
			while(i!=-1) {
				fos.write(i);
				i=fis.read();
			}

		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
