package backend;
import entity.Student;

public class ExerciseOne {
	public static void main(String[] args) {
		//Khởi tạo 3 học sinh
		Student[] list = new Student[3];
		list[0] = new Student(1, "Nguyễn Văn A");
		list[1] = new Student(2, "Nguyễn Văn B");
		list[2] = new Student(3, "Nguyễn Văn C");
		
		//Set trường đại học Bách Khoa
		Student.setCollege("Đại học Bách Khoa");
		
		//in ra thông tin các students
		for (int i = 0; i < 3; i++) {
			System.out.println(list[i].toString());
		}
		
		System.out.println("===============================");
		
		//Set trường đại học Công nghệ
		Student.setCollege("Đại học Công Nghệ");
		
		//in ra thông tin các students
		for (int i = 0; i < 3; i++) {
			System.out.println(list[i].toString());
		}
	}
}
