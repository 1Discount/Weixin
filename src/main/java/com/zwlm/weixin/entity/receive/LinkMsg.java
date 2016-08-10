package com.zwlm.weixin.entity.receive;

import com.zwlm.weixin.constant.Weixin;
import com.zwlm.weixin.entity.Msg;

/**
 * 接收链接消息对象
 * @author 低至一折起	dizhiyizheqi
 *
 */
public class LinkMsg extends Msg{
	
	/**
	 * 序列号
	 */
	private static final long serialVersionUID = -5813100225864175501L;

	/**
	 * 接收类型为link
	 */
	private String MsgType = Weixin.link;
	
	/**
	 * 消息标题
	 */
	private String Title;
	
	/**
	 * 消息描述
	 */
	private String Description;
	
	/**
	 * 消息链接
	 */
	private String Url;
	
	public String getMsgType() {
		return MsgType;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;
	}

}
