package com.zwlm.weixin.entity.reply;

import com.zwlm.weixin.constant.Weixin;
import com.zwlm.weixin.entity.ReMsg;

/**
 * 回复用户视频消息对象
 * 
 * @author 低至一折起 dizhiyizheqi
 *
 */
public class ReVideoMsg extends ReMsg {

	/**
	 * 序列号
	 */
	private static final long serialVersionUID = -6372962412528823055L;

	/**
	 * 回复类型为video
	 */
	private String MsgType = Weixin.video;

	/**
	 * 抽象出来的视频对象
	 */
	private Video Voice;

	public String getMsgType() {
		return MsgType;
	}

	public Video getVoice() {
		return Voice;
	}

	public void setVoice(Video voice) {
		Voice = voice;
	}

}
