package com.zwlm.weixin.service.impl;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.zwlm.weixin.constant.Weixin;
import com.zwlm.weixin.service.WeixinVerificationService;

@Service
public class WeixinVerificationServiceImpl implements WeixinVerificationService {

	@Override
	public boolean checkSignature(String signature, String timestamp, String nonce) {
		// 按微信开发文档说明，排序
		String[] s_arr = new String[]{Weixin.token,timestamp, nonce};
		Arrays.sort(s_arr);
		
		// 生成字符串
		StringBuffer sb = new StringBuffer();
		for (String s : s_arr) {
			sb.append(s);
		}
		
		// SHA1加密
		String s_security = getSHA1(sb.toString());
		
		// 与signature对比，标识该请求来源于微信
		if ( s_security.equals(signature)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	private String getSHA1(String decript) {
		try {
			MessageDigest digest = java.security.MessageDigest
					.getInstance("SHA-1");
			digest.update(decript.getBytes());
			byte messageDigest[] = digest.digest();
			// Create Hex String
			StringBuffer hexString = new StringBuffer();
			// 字节数组转换为 十六进制 数
			for (int i = 0; i < messageDigest.length; i++) {
				String shaHex = Integer.toHexString(messageDigest[i] & 0xFF);
				if (shaHex.length() < 2) {
					hexString.append(0);
				}
				hexString.append(shaHex);
			}
			return hexString.toString();

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return "";
	}

}
