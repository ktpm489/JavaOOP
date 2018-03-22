
public class Main {

	public static void main(String[] args) {
		
		SchoolTeacherStaff staff = new ScienceTeacher();
		staff.performOtherResponsibilities();
		
		SchoolTeacherStaff subTeacher = new SubstituteTeacher();
		subTeacher.performOtherResponsibilities();
	}

}
