
public class ScienceTeacher extends SchoolTeacherStaff implements CourseInstructor{

	@Override
	public void teach() {
	System.out.println("Taught Science");
		
	}
	@Override
	public void performOtherResponsibilities() {
		super.performOtherResponsibilities();
		System.out.println("Override performOtherResponsibilities");
	}

}
