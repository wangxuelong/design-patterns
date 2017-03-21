/**
 * 
 */
package com.wxl.design.patterns.proxy.v5;

/**
 *
 * @author Wang XueLong
 * @Date 2017年3月21日 下午9:12:31
 */
public class PersonBeanImpl implements PersonBean {
	private String name;
	private String gender;
	private String interests;
	private int rating;
	private int ratingCount = 0;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.proxy.v5.PersonBean#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.proxy.v5.PersonBean#getGender()
	 */
	@Override
	public String getGender() {
		// TODO Auto-generated method stub
		return gender;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.proxy.v5.PersonBean#getInterests()
	 */
	@Override
	public String getInterests() {
		// TODO Auto-generated method stub
		return interests;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.proxy.v5.PersonBean#getHotOrNotRating()
	 */
	@Override
	public int getHotOrNotRating() {
		if (ratingCount == 0) {
			return 0;
		}
		return (rating / ratingCount);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wxl.design.patterns.proxy.v5.PersonBean#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wxl.design.patterns.proxy.v5.PersonBean#setGender(java.lang.String)
	 */
	@Override
	public void setGender(String gender) {
		this.gender = gender;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.proxy.v5.PersonBean#setInterests(java.lang.
	 * String)
	 */
	@Override
	public void setInterests(String interests) {
		this.interests = interests;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wxl.design.patterns.proxy.v5.PersonBean#setHotOrNotRating(int)
	 */
	@Override
	public void setHotOrNotRating(int rating) {
		this.rating += rating;
		ratingCount++;
	}

}
