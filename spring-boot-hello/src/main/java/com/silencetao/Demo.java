package com.silencetao;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 测试实体类
 * @author Silence
 * create time 2017年11月25日 下午5:44:04
 * @version 1.0.1
 */
public class Demo {

	private int id;
	
	private String name;
	
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;
	
	/**
	 * 不返回remark
	 * serialize表示是否需要序列化属性
	 */
	@JSONField(serialize = false)
	private String remark;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
