package odev1;

public class CourseManager {
	public void addCourse(String course) {
		System.out.println("Kurs eklendi : " + course);
	}
	

	public void deleteCourse(Courses course) {
		System.out.println("Kurs silindi : " + course.name);
	}
}