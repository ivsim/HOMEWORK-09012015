package lecture_exec_3_student;

import java.util.HashMap;
import java.util.ArrayList;

public class Student {

	public String firstName;
	public String lastName;
	public int number;
	public HashMap<String, ArrayList<Integer>> marks;
	
	public Student(String firstName, String lastName, int number){
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
		setMarks();
				
	}
	
	public void setMarks(){
		this.marks = new HashMap<>();
	}
	
	public void addSubjectMark(String subject, ArrayList<Integer> mark){
		this.marks.put(subject, mark);
	}
	
	public void addSubjectMark(String subject, Integer mark){
		this.marks.get(subject).add(mark);
	}
	
	public Float calculateAverageMark(String subject){
		float temp = 0;
		for (Integer x: this.marks.get(subject)){
			temp = temp + (float)x;
		}
		Float average;
		average = temp / this.marks.get(subject).size();
		return average;
	}
	
	
}
