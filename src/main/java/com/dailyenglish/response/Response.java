package com.dailyenglish.response;

/**
 * 响应报文接口，缺省情况下，假定为成功响应，如果需要返回异常响应，应实现对应的缺省方法。
 *
 * @author liuhongtian
 */
public interface Response<T> {

	public default boolean isSuccess() {
		return true;
	}

	public default String getCode() {
		return null;
	}

	public default String getMessage() {
		return null;
	}

	public default T getResp() {
		return null;
	}

}
