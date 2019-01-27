package com.tasosmartidis.stackoverflow.jaxb.adapter.q54307430;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class TrickyElement {

	@XmlJavaTypeAdapter(BElementAdapter.class)
	@XmlElement(name = "b")
	private String bElement;

	@XmlMixed
	private List<String> value;

	public String getbElement() {
		return bElement;
	}

	public String getValue() {
		final StringBuilder stringBuilder = new StringBuilder();
		for(String v : value) {
			stringBuilder.append(v);
		}
		return stringBuilder.toString();
	}

}
