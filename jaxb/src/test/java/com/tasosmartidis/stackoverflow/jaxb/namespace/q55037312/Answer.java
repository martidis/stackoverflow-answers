package com.tasosmartidis.stackoverflow.jaxb.namespace.q55037312;

import com.tasosmartidis.stackoverflow.jaxb.BaseTestSetup;
import generated.Root;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Answer extends BaseTestSetup {

	@Test
	public void checkUnmarshalling() throws Exception {
		Root pojo = unmarshallingUtil.unmarshalFromFileToClass("55037312.xml", Root.class);

		assertEquals ("version 4", pojo.getV4PSType().getValue());
		assertEquals ("version 5", pojo.getV5PSType().getValue());
	}
}