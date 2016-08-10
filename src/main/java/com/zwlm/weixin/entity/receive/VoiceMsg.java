package com.zwlm.weixin.entity.receive;

import com.zwlm.weixin.constant.Weixin;
import com.zwlm.weixin.entity.Msg;

/**
 * 接收语音消息对象
 * @author 低至一折起	dizhiyizheqi
 *
 */
public class VoiceMsg extends Msg{
	
	/**
	 * 序列号
	 */
	private static final long serialVersionUID = 8627026804309161278L;

	/**
	 * 接收类型为voice
	 */
	private String MsgType = Weixin.voice;

	/**
	 * 语音消息媒体id，可以调用多媒体文件下载接口拉取该媒体
	 */
	private String MediaID;
	
	/**
	 * 语音格式：amr
	 */
	private String Format = "amr";
	
	/**
	 * 语音识别结果，UTF8编码
	 */
	private String Recognition;
	
	public String getMsgType() {
		return MsgType;
	}

	public String getMediaID() {
		return MediaID;
	}

	public void setMediaID(String mediaID) {
		MediaID = mediaID;
	}

	public String getFormat() {
		return Format;
	}

	public void setFormat(String format) {
		Format = format;
	}

	public String getRecognition() {
		return Recognition;
	}

	public void setRecognition(String recognition) {
		Recognition = recognition;
	}

}
