package com.tasosmartidis.stackoverflow.jaxb.wrapper.q49302677;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

@XmlAccessorType(XmlAccessType.PROPERTY)
public class NotepadDTO {
	private String _recordId;
	private String _version;
	private List<NotepadTextDTO> _notepadTextDTO;

	@XmlElementWrapper(name = "notepadText")
	public List<NotepadTextDTO> getNotepadTextDTO() {
		return _notepadTextDTO;
	}

	public String getRecordId() {
		return _recordId;
	}

	public String getVersion() {
		return _version;
	}

	public void setNotepadTextDTO(List<NotepadTextDTO> notepadText) {
		this._notepadTextDTO = notepadText;
	}

	public void setRecordId(String recordId) {
		this._recordId = recordId;
	}

	public void setVersion(String version) {
		this._version = version;
	}
}
