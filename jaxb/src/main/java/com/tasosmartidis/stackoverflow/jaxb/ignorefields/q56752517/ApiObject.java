package com.tasosmartidis.stackoverflow.jaxb.ignorefields.q56752517;

import lombok.Getter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
public class ApiObject {

	@XmlAnyElement(lax = true)
	private List<Object> anything;

	@XmlElement(name= "last-name", namespace = "http://www.example.com/publications/api")
	private String lastName;
	@XmlElement(name = "first-name", namespace = "http://www.example.com/publications/api")
	private String firstName;
	@XmlElement(name = "email-address", namespace = "http://www.example.com/publications/api")
	private String emailAddress;
}
