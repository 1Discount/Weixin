package com.zwlm.weixin.entity;

import java.io.Serializable;

/**
 * 微信公众平台接收消息对象，抽取的父类
 * @author 低至一折起	dizhiyizheqi
 *
 */
public class Msg implements Serializable {

	/**
	 * 序列号
	 */
	private static final long serialVersionUID = -6687578586282568259L;

	/**
	 * 开发者微信号
	 */
	private String ToUserName;
	
	/**
	 * 发送方帐号（一个OpenID）
	 */
	public String FromUserName;
	
	/**
	 * 消息创建时间 （整型）
	 */
	private Long CreateTime;
	
	/**
	 * 消息id，64位整型
	 */
	private String MsgId;

	public String getToUserName() {
		return ToUserName;
	}

	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}

	public String getFromUserName() {
		return FromUserName;
	}

	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}

	public Long getCreateTime() {
		return CreateTime;
	}

	public void setCreateTime(Long createTime) {
		CreateTime = createTime;
	}

	public String getMsgId() {
		return MsgId;
	}

	public void setMsgId(String msgId) {
		MsgId = msgId;
	}
	
}
