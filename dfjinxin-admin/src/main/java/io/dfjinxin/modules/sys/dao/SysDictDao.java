/**
 * Copyright (c) 东方金信 All rights reserved.
 *
 * http://www.seaboxdata.com
 *
 * 版权所有，侵权必究！
 */

package io.dfjinxin.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.dfjinxin.modules.sys.entity.SysDictEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 数据字典
 *
 * @author Mark sunlightcs@gmail.com
 */
@Mapper
public interface SysDictDao extends BaseMapper<SysDictEntity> {
	
}
