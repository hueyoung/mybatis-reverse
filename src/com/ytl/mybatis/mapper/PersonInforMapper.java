package com.ytl.mybatis.mapper;

import com.ytl.mybatis.po.PersonInfor;
import com.ytl.mybatis.po.PersonInforExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonInforMapper {
    long countByExample(PersonInforExample example);

    int deleteByExample(PersonInforExample example);

    int insert(PersonInfor record);

    int insertSelective(PersonInfor record);

    List<PersonInfor> selectByExample(PersonInforExample example);

    int updateByExampleSelective(@Param("record") PersonInfor record, @Param("example") PersonInforExample example);

    int updateByExample(@Param("record") PersonInfor record, @Param("example") PersonInforExample example);
}