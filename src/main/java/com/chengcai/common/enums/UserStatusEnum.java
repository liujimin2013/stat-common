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
public enum UserStatusEnum {

	YES(1, "正常"), NO(0, "禁用");

    private Integer code;

    private String desc;

}
