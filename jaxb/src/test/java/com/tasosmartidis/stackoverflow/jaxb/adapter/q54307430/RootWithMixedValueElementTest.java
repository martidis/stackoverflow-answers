package com.tasosmartidis.stackoverflow.jaxb.adapter.q54307430;

import com.tasosmartidis.stackoverflow.jaxb.BaseTestSetup;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RootWithMixedValueElementTest extends BaseTestSetup {

	@Test
	public void checkUnmarshalling() throws Exception {
		RootWithMixedValueElement pojo = unmarshallingUtil.unmarshalFromFileToClass("54307430.xml", RootWithMixedValueElement.class);

		assertEquals("<b>Node:</b> Some information", pojo.getTrickyElementAsString());
	}
}