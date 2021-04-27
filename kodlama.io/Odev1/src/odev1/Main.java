package odev1;

public class Main {

	public static void main(String[] args) {
		
		Courses course1 = new Courses("C# + Angular", 
				"3 ayda sıfırdan yazılım geliştirici yetiştirme kursu",
				"Engin Demiroð", 0, "%100");
		
		Courses course2 = new Courses("Java + React",
				"2 ayda sıfırdan yazılım geliştirici yetiştirme kursu",
				"Engin Demiroð",0,"%24");
		
		Courses course3 = new Courses("Basic Course for Introduction to Programming",
				"PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantığını anlaşılır örneklerle öğrenin",
				"Engin Demiroð",0,"%100");
		
		Courses[] courses = {course1,course2,course3};
		
		for(Courses course : courses) {
			System.out.println(course.name);
			System.out.println(course.detail);
			System.out.println("Price is : "+course.price);
			System.out.println(course.teacher);
			System.out.println(course.progress);
			System.out.println("-----------------");

	}
		
		Category category1 = new Category();
		category1.type = "Programming";
		
		
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse("C# + Angular");
		courseManager.deleteCourse(course2);
		

	}
}
