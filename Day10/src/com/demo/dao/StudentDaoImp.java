package com.demo.dao;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import com.demo.beans.Student;
import java.util.TreeSet;
import java.util.ArrayList;
public class StudentDaoImp implements StudentDao {
static Set<Student> eset;
static{
	eset =new HashSet<>();
	eset.add(new Student(1,"Babli",45,98,63,LocalDate.of(2005,02,12)));
	eset.add(new Student(5,"Pinky",15,28,9,LocalDate.of(2009,03,25)));
	eset.add(new Student(2,"Bablu",95,98,63,LocalDate.of(2006,05,31)));
	eset.add(new Student(9,"Mintu",65,98,83,LocalDate.of(2008,01,23)));
}

@Override
public boolean addStudentData(Student s) {

	return eset.add(s);
}

@Override
public Set<Student> displayStudentData() {
	// TODO Auto-generated method stub
	return eset;
}

@Override
public Student searchById(int id) {
	Optional<Student> op= eset.stream().filter(s->s.getSid()==id).findFirst();
	if(op.isPresent()) {
		 return op.get();
		 }
	return null;
}

@Override
public Set<Student> searchByName(String nm) {
	 Set<Student> op=eset.stream().filter(s->s.getSname().equals(nm)).collect(Collectors.toSet());
	 if(op.size()>0) {
		   return op;
	   }
		
	 return null;
}

@Override
public Student updateMarks(int id) {
	Student s = searchById(id);
	
	if(s != null) {
	 int sum =s.getM1()+s.getM2()+s.getM3();
	 float avg =( float)sum/3;
	 if(avg<30) {
		 return s;
	 }
	}
	return null;
	

}

@Override
public boolean deleteByid(int id) {
	
	return eset.remove(new Student(id));
}

@Override
public boolean deletdByname(String nm) {
	return eset.removeIf(e->e.getSname().equals(nm));
	
}

@Override
public Set<Student> sortById() {
	Set<Student> tset=new TreeSet<>();
	for(Student e:eset) {
		tset.add(e);
	}
	return tset;

}

@Override
public List<Student> sortByName() {
	Comparator<Student> c=(o1,o2)->{
		System.out.println("in name comparator "+o1.getSname()+"-----"+o2.getSname());
		return o1.getSname().compareTo(o2.getSname());
	};
	List<Student> elist=new ArrayList<>();
	for(Student  e:eset) {
		elist.add(e);
	}
	elist.sort(c);
	return elist;
}

@Override
public List<Student> sortByM1() {
	Comparator<Student> csal=(o1,o2)->{
		System.out.println("in sal comparator "+o1.getM1()+"-----"+o2.getM1());
		return (int)(o1.getM1()-o2.getM1());
	};
	List<Student> elist=new ArrayList<>();
	for(Student e:eset) {
		elist.add(e);
	}
	elist.sort(csal);
	return elist;
}


	
}
