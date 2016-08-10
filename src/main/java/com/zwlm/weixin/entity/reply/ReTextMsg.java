package com.zwlm.weixin.entity.reply;

import com.zwlm.weixin.constant.Weixin;
import com.zwlm.weixin.entity.ReMsg;

/**
 * 回复用户文本消息对象
 * @author 低至一折起	dizhiyizheqi
 *
 */
public class ReTextMsg extends ReMsg {
	
	/**
	 * 序列号
	 */
	private static final long serialVersionUID = -965387310217966440L;

	/**
	 * 回复类型为text
	 */
	private String MsgType = Weixin.text;
	
	/**
	 * 回复的消息内容（换行：在content中能够换行，微信客户端就支持换行显示）
	 */
	private String Content;
	
	public String getMsgType() {
		return MsgType;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

}
