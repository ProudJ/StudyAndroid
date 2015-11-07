import static org.junit.Assert.*;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.mockito.Mock;

public class Test {

	static MockitoTest mockitoTest ;
	// 각 Test를 실행 전에 Set하는 클래스.
	@Before
	public void setUpBefore() throws Exception {
		// 스파이 클래스 만듬.
		// 스파이 클래스는 값을 설정해 주지 않으면 진짜 인스턴스와 같음.
		mockitoTest = spy(new MockitoTest());
	}

	@org.junit.Test
	public void testIf() {
		// set
		doReturn("Check").when(mockitoTest).returnString(); // returnString을 호출하면 Check를 리턴함.
		// run
		String result = mockitoTest.If(true);
		/*
		 * verify
		 */
		assertEquals("Ok", result);

		// set
		doReturn(".").when(mockitoTest).returnString(); // returnString을 호출하면 Check를 리턴함.
		// run
		result = mockitoTest.If(true);
		/*
		 * verify
		 */
		assertNotEquals("Ok", result);

		// run
		result = mockitoTest.If(false);
		// verify
		assertNull(result);
	}
}
