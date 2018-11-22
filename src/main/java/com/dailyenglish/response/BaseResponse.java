package com.dailyenglish.response;

/**
 * 响应报文抽象基类
 *
 * @param <T> 定制化响应内容类型
 * @author liuhongtian
 */
public class BaseResponse<T> implements Response<T> {

	/**
	 * 具体的业务响应内容
	 */
	protected T pojo;

	/**
	 * 是否成功
	 */
	protected boolean success = true;

	/**
	 * 业务响应代码
	 */
	protected String code = null;

	/**
	 * 业务响应消息
	 */
	protected String message = null;

	/**
	 * 成功，无响应内容
	 *
	 * @param succ
	 */
	public BaseResponse() {
	}

	/**
	 * 成功或失败，无响应内容，无状态码
	 *
	 * @param succ
	 */
	public BaseResponse(boolean succ) {
		this.success = succ;
	}

	/**
	 * 成功，带响应内容
	 *
	 * @param pojo
	 */
	public BaseResponse(T pojo) {
		this.pojo = pojo;
	}

	/**
	 * 成功或失败，带响应内容，无状态码
	 *
	 * @param succ
	 * @param pojo
	 */
	public BaseResponse(boolean succ, T pojo) {
		this.success = succ;
		this.pojo = pojo;
	}

	/**
	 * 成功或失败，带响应内容，有状态码
	 *
	 * @param succ
	 * @param pojo
	 * @param code
	 * @param message
	 */
	public BaseResponse(boolean succ, T pojo, String code, String message) {
		this.success = succ;
		this.pojo = pojo;
		this.code = code;
		this.message = message;
	}

	/**
	 * 成功或失败，带响应内容，有状态码
	 *
	 * @param succ
	 * @param pojo
	 * @param code
	 */
	public BaseResponse(boolean succ, T pojo, Code code) {
		this.success = succ;
		this.pojo = pojo;
		this.code = code.getCode();
		this.message = code.getMessage();
	}

	/**
	 * 成功或失败，无响应内容，有状态码
	 *
	 * @param succ
	 * @param pojo
	 * @param code
	 * @param message
	 */
	public BaseResponse(boolean succ, String code, String message) {
		this.success = succ;
		this.code = code;
		this.message = message;
	}

	/**
	 * 成功或失败，无响应内容，有状态码
	 *
	 * @param succ
	 * @param pojo
	 * @param code
	 */
	public BaseResponse(boolean succ, Code code) {
		this.success = succ;
		this.code = code.getCode();
		this.message = code.getMessage();
	}

	@Override
	public boolean isSuccess() {
		return this.success;
	}

	@Override
	public String getCode() {
		return this.code;
	}

	@Override
	public String getMessage() {
		return this.message;
	}

	@Override
	public T getResp() {
		return this.pojo;
	}

}
