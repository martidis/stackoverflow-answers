package com.tasosmartidis.stackoverflow.jaxb.wrapper.q49302677;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
public class ClaimImportCompositeDTO {
	private String _claimId;
	private String _claimNumber;
	private ClaimDTO _claimDTO;
	private List<NotepadDTO> _notepadDTO;

	public String getClaimId() {
		return _claimId;
	}

	public String getClaimNumber() {
		return _claimNumber;
	}

	public ClaimDTO getClaimDTO() {
		return _claimDTO;
	}

	@XmlElementWrapper(name = "notes")
	public List<NotepadDTO> getNotepadDTO() {
		return _notepadDTO;
	}

	public void setClaimId(String claimId) {
		this._claimId = claimId;
	}

	public void setClaimNumber(String claimNumber) {
		this._claimNumber = claimNumber;
	}

	public void setClaimDTO(ClaimDTO claimDTO) {
		this._claimDTO = claimDTO;
	}

	public void setNotepadDTO(List<NotepadDTO> notes) {
		this._notepadDTO = notes;
	}
}