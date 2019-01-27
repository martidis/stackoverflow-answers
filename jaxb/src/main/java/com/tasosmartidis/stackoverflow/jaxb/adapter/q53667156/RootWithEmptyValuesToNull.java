package com.tasosmartidis.stackoverflow.jaxb.adapter.q53667156;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.FIELD)
public class RootWithEmptyValuesToNull {

	@XmlJavaTypeAdapter(EmptyTagAdapter.class)
	protected String tagName;
}
