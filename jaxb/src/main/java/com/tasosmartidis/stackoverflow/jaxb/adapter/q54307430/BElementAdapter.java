package com.tasosmartidis.stackoverflow.jaxb.adapter.q54307430;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class BElementAdapter extends XmlAdapter<String, String> {
	@Override
	public String unmarshal(String v) throws Exception {
		return "<b>" + v + "</b>";
	}

	@Override
	public String marshal(String v) throws Exception {
		return v;
	}
}
