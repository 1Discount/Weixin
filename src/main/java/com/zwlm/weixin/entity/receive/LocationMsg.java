package com.zwlm.weixin.entity.receive;

import com.zwlm.weixin.constant.Weixin;
import com.zwlm.weixin.entity.Msg;

/**
 * 接收地理位置消息对象
 * @author 低至一折起	dizhiyizheqi
 *
 */
public class LocationMsg extends Msg{
	
	/**
	 * 序列号
	 */
	private static final long serialVersionUID = -6552072822612036807L;

	/**
	 * 接收类型为location
	 */
	private String MsgType = Weixin.location;

	/**
	 * 地理位置纬度
	 */
	private Double Location_X;
	
	/**
	 * 地理位置经度
	 */
	private Double Location_Y;
	
	/**
	 * 地图缩放大小
	 */
	private String Scale;
	
	/**
	 * 地理位置信息
	 */
	private String Label;
	
	public String getMsgType() {
		return MsgType;
	}

	public Double getLocation_X() {
		return Location_X;
	}

	public void setLocation_X(Double location_X) {
		Location_X = location_X;
	}

	public Double getLocation_Y() {
		return Location_Y;
	}

	public void setLocation_Y(Double location_Y) {
		Location_Y = location_Y;
	}

	public String getScale() {
		return Scale;
	}

	public void setScale(String scale) {
		Scale = scale;
	}

	public String getLabel() {
		return Label;
	}

	public void setLabel(String label) {
		Label = label;
	}

}
