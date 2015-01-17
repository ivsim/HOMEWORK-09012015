package lecture_exec_3_student;

import java.util.Arrays;
import java.util.ArrayList;

public class Register {

	public static void main(String[] args) {

		Student pesho = new Student("Petyr", "Dojchinov", 23);
		Student ivo = new Student("Ivo", "Simeonov", 13);
		Student jana = new Student("Jana", "Ivanova", 32);
		
		pesho.addSubjectMark("Biology", new ArrayList<>(Arrays.asList(2, 6, 6, 4)));
		pesho.addSubjectMark("Math", new ArrayList<>(Arrays.asList(6, 6, 6)));
		pesho.addSubjectMark("Literature", new ArrayList<>(Arrays.asList(4, 6, 3, 4)));
		pesho.addSubjectMark("Chemistry", new ArrayList<>(Arrays.asList(4, 5, 6, 4)));
		pesho.addSubjectMark("Physics", new ArrayList<>(Arrays.asList(6, 6, 3, 3)));
		
		ivo.addSubjectMark("Biology", new ArrayList<>(Arrays.asList(2, 3, 6, 4)));
		ivo.addSubjectMark("Math", new ArrayList<>(Arrays.asList(5, 6, 6)));
		ivo.addSubjectMark("Literature", new ArrayList<>(Arrays.asList(4, 5, 3, 3)));
		ivo.addSubjectMark("Chemistry", new ArrayList<>(Arrays.asList(4, 5, 6, 4)));
		ivo.addSubjectMark("Physics", new ArrayList<>(Arrays.asList(6, 6, 3, 3)));
		
		jana.addSubjectMark("Biology", new ArrayList<>(Arrays.asList(5, 6, 6, 5)));
		jana.addSubjectMark("Math", new ArrayList<>(Arrays.asList(6, 6, 4)));
		jana.addSubjectMark("Literature", new ArrayList<>(Arrays.asList(4, 6, 4, 4)));
		jana.addSubjectMark("Chemistry", new ArrayList<>(Arrays.asList(4, 2, 6, 4)));
		jana.addSubjectMark("Physics", new ArrayList<>(Arrays.asList(6, 5, 5, 6)));
		
		System.out.printf("Average %s grade of %s %s: %.2f%n", "Biology", pesho.firstName, pesho.lastName, pesho.calculateAverageMark("Biology"));
		System.out.printf("Average %s grade of %s %s: %.2f%n", "Math", ivo.firstName, ivo.lastName, ivo.calculateAverageMark("Math"));
		System.out.printf("Average %s grade of %s %s: %.2f%n", "Physics", jana.firstName, jana.lastName, jana.calculateAverageMark("Physics"));
		
		
		
		
	}

}
