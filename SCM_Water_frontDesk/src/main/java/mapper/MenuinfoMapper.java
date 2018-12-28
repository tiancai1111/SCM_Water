package mapper;

import pojo.Menuinfo;

public interface MenuinfoMapper {
    int deleteByPrimaryKey(Integer menuid);

    int insert(Menuinfo record);

    int insertSelective(Menuinfo record);

    Menuinfo selectByPrimaryKey(Integer menuid);

    int updateByPrimaryKeySelective(Menuinfo record);

    int updateByPrimaryKey(Menuinfo record);
}