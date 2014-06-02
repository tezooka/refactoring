package chapter_10;

public class RenameMethod {

	private String _officeAreaCode;
	private String _officeNumber;

	public String getTelephoneNumber() {
		return getOfficeTelephoneNumber();
	}

	public String getOfficeTelephoneNumber() {
		return "(" + _officeAreaCode + ")" + _officeNumber;
	}

}
