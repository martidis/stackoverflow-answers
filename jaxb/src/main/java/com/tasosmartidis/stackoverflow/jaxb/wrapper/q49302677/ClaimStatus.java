package com.tasosmartidis.stackoverflow.jaxb.wrapper.q49302677;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

@XmlAccessorType(XmlAccessType.PROPERTY)
public class ClaimStatus {


	private List<ClaimStatusDTO> _claimStatusDTO;
	private boolean _statusCompleteWorkItemFlag;

	@XmlElementWrapper(name = "expired")
	public List<ClaimStatusDTO> getClaimStatusDTO() {
		return _claimStatusDTO;
	}

	public void setClaimStatusDTO(List<ClaimStatusDTO> claimStatusDto) {
		this._claimStatusDTO = claimStatusDto;
	}

	public boolean isStatusCompleteWorkItemFlag() {
		return _statusCompleteWorkItemFlag;
	}


	public void setStatusCompleteWorkItemFlag(boolean statusCompleteWorkItemFlag) {
		this._statusCompleteWorkItemFlag = statusCompleteWorkItemFlag;
	}
}
