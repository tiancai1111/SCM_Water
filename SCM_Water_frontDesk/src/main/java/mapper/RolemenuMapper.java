package mapper;

import pojo.Rolemenu;

public interface RolemenuMapper {
    int deleteByPrimaryKey(Integer rolemenuid);

    int insert(Rolemenu record);

    int insertSelective(Rolemenu record);

    Rolemenu selectByPrimaryKey(Integer rolemenuid);

    int updateByPrimaryKeySelective(Rolemenu record);

    int updateByPrimaryKey(Rolemenu record);
}