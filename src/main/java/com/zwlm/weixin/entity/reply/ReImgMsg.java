package com.zwlm.weixin.entity.reply;

import com.zwlm.weixin.constant.Weixin;
import com.zwlm.weixin.entity.ReMsg;

/**
 * 回复用户图片消息对象
 * 
 * @author 低至一折起 dizhiyizheqi
 *
 */
public class ReImgMsg extends ReMsg {

	/**
	 * 序列号
	 */
	private static final long serialVersionUID = -1036902079523296485L;

	/**
	 * 回复类型为image
	 */
	private String MsgType = Weixin.image;

	/**
	 * 抽象出来的图片对象
	 */
	private Image Image;

	public String getMsgType() {
		return MsgType;
	}

	public Image getImg() {
		return Image;
	}

	public void setImg(Image img) {
		this.Image = img;
	}

}
