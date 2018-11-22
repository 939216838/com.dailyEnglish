package com.dailyenglish.response;

/**
 * 接口响应业务代码
 *
 * @author liuhongtian
 */
public enum Code {

	ID_EXISTS("E0000000", "id exists"), USERNAME_EXISTS("E0000001", "userName exists"), EMAIL_EXISTS("E0000002",
			"email exists"), PHONE_EXISTS("E0000003", "phone exists"), DELETE_FAILED("E0000004", "delete failed");

	/**
	 * 业务代码
	 */
	private String code;

	/**
	 * 响应消息（代码说明）
	 */
	private String message;

	private Code(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public static void containval() {

		Code[] codes = Code.values();

		for (Code c : codes) {
			System.out.println(c.getCode() + ":" + c.getMessage());
		}
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
