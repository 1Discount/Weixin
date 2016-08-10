package com.zwlm.weixin.entity.receive;

import com.zwlm.weixin.constant.Weixin;
import com.zwlm.weixin.entity.Msg;

/**
 * 接收小视频消息对象
 * @author 低至一折起	dizhiyizheqi
 *
 */
public class ShortvideoMsg extends Msg{
	
	/**
	 * 序列号
	 */
	private static final long serialVersionUID = 551403945279740327L;

	/**
	 * 接收类型为shortvideo
	 */
	private String MsgType = Weixin.shortvideo;

	/**
	 * 视频消息媒体id，可以调用多媒体文件下载接口拉取数据
	 */
	private String MediaId;
	
	/**
	 * 视频消息缩略图的媒体id，可以调用多媒体文件下载接口拉取数据
	 */
	private String ThumbMediaId;
	
	public String getMsgType() {
		return MsgType;
	}

	public String getMediaId() {
		return MediaId;
	}

	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}

	public String getThumbMediaId() {
		return ThumbMediaId;
	}

	public void setThumbMediaId(String thumbMediaId) {
		ThumbMediaId = thumbMediaId;
	}

}
