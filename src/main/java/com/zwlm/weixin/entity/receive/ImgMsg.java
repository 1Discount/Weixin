package com.zwlm.weixin.entity.receive;

import com.zwlm.weixin.constant.Weixin;
import com.zwlm.weixin.entity.Msg;

/**
 * 接收图片消息对象
 * @author 低至一折起	dizhiyizheqi
 *
 */
public class ImgMsg extends Msg{

	/**
	 * 序列号
	 */
	private static final long serialVersionUID = 6067350043856284745L;
	
	/**
	 * 接收类型为image
	 */
	private String MsgType = Weixin.image;
	
	/**
	 * 图片链接（由系统生成）
	 */
	private String PicUrl;
	
	/**
	 * 图片消息媒体id，可以调用多媒体文件下载接口拉取数据
	 */
	private String MediaId;
	
	public String getMsgType() {
		return MsgType;
	}

	public String getPicUrl() {
		return PicUrl;
	}

	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}

	public String getMediaId() {
		return MediaId;
	}

	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}
	
}
