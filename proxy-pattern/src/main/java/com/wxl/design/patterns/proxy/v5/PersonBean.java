/**
 * 
 */
package com.wxl.design.patterns.proxy.v5;

/**
 *
 * @author Wang XueLong
 * @Date 2017年3月21日 下午9:09:49
 */
public interface PersonBean {
	public String getName();

	public String getGender();

	public String getInterests();

	public int getHotOrNotRating();

	public void setName(String name);

	public void setGender(String gender);

	public void setInterests(String interests);

	public void setHotOrNotRating(int rating);
}
