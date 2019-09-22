package com.tasosmartidis.stackoverflow.jaxb.mixedelement.q58033608;

import com.tasosmartidis.stackoverflow.jaxb.BaseTestSetup;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

public class TestPojoTest extends BaseTestSetup {

	@Test
	public void checkunmarshalling_fieldAccessor() throws Exception {
		TestPojo root = unmarshallingUtil.unmarshalFromFileToClass("58033608.xml", TestPojo.class);

		assertNotNull(root);
	}
}
