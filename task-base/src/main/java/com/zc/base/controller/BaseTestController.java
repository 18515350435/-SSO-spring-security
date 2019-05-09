package com.zc.base.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zc.base.entity.ReturnEntity;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "Base相关操作")
@RequestMapping("base")
@RestController
public class BaseTestController {
	
	private static final Logger logger = LoggerFactory.getLogger(BaseTestController.class);
	
	@ApiOperation(value = "BaseTest的demo：可调试作者:SX")
	@RequestMapping(value = "/demo", method = RequestMethod.GET)
	public ReturnEntity<Void> demo(){
		logger.info("我是baseTest/demo");
		return ReturnEntity.customSuccess("我是baseTest/demo", null);
	}

}
