package com.zwlm.weixin.entity.receive;

import com.zwlm.weixin.constant.Weixin;
import com.zwlm.weixin.entity.Msg;

/**
 * 接收文本消息对象
 * @author 低至一折起	dizhiyizheqi
 *
 */
public class TextMsg extends Msg{
	
	/**
	 * 序列号
	 */
	private static final long serialVersionUID = 4843046084406506062L;
	
	/**
	 * 接收类型为text
	 */
	private String MsgType = Weixin.text;

	/**
	 * 文本消息内容
	 */
	private String Content;
	
	public String getMsgType() {
		return MsgType;
	}

	public void setMsgType(String msgType) {
		MsgType = msgType;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}
	
}
