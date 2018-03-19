package reporting;

public class EmployeeReportFormatter extends ReportFormatter {

	public EmployeeReportFormatter(Object object, FormatType formatType) {
		super(object, formatType);
		// TODO Auto-generated constructor stub
	}
	
	public String getFormattedEmployee() {
		return getFormattedValue();
	}

}
