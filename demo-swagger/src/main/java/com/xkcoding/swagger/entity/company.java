package com.xkcoding.swagger.entity;

import io.swagger.annotations.ApiModel;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

/**
 * @description:
 * @author:maidang
 * @date:2021/10/30
 **/
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "机构实体", description = "User Entity")
@FieldDefaults(level = AccessLevel.PUBLIC)
public class company extends User{

}
