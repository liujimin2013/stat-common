/**
 * Copyright 2015-北京中联易达科技有限公司
 */
package com.chengcai.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author 
 */
@Getter
@AllArgsConstructor
public enum AccountDetailTypeEnum {

	DEPOSIT(100, "充值"), DEDUCT(1, "扣款");

    private Integer code;

    private String desc;

}
