package com.tasosmartidis.stackoverflow.jaxb.ignorefields.q56752517;


import lombok.Getter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Getter
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Feed {

	@XmlAnyElement(lax = true)
	private List<Object> anything;

	@XmlElement(name="entry")
	private Entry entry;

}
