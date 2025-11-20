package com.demo.dao;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import com.demo.beans.Student;

public class StudentDaoImpl implements StudentDao {
	static List<Student> slt;
	static {
		slt = new ArrayList<>();
	}

	@Override
	public void readData(String string) {
		File f = new File(string);
		if(f.exists()) {
			try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(string));){
			   while(true) {
				  Student e=(Student)ois.readObject();
				   slt.add(e);
			   }
				
				
			} catch(EOFException e) {
				System.out.println("Reached to end of file");
				
				
			}catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
			} catch (IOException e) {
				System.out.println(e.getMessage());
			} catch (ClassNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("size: "+slt.size());
	}

	@Override
	public boolean save(Student s) {
		return slt.add(s);
	}

	@Override
	public boolean deleteById(int sid) {

		return slt.remove(new Student(sid));
	}

	@Override
	public boolean updateById(int sid, int marks) {
		int pos = slt.indexOf(new Student(sid));
		if (pos != -1) {

			slt.get(pos).setMarks(marks);

			return true;
		}
		return false;
	}

	@Override
	public List<Student> displayAll() {

		return slt;
	}

	@Override
	public Student display(int sid) {
		int pos = slt.indexOf(new Student(sid));
		if (pos != -1) {
			return slt.get(pos);
		}
		return null;

	}

	@Override
	public void writeData(String string) {

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(string))) {
			for (Student s : slt) {
				oos.writeObject(s);
			}
		} catch (FileNotFoundException e) {
		
			System.out.println(e.getMessage());
		} catch (IOException e) {
		
			System.out.println(e.getMessage());
		}
	}

}
