
public class MockitoTest {

	public String If(boolean check) {
		String result = new String();
		if (check == true) {
			if ("Check" == returnString()) {
				result = "Ok";
			} else {
				result = "No";
			}
		} else {
			result = null;
		}
		return result;
	}

	public String returnString() {
		return null;
	}
}
