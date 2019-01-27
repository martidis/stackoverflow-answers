package com.tasosmartidis.stackoverflow.jaxb.base.util;

import org.springframework.stereotype.Component;

import javax.xml.bind.*;
import java.io.File;
import java.net.URL;

@Component
public class UnmarshallingUtil extends XmlUtil {

	public <T> T unmarshalFromFileToClass(String filename, Class<T> classType) {
		try {
			File file = getFileFromResources(filename);

			Unmarshaller jaxbUnmarshaller = createUnmarshaller(classType);
			jaxbUnmarshaller.setEventHandler(createVerboseEventHandler());

			return (T) jaxbUnmarshaller.unmarshal(file);
		} catch (JAXBException e) {
			throw new RuntimeException("Unmarshalling from file '" + filename + "' failed. Exception message: " + e.getMessage());
		}
	}

	private <T> Unmarshaller createUnmarshaller(Class<T> classType) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(classType);
		return jaxbContext.createUnmarshaller();
	}

	private File getFileFromResources(String filename) {
		ClassLoader classLoader = getClass().getClassLoader();
		URL resource = classLoader.getResource(filename);
		if(resource == null) {
			throw new RuntimeException("File '" + filename + "' not found");
		}

		File file = new File(resource.getFile());
		if(!file.exists()){
			throw new RuntimeException("File '" + filename + "' not found");
		}

		return file;
	}


}
