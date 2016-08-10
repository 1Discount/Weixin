package com.zwlm.weixin.service;

public interface WeixinVerificationService {
	
	/**
	 * 检查微信签名
	 * 
	 * @param signature		微信加密签名，signature结合了开发者填写的token参数和请求中的timestamp参数、nonce参数。
	 * @param timestamp	时间戳
	 * @param nonce			随机数
	 * @return	true：请求来源于微信，false：请求不源于微信
	 */
	boolean checkSignature(String signature, String timestamp, String nonce);

}
