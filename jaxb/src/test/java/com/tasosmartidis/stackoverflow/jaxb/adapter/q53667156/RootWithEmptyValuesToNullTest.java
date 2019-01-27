package com.tasosmartidis.stackoverflow.jaxb.adapter.q53667156;

import com.tasosmartidis.stackoverflow.jaxb.BaseTestSetup;
import org.junit.Test;

import static junit.framework.TestCase.assertNull;

public class RootWithEmptyValuesToNullTest extends BaseTestSetup {

	@Test
	public void checkMarshalling() throws Exception {
		RootWithEmptyValuesToNull pojo = unmarshallingUtil.unmarshalFromFileToClass("53667156.xml", RootWithEmptyValuesToNull.class);

		assertNull(pojo.tagName);
	}

}