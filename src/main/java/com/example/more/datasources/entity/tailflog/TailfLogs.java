/*
 * Copyright (c) 2019 tailflog.com All rights reserved.
 * 本软件源代码版权归----所有,未经许可不得任意复制与传播.
 */
package com.example.more.datasources.entity.tailflog;

import javax.persistence.*;
import java.util.Date;

/**
 * tailfLogs
 * @author liukunkun
 * @since 2019-07-04
 */
@Entity
@Table(name="tailf_logs")
public class TailfLogs {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="server_name")
	private String serverName;
	@Column(name="project_id")
	private Integer projectId;
	@Column(name="log_path")
	private String logPath;
	@Column(name="log_name")
	private String logName;
	@Column(name="create_time")
	private Date createTime;

	public TailfLogs(){
		//默认无参构造方法
	}

	public TailfLogs(Integer id , String serverName) {
		this.id =id;
		this.serverName = serverName;
	}

	@Override
	public String toString() {
		return "TailfLogs{" +
				"id=" + id +
				", serverName='" + serverName + '\'' +
				", projectId=" + projectId +
				", logPath='" + logPath + '\'' +
				", logName='" + logName + '\'' +
				", createTime=" + createTime +
				'}';
	}


	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TailfLogs(int id, String serverName, Integer projectId, String logPath, String logName, Date createTime) {
		this.id = id;
		this.serverName = serverName;
		this.projectId = projectId;
		this.logPath = logPath;
		this.logName = logName;
		this.createTime = createTime;
	}

	/**
	 * 获取 服务名称
	 * @return
	 */
	public String getServerName(){
		return serverName;
	}

	/**
	 * 设置 服务名称
	 * @param serverName
	 */
	public void setServerName(String serverName){
		this.serverName = serverName;
	}

	/**
	 * 获取 服务器id
	 * @return
	 */
	public Integer getProjectId(){
		return projectId;
	}

	/**
	 * 设置 服务器id
	 * @param projectId
	 */
	public void setProjectId(Integer projectId){
		this.projectId = projectId;
	}

	/**
	 * 获取 日志路径
	 * @return
	 */
	public String getLogPath(){
		return logPath;
	}

	/**
	 * 设置 日志路径
	 * @param logPath
	 */
	public void setLogPath(String logPath){
		this.logPath = logPath;
	}

	/**
	 * 获取 日志文件名称
	 * @return
	 */
	public String getLogName(){
		return logName;
	}

	/**
	 * 设置 日志文件名称
	 * @param logName
	 */
	public void setLogName(String logName){
		this.logName = logName;
	}

	/**
	 * 获取 创建时间
	 * @return
	 */
	public Date getCreateTime(){
		return createTime;
	}

	/**
	 * 设置 创建时间
	 * @param createTime
	 */
	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}
}
