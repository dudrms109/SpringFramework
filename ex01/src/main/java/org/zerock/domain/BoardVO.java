package org.zerock.domain;

import java.util.Date;

public class BoardVO {

	private Integer bno;
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	private int viewcnt;
	/**
	 * @return the bno
	 */
	public Integer getBno() {
		return bno;
	}
	/**
	 * @param bno the bno to set
	 */
	public void setBno(Integer bno) {
		this.bno = bno;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the writer
	 */
	public String getWriter() {
		return writer;
	}
	/**
	 * @param writer the writer to set
	 */
	public void setWriter(String writer) {
		this.writer = writer;
	}
	/**
	 * @return the regdate
	 */
	public Date getRegdate() {
		return regdate;
	}
	/**
	 * @param regdate the regdate to set
	 */
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	/**
	 * @return the viewcnt
	 */
	public int getViewcnt() {
		return viewcnt;
	}
	/**
	 * @param viewcnt the viewcnt to set
	 */
	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", title=" + title + ", content=" + content + ", writer=" + writer + ", regdate="
				+ regdate + ", viewcnt=" + viewcnt + "]";
	}
	
	
}
