package com.zc.api.model.resp.gkpt;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

@ApiModel(value = "考核数据")
@JsonInclude(JsonInclude.Include.NON_NULL) // 不输出NULL字段
public class CheckCountyModelResp implements Serializable {
	
	private static final long serialVersionUID = -90212727088040441L;

	/// <summary>
	/// 考核点名称
	/// </summary>
	public String PointName ;
	/// <summary>
	/// 考核分数
	/// </summary>
	public String Score ;
	/// <summary>
	/// 综合排名
	/// </summary>
	public String CompRanking ;
	/// <summary>
	/// 综合指数
	/// </summary>
	public String CompIndex ;
	/// <summary>
	/// 绝对值排名
	/// </summary>
	public String AbsRanking ;
	/// <summary>
	/// 同期变化率
	/// </summary>
	public String RateOfSame ;
	/// <summary>
	/// 同期变化率排名
	/// </summary>
	public String RateOfSameRanking ;
	/// <summary>
	/// pm2.5
	/// </summary>
	public String PM25 ;
	/// <summary>
	/// pm2.5绝对值排名
	/// </summary>
	public String PM25_AbsRanking ;
	/// <summary>
	/// pm2.5同期变化率
	/// </summary>
	public String PM25_RateOfSame ;
	/// <summary>
	/// pm2.5同期变化率排名
	/// </summary>
	public String PM25_RateOfSameRanking ;
	/// <summary>
	/// 奖惩情况
	/// </summary>
	public String Reward ;
	/// <summary>
	/// 所属分组
	/// </summary>
	public String 分组 ;

	public String getPointName() {
		return PointName;
	}

	public void setPointName(String pointName) {
		PointName = pointName;
	}

	public String getScore() {
		return Score;
	}

	public void setScore(String score) {
		Score = score;
	}

	public String getCompRanking() {
		return CompRanking;
	}

	public void setCompRanking(String compRanking) {
		CompRanking = compRanking;
	}

	public String getCompIndex() {
		return CompIndex;
	}

	public void setCompIndex(String compIndex) {
		CompIndex = compIndex;
	}

	public String getAbsRanking() {
		return AbsRanking;
	}

	public void setAbsRanking(String absRanking) {
		AbsRanking = absRanking;
	}

	public String getRateOfSame() {
		return RateOfSame;
	}

	public void setRateOfSame(String rateOfSame) {
		RateOfSame = rateOfSame;
	}

	public String getRateOfSameRanking() {
		return RateOfSameRanking;
	}

	public void setRateOfSameRanking(String rateOfSameRanking) {
		RateOfSameRanking = rateOfSameRanking;
	}

	public String getPM25() {
		return PM25;
	}

	public void setPM25(String PM25) {
		this.PM25 = PM25;
	}

	public String getPM25_AbsRanking() {
		return PM25_AbsRanking;
	}

	public void setPM25_AbsRanking(String PM25_AbsRanking) {
		this.PM25_AbsRanking = PM25_AbsRanking;
	}

	public String getPM25_RateOfSame() {
		return PM25_RateOfSame;
	}

	public void setPM25_RateOfSame(String PM25_RateOfSame) {
		this.PM25_RateOfSame = PM25_RateOfSame;
	}

	public String getPM25_RateOfSameRanking() {
		return PM25_RateOfSameRanking;
	}

	public void setPM25_RateOfSameRanking(String PM25_RateOfSameRanking) {
		this.PM25_RateOfSameRanking = PM25_RateOfSameRanking;
	}

	public String getReward() {
		return Reward;
	}

	public void setReward(String reward) {
		Reward = reward;
	}

	public String get分组() {
		return 分组;
	}

	public void set分组(String 分组) {
		this.分组 = 分组;
	}
}
