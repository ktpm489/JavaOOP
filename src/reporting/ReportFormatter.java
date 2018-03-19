package reporting;

public class ReportFormatter {

	String formatterOutput;
	public ReportFormatter(Object object, FormatType formatType) {
		switch (formatType) {
		case XML:
			formatterOutput = convertObjectToXML(object);
			break;
		case CSV:
			formatterOutput = convertObjectToCSV(object);
			break;
		}
	}
	private String convertObjectToCSV(Object object) {
		// TODO Auto-generated method stub
		return "CSV : ,,,,," + object.toString() + ",,,,,,";
	}
	private String convertObjectToXML(Object object) {
		return "XML : ,,,,," + object.toString() + ",,,,,,";
	}
	
	protected String getFormattedValue() {
		return formatterOutput;
	}
	
}
