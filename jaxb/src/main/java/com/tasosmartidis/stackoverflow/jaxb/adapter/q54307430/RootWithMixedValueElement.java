package com.tasosmartidis.stackoverflow.jaxb.adapter.q54307430;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "content")
public class RootWithMixedValueElement {

	@XmlElement(name = "p")
	private TrickyElement trickyElement;

	public String getTrickyElementAsString() {
		return this.trickyElement.getbElement() + this.trickyElement.getValue();
	}

}
