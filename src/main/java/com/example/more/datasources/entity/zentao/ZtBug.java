/*
 * Copyright (c) 2018 easyreport.com All rights reserved.
 * 本软件源代码版权归----所有,未经许可不得任意复制与传播.
 */
package com.example.more.datasources.entity.zentao;
import java.util.Date;

/**
 * ztBug
 * @author kkliu
 * @since 2018-11-28
 */
public class ZtBug {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String product;
	private String branch;
	private String module;
	private String project;
	private String plan;
	private String story;
	private String storyVersion;
	private String task;
	private String toTask;
	private String toStory;
	private String title;
	private String keywords;
	private Integer severity;
	private Integer pri;
	private String type;
	private String os;
	private String browser;
	private String hardware;
	private String found;
	private String steps;
	private String status;
	private String color;
	private Integer confirmed;
	private String activatedCount;
	private Date activatedDate;
	private String mailto;
	private String openedBy;
	private Date openedDate;
	private String openedBuild;
	private String assignedTo;
	private Date assignedDate;
	private String deadline;
	private String resolvedBy;
	private String resolution;
	private String resolvedBuild;
	private Date resolvedDate;
	private String closedBy;
	private Date closedDate;
	private String duplicateBug;
	private String linkBug;
	private String jcase;
	private String caseVersion;
	private String result;
	private String testtask;
	private String lastEditedBy;
	private Date lastEditedDate;
	private String deleted;

	public ZtBug(){
		//默认无参构造方法
	}

	/**
	 * 获取 product
	 * @return
	 */
	public String getProduct(){
		return product;
	}

	/**
	 * 设置 product
	 * @param product
	 */
	public void setProduct(String product){
		this.product = product;
	}

	/**
	 * 获取 branch
	 * @return
	 */
	public String getBranch(){
		return branch;
	}

	/**
	 * 设置 branch
	 * @param branch
	 */
	public void setBranch(String branch){
		this.branch = branch;
	}

	/**
	 * 获取 module
	 * @return
	 */
	public String getModule(){
		return module;
	}

	/**
	 * 设置 module
	 * @param module
	 */
	public void setModule(String module){
		this.module = module;
	}

	/**
	 * 获取 project
	 * @return
	 */
	public String getProject(){
		return project;
	}

	/**
	 * 设置 project
	 * @param project
	 */
	public void setProject(String project){
		this.project = project;
	}

	/**
	 * 获取 plan
	 * @return
	 */
	public String getPlan(){
		return plan;
	}

	/**
	 * 设置 plan
	 * @param plan
	 */
	public void setPlan(String plan){
		this.plan = plan;
	}

	/**
	 * 获取 story
	 * @return
	 */
	public String getStory(){
		return story;
	}

	/**
	 * 设置 story
	 * @param story
	 */
	public void setStory(String story){
		this.story = story;
	}

	/**
	 * 获取 storyVersion
	 * @return
	 */
	public String getStoryVersion(){
		return storyVersion;
	}

	/**
	 * 设置 storyVersion
	 * @param storyVersion
	 */
	public void setStoryVersion(String storyVersion){
		this.storyVersion = storyVersion;
	}

	/**
	 * 获取 task
	 * @return
	 */
	public String getTask(){
		return task;
	}

	/**
	 * 设置 task
	 * @param task
	 */
	public void setTask(String task){
		this.task = task;
	}

	/**
	 * 获取 toTask
	 * @return
	 */
	public String getToTask(){
		return toTask;
	}

	/**
	 * 设置 toTask
	 * @param toTask
	 */
	public void setToTask(String toTask){
		this.toTask = toTask;
	}

	/**
	 * 获取 toStory
	 * @return
	 */
	public String getToStory(){
		return toStory;
	}

	/**
	 * 设置 toStory
	 * @param toStory
	 */
	public void setToStory(String toStory){
		this.toStory = toStory;
	}

	/**
	 * 获取 title
	 * @return
	 */
	public String getTitle(){
		return title;
	}

	/**
	 * 设置 title
	 * @param title
	 */
	public void setTitle(String title){
		this.title = title;
	}

	/**
	 * 获取 keywords
	 * @return
	 */
	public String getKeywords(){
		return keywords;
	}

	/**
	 * 设置 keywords
	 * @param keywords
	 */
	public void setKeywords(String keywords){
		this.keywords = keywords;
	}

	/**
	 * 获取 severity
	 * @return
	 */
	public Integer getSeverity(){
		return severity;
	}

	/**
	 * 设置 severity
	 * @param severity
	 */
	public void setSeverity(Integer severity){
		this.severity = severity;
	}

	/**
	 * 获取 pri
	 * @return
	 */
	public Integer getPri(){
		return pri;
	}

	/**
	 * 设置 pri
	 * @param pri
	 */
	public void setPri(Integer pri){
		this.pri = pri;
	}

	/**
	 * 获取 type
	 * @return
	 */
	public String getType(){
		return type;
	}

	/**
	 * 设置 type
	 * @param type
	 */
	public void setType(String type){
		this.type = type;
	}

	/**
	 * 获取 os
	 * @return
	 */
	public String getOs(){
		return os;
	}

	/**
	 * 设置 os
	 * @param os
	 */
	public void setOs(String os){
		this.os = os;
	}

	/**
	 * 获取 browser
	 * @return
	 */
	public String getBrowser(){
		return browser;
	}

	/**
	 * 设置 browser
	 * @param browser
	 */
	public void setBrowser(String browser){
		this.browser = browser;
	}

	/**
	 * 获取 hardware
	 * @return
	 */
	public String getHardware(){
		return hardware;
	}

	/**
	 * 设置 hardware
	 * @param hardware
	 */
	public void setHardware(String hardware){
		this.hardware = hardware;
	}

	/**
	 * 获取 found
	 * @return
	 */
	public String getFound(){
		return found;
	}

	/**
	 * 设置 found
	 * @param found
	 */
	public void setFound(String found){
		this.found = found;
	}

	/**
	 * 获取 steps
	 * @return
	 */
	public String getSteps(){
		return steps;
	}

	/**
	 * 设置 steps
	 * @param steps
	 */
	public void setSteps(String steps){
		this.steps = steps;
	}

	/**
	 * 获取 status
	 * @return
	 */
	public String getStatus(){
		return status;
	}

	/**
	 * 设置 status
	 * @param status
	 */
	public void setStatus(String status){
		this.status = status;
	}

	/**
	 * 获取 color
	 * @return
	 */
	public String getColor(){
		return color;
	}

	/**
	 * 设置 color
	 * @param color
	 */
	public void setColor(String color){
		this.color = color;
	}

	/**
	 * 获取 confirmed
	 * @return
	 */
	public Integer getConfirmed(){
		return confirmed;
	}

	/**
	 * 设置 confirmed
	 * @param confirmed
	 */
	public void setConfirmed(Integer confirmed){
		this.confirmed = confirmed;
	}

	/**
	 * 获取 activatedCount
	 * @return
	 */
	public String getActivatedCount(){
		return activatedCount;
	}

	/**
	 * 设置 activatedCount
	 * @param activatedCount
	 */
	public void setActivatedCount(String activatedCount){
		this.activatedCount = activatedCount;
	}

	/**
	 * 获取 activatedDate
	 * @return
	 */
	public Date getActivatedDate(){
		return activatedDate;
	}

	/**
	 * 设置 activatedDate
	 * @param activatedDate
	 */
	public void setActivatedDate(Date activatedDate){
		this.activatedDate = activatedDate;
	}

	/**
	 * 获取 mailto
	 * @return
	 */
	public String getMailto(){
		return mailto;
	}

	/**
	 * 设置 mailto
	 * @param mailto
	 */
	public void setMailto(String mailto){
		this.mailto = mailto;
	}

	/**
	 * 获取 openedBy
	 * @return
	 */
	public String getOpenedBy(){
		return openedBy;
	}

	/**
	 * 设置 openedBy
	 * @param openedBy
	 */
	public void setOpenedBy(String openedBy){
		this.openedBy = openedBy;
	}

	/**
	 * 获取 openedDate
	 * @return
	 */
	public Date getOpenedDate(){
		return openedDate;
	}

	/**
	 * 设置 openedDate
	 * @param openedDate
	 */
	public void setOpenedDate(Date openedDate){
		this.openedDate = openedDate;
	}

	/**
	 * 获取 openedBuild
	 * @return
	 */
	public String getOpenedBuild(){
		return openedBuild;
	}

	/**
	 * 设置 openedBuild
	 * @param openedBuild
	 */
	public void setOpenedBuild(String openedBuild){
		this.openedBuild = openedBuild;
	}

	/**
	 * 获取 assignedTo
	 * @return
	 */
	public String getAssignedTo(){
		return assignedTo;
	}

	/**
	 * 设置 assignedTo
	 * @param assignedTo
	 */
	public void setAssignedTo(String assignedTo){
		this.assignedTo = assignedTo;
	}

	/**
	 * 获取 assignedDate
	 * @return
	 */
	public Date getAssignedDate(){
		return assignedDate;
	}

	/**
	 * 设置 assignedDate
	 * @param assignedDate
	 */
	public void setAssignedDate(Date assignedDate){
		this.assignedDate = assignedDate;
	}

	/**
	 * 获取 deadline
	 * @return
	 */
	public String getDeadline(){
		return deadline;
	}

	/**
	 * 设置 deadline
	 * @param deadline
	 */
	public void setDeadline(String deadline){
		this.deadline = deadline;
	}

	/**
	 * 获取 resolvedBy
	 * @return
	 */
	public String getResolvedBy(){
		return resolvedBy;
	}

	/**
	 * 设置 resolvedBy
	 * @param resolvedBy
	 */
	public void setResolvedBy(String resolvedBy){
		this.resolvedBy = resolvedBy;
	}

	/**
	 * 获取 resolution
	 * @return
	 */
	public String getResolution(){
		return resolution;
	}

	/**
	 * 设置 resolution
	 * @param resolution
	 */
	public void setResolution(String resolution){
		this.resolution = resolution;
	}

	/**
	 * 获取 resolvedBuild
	 * @return
	 */
	public String getResolvedBuild(){
		return resolvedBuild;
	}

	/**
	 * 设置 resolvedBuild
	 * @param resolvedBuild
	 */
	public void setResolvedBuild(String resolvedBuild){
		this.resolvedBuild = resolvedBuild;
	}

	/**
	 * 获取 resolvedDate
	 * @return
	 */
	public Date getResolvedDate(){
		return resolvedDate;
	}

	/**
	 * 设置 resolvedDate
	 * @param resolvedDate
	 */
	public void setResolvedDate(Date resolvedDate){
		this.resolvedDate = resolvedDate;
	}

	/**
	 * 获取 closedBy
	 * @return
	 */
	public String getClosedBy(){
		return closedBy;
	}

	/**
	 * 设置 closedBy
	 * @param closedBy
	 */
	public void setClosedBy(String closedBy){
		this.closedBy = closedBy;
	}

	/**
	 * 获取 closedDate
	 * @return
	 */
	public Date getClosedDate(){
		return closedDate;
	}

	/**
	 * 设置 closedDate
	 * @param closedDate
	 */
	public void setClosedDate(Date closedDate){
		this.closedDate = closedDate;
	}

	/**
	 * 获取 duplicateBug
	 * @return
	 */
	public String getDuplicateBug(){
		return duplicateBug;
	}

	/**
	 * 设置 duplicateBug
	 * @param duplicateBug
	 */
	public void setDuplicateBug(String duplicateBug){
		this.duplicateBug = duplicateBug;
	}

	/**
	 * 获取 linkBug
	 * @return
	 */
	public String getLinkBug(){
		return linkBug;
	}

	/**
	 * 设置 linkBug
	 * @param linkBug
	 */
	public void setLinkBug(String linkBug){
		this.linkBug = linkBug;
	}

	/**
	 * 获取 jcase
	 * @return
	 */
	public String getJcase(){
		return jcase;
	}

	/**
	 * 设置 jcase
	 * @param jcase
	 */
	public void setJcase(String jcase){
		this.jcase = jcase;
	}

	/**
	 * 获取 caseVersion
	 * @return
	 */
	public String getCaseVersion(){
		return caseVersion;
	}

	/**
	 * 设置 caseVersion
	 * @param caseVersion
	 */
	public void setCaseVersion(String caseVersion){
		this.caseVersion = caseVersion;
	}

	/**
	 * 获取 result
	 * @return
	 */
	public String getResult(){
		return result;
	}

	/**
	 * 设置 result
	 * @param result
	 */
	public void setResult(String result){
		this.result = result;
	}

	/**
	 * 获取 testtask
	 * @return
	 */
	public String getTesttask(){
		return testtask;
	}

	/**
	 * 设置 testtask
	 * @param testtask
	 */
	public void setTesttask(String testtask){
		this.testtask = testtask;
	}

	/**
	 * 获取 lastEditedBy
	 * @return
	 */
	public String getLastEditedBy(){
		return lastEditedBy;
	}

	/**
	 * 设置 lastEditedBy
	 * @param lastEditedBy
	 */
	public void setLastEditedBy(String lastEditedBy){
		this.lastEditedBy = lastEditedBy;
	}

	/**
	 * 获取 lastEditedDate
	 * @return
	 */
	public Date getLastEditedDate(){
		return lastEditedDate;
	}

	/**
	 * 设置 lastEditedDate
	 * @param lastEditedDate
	 */
	public void setLastEditedDate(Date lastEditedDate){
		this.lastEditedDate = lastEditedDate;
	}

	/**
	 * 获取 deleted
	 * @return
	 */
	public String getDeleted(){
		return deleted;
	}

	/**
	 * 设置 deleted
	 * @param deleted
	 */
	public void setDeleted(String deleted){
		this.deleted = deleted;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
