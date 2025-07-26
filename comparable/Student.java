package comparable;

public class Student implements Comparable<Student>{
	double gpa;
	String name;
	
	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
	}
	
	
	//Comparator is used to make custom sorting algo's while comparable is used to do the natural ordering in class
	
	//example if we have list<int> then it will directly know to sort the int but if we have list<student> then java won't understand with whom to sort
	
	@Override
	public int compareTo(Student o) {
		return Double.compare(o.gpa,this.gpa);
	}
}
