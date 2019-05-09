package com.zc.base.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.zc.base.constant.CodeEnum;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "返回值", description = "统一返回值包装类")
@JsonInclude(JsonInclude.Include.NON_NULL) // 不输出NULL字段
public class ReturnEntity<T> implements Serializable {
	
	private static final long serialVersionUID = 8604305629479659253L;

	/**
	 * 应答码
	 * @see 默认值为操作成功
	 */
	@ApiModelProperty(value = "应答码")
	private int status = CodeEnum.SUCCESS.getCode();
	
	/**
	 * 应答码描述
	 * @see 默认值为操作成功
	 */
	@ApiModelProperty(value = "应答码描述,返回给用户的提示在这里")
	private String message = CodeEnum.SUCCESS.getMessage();
	
	/**
	 * 错误详细描述
	 * @see 可以为空
	 */
	@ApiModelProperty(value = "错误消息,如果系统运行出错才有值,给程序员用")
	public String errorDesc;

	/**
	 * 应答数据体
	 * @see 可以为空
	 */
	@ApiModelProperty(value = "应答数据体")
	private T data;

	public ReturnEntity(int code, String message, String errorDesc, T data) {
		this.status = code;
		this.message = message;
		this.errorDesc = errorDesc;
		this.data = data;
	}
	
	/**
	 * 通用返回成功,不带数据体
	 * @param data
	 * @return
	 */
	public static <T> ReturnEntity<T> success(){
		return new ReturnEntity<T>(CodeEnum.SUCCESS.getCode(), CodeEnum.SUCCESS.getMessage(), null, null);
	}
	
	/**
	 * 通用返回成功,带数据体
	 * @param data
	 * @return
	 */
	public static <T> ReturnEntity<T> successForData(T data){
		return new ReturnEntity<T>(CodeEnum.SUCCESS.getCode(), CodeEnum.SUCCESS.getMessage(), null, data);
	}
	public static <T> ReturnEntity<T> successForData(T data,String message){
		return new ReturnEntity<T>(CodeEnum.SUCCESS.getCode(), message, null, data);
	}

	/**
	 * 通用返回失败,不带数据体
	 * @param data
	 * @return
	 */
	public static <T> ReturnEntity<T> error(){
		return new ReturnEntity<T>(CodeEnum.ERROR.getCode(), CodeEnum.ERROR.getMessage(), null, null);
	}
	public static <T> ReturnEntity<T> errorForDateMessage(T data,String message){
		return new ReturnEntity<T>(CodeEnum.ERROR.getCode(), message, null, data);
	}
	/**
	 * 通用返回失败,带数据体
	 * @param data
	 * @return
	 */
	public static <T> ReturnEntity<T> errorForDate(T data){
		return new ReturnEntity<T>(CodeEnum.ERROR.getCode(), CodeEnum.ERROR.getMessage(), null, data);
	}

	/**
	 * 通用返回失败,带描述
	 * @param desc 描述
	 * @return
	 */
	public static <T> ReturnEntity<T> errorForDesc(String desc){
		return new ReturnEntity<T>(CodeEnum.ERROR.getCode(), CodeEnum.ERROR.getMessage(), desc, null);
	}

	/**
	 * 自定义返回成功
	 * @param code
	 * @param message
	 * @param data
	 * @return
	 */
	public static <T> ReturnEntity<T> customSuccess(String message, T data){
		return new ReturnEntity<T>(CodeEnum.SUCCESS.getCode(), message, null, data);
	}
	
	/**
	 * 自定义返回失败
	 * @param code
	 * @param message
	 * @param data
	 * @return
	 */
	public static <T> ReturnEntity<T> customError(String message){
		return new ReturnEntity<T>(CodeEnum.ERROR.getCode(), message, null, null);
	}
	
	/**
	 * 自定义返回失败
	 * @param code
	 * @param message
	 * @param data
	 * @return
	 */
	public static <T> ReturnEntity<T> customError(int code, String message, T data){
		return new ReturnEntity<T>(code, message, null, data);
	}
	
	/**
	 * 自定义返回codeEnum
	 * @param codeEnum
	 * @param data
	 * @return
	 */
	public static <T> ReturnEntity<T> customCodeEnum(CodeEnum codeEnum, T data){
		return new ReturnEntity<T>(codeEnum.getCode(), codeEnum.getMessage(), null, data);
	}
	
	/**
	 * 自定义errorDesc返回
	 * @param errorDesc
	 * @return
	 */
	public static <T> ReturnEntity<T> customErrorDesc(String errorDesc){
		return new ReturnEntity<T>(CodeEnum.ERROR.getCode(), CodeEnum.ERROR.getMessage(), errorDesc, null);
	}
	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getErrorDesc() {
		return errorDesc;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
