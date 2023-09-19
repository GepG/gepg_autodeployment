package tz.co.gepg.autoDeployment.dto;

public class RegistrationDto {
	private Long id;
	private Long regId;
	private String mnoCode;
	private String calBackUrl;
	private String msisDn;
	private String clientName;
	private String clientNin;
	private String reqDt;	
	private String agentNo;
	private String agentName;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the regId
	 */
	public Long getRegId() {
		return regId;
	}
	/**
	 * @param regId the regId to set
	 */
	public void setRegId(Long regId) {
		this.regId = regId;
	}
	/**
	 * @return the mnoCode
	 */
	public String getMnoCode() {
		return mnoCode;
	}
	/**
	 * @param mnoCode the mnoCode to set
	 */
	public void setMnoCode(String mnoCode) {
		this.mnoCode = mnoCode;
	}
	/**
	 * @return the calBackUrl
	 */
	public String getCalBackUrl() {
		return calBackUrl;
	}
	/**
	 * @param calBackUrl the calBackUrl to set
	 */
	public void setCalBackUrl(String calBackUrl) {
		this.calBackUrl = calBackUrl;
	}
	/**
	 * @return the msisDn
	 */
	public String getMsisDn() {
		return msisDn;
	}
	/**
	 * @param msisDn the msisDn to set
	 */
	public void setMsisDn(String msisDn) {
		this.msisDn = msisDn;
	}
	/**
	 * @return the clientName
	 */
	public String getClientName() {
		return clientName;
	}
	/**
	 * @param clientName the clientName to set
	 */
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	/**
	 * @return the clientNin
	 */
	public String getClientNin() {
		return clientNin;
	}
	/**
	 * @param clientNin the clientNin to set
	 */
	public void setClientNin(String clientNin) {
		this.clientNin = clientNin;
	}
	/**
	 * @return the reqDt
	 */
	public String getReqDt() {
		return reqDt;
	}
	/**
	 * @param reqDt the reqDt to set
	 */
	public void setReqDt(String reqDt) {
		this.reqDt = reqDt;
	}
	/**
	 * @return the agentNo
	 */
	public String getAgentNo() {
		return agentNo;
	}
	/**
	 * @param agentNo the agentNo to set
	 */
	public void setAgentNo(String agentNo) {
		this.agentNo = agentNo;
	}
	/**
	 * @return the agentName
	 */
	public String getAgentName() {
		return agentName;
	}
	/**
	 * @param agentName the agentName to set
	 */
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	@Override
	public String toString() {
		return "RegistrationDto [id=" + id + ", regId=" + regId + ", mnoCode=" + mnoCode + ", calBackUrl=" + calBackUrl
				+ ", msisDn=" + msisDn + ", clientName=" + clientName + ", clientNin=" + clientNin + ", reqDt=" + reqDt
				+ ", agentNo=" + agentNo + ", agentName=" + agentName + "]";
	}
	
}
