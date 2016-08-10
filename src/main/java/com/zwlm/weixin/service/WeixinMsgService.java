package com.zwlm.weixin.service;

import com.zwlm.weixin.entity.Msg;
import com.zwlm.weixin.entity.ReMsg;

public interface WeixinMsgService {

	/**
	 * 
	 *
	 * @param msg		
	 * @return
	 */
	/**
	 * 接收消息转化为返回消息
	 *
	 * @param msg	接收消息对象
	 * @return
	 * 
	 * @author 低至一折起	dizhiyizheqi
	 */
	ReMsg msgToReMsg(Msg msg);

}
