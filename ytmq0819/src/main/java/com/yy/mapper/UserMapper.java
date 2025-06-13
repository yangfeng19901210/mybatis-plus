package com.yy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yy.entity.User;
import org.apache.ibatis.annotations.Mapper;

/*********************************************************
 ** 
 ** <br><br>
 ** @ClassName: UserMapper
 ** @author: yangfeng
 ** @date: 2025/6/13 8:49
 ** @version: 1.0.0
 *********************************************************/
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
