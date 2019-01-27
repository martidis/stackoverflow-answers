package com.tasosmartidis.stackoverflow.jaxb.base.util;

import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

@Component
public class MarshallingUtil extends XmlUtil {

	public <T> void marshallToSystemOut(T instance, Class<T> classType) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(classType);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setEventHandler(createVerboseEventHandler());

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(instance, System.out);
		} catch (JAXBException e) {
			throw new RuntimeException("Marshalling from instance of type '" + classType + "' failed.");
		}
	}
}
