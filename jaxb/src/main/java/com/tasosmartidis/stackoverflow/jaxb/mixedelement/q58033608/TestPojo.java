package com.tasosmartidis.stackoverflow.jaxb.mixedelement.q58033608;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name="Date")
public class TestPojo {

	@XmlMixed
	@XmlAnyElement
	private List<Object> textContent;

	@XmlElement
	private Reference reference;

}
