package com.zwlm.weixin.entity;

import java.io.Serializable;

/**
 * 微信公众平台回复消息对象，抽取的父类
 * @author 低至一折起	dizhiyizheqi
 *
 */
public class ReMsg implements Serializable {

	/**
	 * 序列号
	 */
	private static final long serialVersionUID = 1624437426672722954L;

	/**
	 * 接收方帐号（收到的OpenID）
	 */
	private String ToUserName;
	
	/**
	 * 开发者微信号
	 */
	private String FromUserName;
	
	/**
	 * 消息创建时间 （整型）
	 */
	private Long CreateTime;
	
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

}
