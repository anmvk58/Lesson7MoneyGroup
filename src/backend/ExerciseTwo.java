package backend;

import entity.Student2;

public class ExerciseTwo {
	public static void main(String[] args) {
		final int x = 5;
		
		// tao ra 3 student
		Student2 student1 = new Student2(1, "Nguyễn Văn A");
		Student2 student2 = new Student2(2, "Nguyễn Văn B");
		Student2 student3 = new Student2(3, "Nguyễn Văn C");

		System.out.println("Tiền quỹ sau khi student tham gia lớp = " + Student2.getMoneyGroup());
		
		System.out.println("*********************");
		
		//Student thứ 1 lấy 50k đi mua bim bim, kẹo về liên hoan, kẹo về liên hoan
		System.out.println("Student thứ 1 lấy 50k đi mua bim bim, kẹo về liên hoan");
		student1.layTien(50);
		System.out.println("Tiền quỹ còn lại = " + Student2.getMoneyGroup());
		
		System.out.println("*********************");
		//Student thứ 2 lấy 20k đi mua bánh mì
		System.out.println("Student thứ 2 lấy 20k đi mua bánh mì");
		student2.layTien(20);
		System.out.println("Tiền quỹ còn lại = " + Student2.getMoneyGroup());
		
		System.out.println("*********************");
		//Student thứ 3 lấy 150k đi mua đồ dùng học tập cho nhóm
		System.out.println("Student thứ 3 lấy 150k đi mua đồ dùng học tập cho nhóm");
		student3.layTien(150);
		System.out.println("Tiền quỹ còn lại = " + Student2.getMoneyGroup());
		
		System.out.println("*********************");
		//cả nhóm mỗi người lại đóng quỹ mỗi người 50k
		System.out.println("Cả nhóm mỗi người lại đóng quỹ mỗi người 50k");
		student1.nopTien(50);
		student2.nopTien(50);
		student3.nopTien(50);
		System.out.println("Tiền quỹ còn lại = " + Student2.getMoneyGroup());
		
		System.out.println(Math.PI); 
	}
}
