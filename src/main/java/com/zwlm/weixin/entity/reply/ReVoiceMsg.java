package com.zwlm.weixin.entity.reply;

import com.zwlm.weixin.constant.Weixin;
import com.zwlm.weixin.entity.ReMsg;

/**
 * 回复用户语音消息对象
 * 
 * @author 低至一折起 dizhiyizheqi
 *
 */
public class ReVoiceMsg extends ReMsg {

	/**
	 * 序列号
	 */
	private static final long serialVersionUID = 3192482863616242026L;

	/**
	 * 回复类型为voice
	 */
	private String MsgType = Weixin.voice;

	/**
	 * 抽象出来的语音对象
	 */
	private Voice Voice;

	public String getMsgType() {
		return MsgType;
	}

	public Voice getVoice() {
		return Voice;
	}

	public void setVoice(Voice voice) {
		Voice = voice;
	}

}
