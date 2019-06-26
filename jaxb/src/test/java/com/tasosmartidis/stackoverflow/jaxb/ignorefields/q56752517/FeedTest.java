package com.tasosmartidis.stackoverflow.jaxb.ignorefields.q56752517;

import com.tasosmartidis.stackoverflow.jaxb.BaseTestSetup;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

public class FeedTest extends BaseTestSetup {

	@Test
	public void checkunmarshalling_fieldAccessor() throws Exception {
		Feed root = unmarshallingUtil.unmarshalFromFileToClass("56752517.xml", Feed.class);

		assertNotNull(root.getEntry().getObject().getEmailAddress());
	}
}
