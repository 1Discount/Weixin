package com.zwlm.weixin.entity.reply;

import java.io.Serializable;

/**
 * 微信图片信息中，对应的图片对象，为抽象出来的，方便用于返回结果
 * 
 * @author 低至一折起 dizhiyizheqi
 *
 */
public class Image implements Serializable {

	/**
	 * 序列号
	 */
	private static final long serialVersionUID = 7038212018749582411L;

	/**
	 * 通过素材管理中的接口上传多媒体文件，得到的id
	 */
	private String MediaId;

	public String getMediaId() {
		return MediaId;
	}

	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}

}
