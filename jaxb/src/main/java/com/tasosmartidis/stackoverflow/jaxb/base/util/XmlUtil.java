package com.tasosmartidis.stackoverflow.jaxb.base.util;

import javax.xml.bind.ValidationEvent;
import javax.xml.bind.ValidationEventHandler;

public class XmlUtil {

	protected ValidationEventHandler createVerboseEventHandler() {
		return new ValidationEventHandler() {
			public boolean handleEvent(ValidationEvent event ) {
				throw new RuntimeException(event.getMessage(),
						event.getLinkedException());
			}
		};
	}
}
