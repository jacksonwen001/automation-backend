package com.chancetop.automation.mappers;

import com.chancetop.automation.examples.TProjectExample;
import com.chancetop.automation.models.TProject;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TProjectMapper {
    long countByExample(TProjectExample example);

    int deleteByExample(TProjectExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TProject record);

    int insertSelective(@Param("record") TProject record, @Param("selective") TProject.Column ... selective);

    List<TProject> selectByExampleSelective(@Param("example") TProjectExample example, @Param("selective") TProject.Column ... selective);

    List<TProject> selectByExample(TProjectExample example);

    TProject selectByPrimaryKeySelective(@Param("id") Long id, @Param("selective") TProject.Column ... selective);

    TProject selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TProject record, @Param("example") TProjectExample example, @Param("selective") TProject.Column ... selective);

    int updateByExample(@Param("record") TProject record, @Param("example") TProjectExample example);

    int updateByPrimaryKeySelective(@Param("record") TProject record, @Param("selective") TProject.Column ... selective);

    int updateByPrimaryKey(TProject record);

    int batchInsert(@Param("list") List<TProject> list);

    int batchInsertSelective(@Param("list") List<TProject> list, @Param("selective") TProject.Column ... selective);
}