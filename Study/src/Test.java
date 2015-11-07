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
	// �� Test�� ���� ���� Set�ϴ� Ŭ����.
	@Before
	public void setUpBefore() throws Exception {
		// ������ Ŭ���� ����.
		// ������ Ŭ������ ���� ������ ���� ������ ��¥ �ν��Ͻ��� ����.
		mockitoTest = spy(new MockitoTest());
	}

	@org.junit.Test
	public void testIf() {
		// set
		doReturn("Check").when(mockitoTest).returnString(); // returnString�� ȣ���ϸ� Check�� ������.
		// run
		String result = mockitoTest.If(true);
		/*
		 * verify
		 */
		assertEquals("Ok", result);

		// set
		doReturn(".").when(mockitoTest).returnString(); // returnString�� ȣ���ϸ� Check�� ������.
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
