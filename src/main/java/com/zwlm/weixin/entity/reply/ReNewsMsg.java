package com.zwlm.weixin.entity.reply;

import java.util.List;

import com.zwlm.weixin.constant.Weixin;
import com.zwlm.weixin.entity.ReMsg;

/**
 * 回复用户图文消息对象
 * 
 * @author 低至一折起 dizhiyizheqi
 *
 */
public class ReNewsMsg extends ReMsg {

	/**
	 * 序列号
	 */
	private static final long serialVersionUID = -6329100599035814484L;

	/**
	 * 回复类型为news
	 */
	private String MsgType = Weixin.news;

	/**
	 * 图文消息个数，限制为10条以内
	 */
	private Integer ArticleCount;

	/**
	 * 多条图文消息信息，默认第一个item为大图,注意，如果图文数超过10，则将会无响应
	 */
	private List<Pic> Articles;

	public String getMsgType() {
		return MsgType;
	}

	public Integer getArticleCount() {
		return ArticleCount;
	}

	public void setArticleCount(Integer articleCount) {
		ArticleCount = articleCount;
	}

	public List<Pic> getArticles() {
		return Articles;
	}

	public void setArticles(List<Pic> articles) {
		Articles = articles;
	}

}
