package com.zwlm.weixin.entity.reply;

import com.zwlm.weixin.constant.Weixin;
import com.zwlm.weixin.entity.ReMsg;

/**
 * 回复用户音乐消息对象
 * 
 * @author 低至一折起 dizhiyizheqi
 *
 */
public class ReMusicMsg extends ReMsg {

	/**
	 * 序列号
	 */
	private static final long serialVersionUID = -6372962412528823055L;

	/**
	 * 回复类型为music
	 */
	private String MsgType = Weixin.music;

	/**
	 * 抽象出来的语音对象
	 */
	private Music Music;

	public String getMsgType() {
		return MsgType;
	}

	public Music getMusic() {
		return Music;
	}

	public void setMusic(Music music) {
		Music = music;
	}

}
