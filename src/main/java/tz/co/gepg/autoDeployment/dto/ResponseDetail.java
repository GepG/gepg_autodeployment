package tz.co.gepg.autoDeployment.dto;

public class ResponseDetail {
	
//	<REGNOTIFICATION>
//	   <REQID>48u848-59588-8585858</REQID>
//	   <NOTIFICATIONID>48u848-59588-8585858</NOTIFICATIONID>
//	   <STATUSCODE>999</STATUSCODE>
//	   <STATUSCODE>SUCCESSFUL REGISTERED</STATUSCODE>
//	<REGNOTIFICATION>

private boolean success;
private String notificationNid;
private boolean statusCode;
public boolean isSuccess(){
	return statusCode;
}
/**
 * @return the notificationNid
 */
public String getNotificationNid() {
	return notificationNid;
}
/**
 * @param notificationNid the notificationNid to set
 */
public void setNotificationNid(String notificationNid) {
	this.notificationNid = notificationNid;
}
/**
 * @return the statusCode
 */
public boolean isStatusCode() {
	return statusCode;
}
/**
 * @param statusCode the statusCode to set
 */
public void setStatusCode(boolean statusCode) {
	this.statusCode = statusCode;
}
/**
 * @param success the success to set
 */
public void setSuccess(boolean success) {
	this.success = success;
}
@Override
public String toString() {
	return "ResponseDetail [success=" + success + ", notificationNid=" + notificationNid + ", statusCode=" + statusCode
			+ "]";
}

}
