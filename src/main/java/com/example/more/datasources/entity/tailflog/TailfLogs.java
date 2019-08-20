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
	private String server_name;
	@Column(name="project_id")
	private Integer project_id;
	@Column(name="log_path")
	private String log_path;
	@Column(name="log_name")
	private String log_name;
	@Column(name="create_time")
	private Date create_time;

	public TailfLogs(){
		//默认无参构造方法
	}

	@Override
	public String toString() {
		return "TailfLogs{" +
				"id=" + id +
				", server_name='" + server_name + '\'' +
				", project_id=" + project_id +
				", log_path='" + log_path + '\'' +
				", log_name='" + log_name + '\'' +
				", create_time=" + create_time +
				'}';
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getServer_name() {
		return server_name;
	}

	public void setServer_name(String server_name) {
		this.server_name = server_name;
	}

	public Integer getProject_id() {
		return project_id;
	}

	public void setProject_id(Integer project_id) {
		this.project_id = project_id;
	}

	public String getLog_path() {
		return log_path;
	}

	public void setLog_path(String log_path) {
		this.log_path = log_path;
	}

	public String getLog_name() {
		return log_name;
	}

	public void setLog_name(String log_name) {
		this.log_name = log_name;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public TailfLogs(String server_name, Integer project_id, String log_path, String log_name, Date create_time) {
		this.server_name = server_name;
		this.project_id = project_id;
		this.log_path = log_path;
		this.log_name = log_name;
		this.create_time = create_time;
	}
}
