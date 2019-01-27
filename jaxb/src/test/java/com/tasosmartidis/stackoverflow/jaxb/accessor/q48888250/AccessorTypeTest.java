package com.tasosmartidis.stackoverflow.jaxb.accessor.q48888250;

import com.tasosmartidis.stackoverflow.jaxb.BaseTestSetup;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class AccessorTypeTest extends BaseTestSetup {

	@Test
	public void checkunmarshalling_fieldAccessor() throws Exception {
		RootWithFieldAccessor root = unmarshallingUtil.unmarshalFromFileToClass("48888250.xml", RootWithFieldAccessor.class);

		assertEquals("some value", root.getValue());
	}

	@Test(expected = RuntimeException.class)
	public void checkunmarshalling_propertyAccessor() throws Exception {
		try {
			unmarshallingUtil.unmarshalFromFileToClass("48888250.xml", RootWithPropertyAccessor.class);

		}catch (RuntimeException ex) {

			assertTrue(ex.getMessage().contains("IllegalAnnotationException"));

			throw ex;
		}
	}

}