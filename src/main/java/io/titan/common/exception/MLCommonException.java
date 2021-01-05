package io.titan.common.exception;

/**
 * 异常枚举
 * @author hule
 *
 */
public enum MLCommonException implements MLExceptionEnum {

	system_err("system_err", "it.etoken.common.system_err"),
	sms_error("sms_err","it.etoken.common.sms_err"),
	sms_ip("sms_unknow","it.etoken.common.sms_unknow"),
	sms_excess("sms_excess","it.etoken.common.sms_excess"),
	POINTNOTENOUGH("POINTNOTENOUGH","it.etoken.common.POINTNOTENOUGH"),
	NOEOST("NOEOST","it.etoken.common.NOEOST");
	
//	system_err("system_err", "未知异常"),
//	sms_error("sms_err","发送验证码失败"),
//	sms_ip("sms_unknow","网络拥堵，请稍候再试"),
//	sms_excess("sms_excess","发送过于频繁"),
//	POINTNOTENOUGH("POINTNOTENOUGH","您的积分暂时没有达到领取标准，多多签到可以新增积分哦"),
//	NOEOST("NOEOST","没有奖励可以领取");
	
	private MLCommonException(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	
	/**
	 * 错误码
	 */
	private String code;

	/**
	 * 错误信息
	 */
	private String msg;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}