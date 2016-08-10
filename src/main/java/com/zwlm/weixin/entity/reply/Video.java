package com.zwlm.weixin.entity.reply;

import java.io.Serializable;

/**
 * 微信视频信息中，对应的视频对象，为抽象出来的，方便用于返回结果
 * 
 * @author 低至一折起 dizhiyizheqi
 *
 */
public class Video implements Serializable {

	/**
	 * 序列号
	 */
	private static final long serialVersionUID = -1911327629844332565L;

	/**
	 * 通过素材管理中的接口上传多媒体文件，得到的id
	 */
	private String MediaId;

	/**
	 * 视频消息的标题
	 */
	private String Title;

	/**
	 * 视频消息的描述
	 */
	private String Description;

	public String getMediaId() {
		return MediaId;
	}

	public void setMediaId(String mediaId) {
		MediaId = mediaId;
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

}
