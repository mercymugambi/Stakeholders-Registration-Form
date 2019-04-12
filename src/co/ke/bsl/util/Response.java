package co.ke.bsl.util;

public class Response {
	private String responseCode;
	private String message;
	private Object content;
	private String agentId;
	private String agentName;

	public String getResponseCode() {
		return this.responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getContent() {
		return this.content;
	}

	public void setContent(Object content) {
		this.content = content;
	}

	public String getAgentId() {
		return this.agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAgentName() {
		return this.agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
}