package com.tasosmartidis.stackoverflow.jaxb.wrapper.q49302677;

public class ClaimDTO {
	private String _recordId;
	private String _version;
	private ClmAddress _clmAddress;
	private ClaimStatus _claimStatus;

	public String getRecordId() {
		return _recordId;
	}

	public String getVersion() {
		return _version;
	}

	public ClmAddress getClmAddress() {
		return _clmAddress;
	}

	public ClaimStatus getClaimStatus() {
		return _claimStatus;
	}

	public void setRecordId(String recordId) {
		this._recordId = recordId;
	}

	public void setVersion(String version) {
		this._version = version;
	}

	public void setClmAddress(ClmAddress clmAddress) {
		this._clmAddress = clmAddress;
	}

	public void setClaimStatus(ClaimStatus claimStatus) {
		this._claimStatus = claimStatus;
	}
}
