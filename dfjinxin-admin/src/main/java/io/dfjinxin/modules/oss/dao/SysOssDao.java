/**
 * Copyright (c) 东方金信 All rights reserved.
 *
 * http://www.seaboxdata.com
 *
 * 版权所有，侵权必究！
 */

package io.dfjinxin.modules.oss.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.dfjinxin.modules.oss.entity.SysOssEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 文件上传
 *
 * @author Mark sunlightcs@gmail.com
 */
@Mapper
public interface SysOssDao extends BaseMapper<SysOssEntity> {
	
}
