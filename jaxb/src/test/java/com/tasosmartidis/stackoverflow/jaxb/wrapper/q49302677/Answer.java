package com.tasosmartidis.stackoverflow.jaxb.wrapper.q49302677;

import com.tasosmartidis.stackoverflow.jaxb.BaseTestSetup;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class Answer extends BaseTestSetup {

	@Test
	public void checkUnmarshalling() throws Exception {
		ClaimImportCompositeDTO  pojo = unmarshallingUtil.unmarshalFromFileToClass("49302677.xml", ClaimImportCompositeDTO.class);

		assertNotNull(pojo);
		assertEquals(1, pojo.getNotepadDTO().size());
		assertNotNull(pojo.getNotepadDTO().get(0).getRecordId());
	}

}