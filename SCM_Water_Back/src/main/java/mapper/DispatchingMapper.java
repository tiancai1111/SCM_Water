package mapper;

import pojo.Dispatching;

public interface DispatchingMapper {
    int deleteByPrimaryKey(Integer dispatchingid);

    int insert(Dispatching record);

    int insertSelective(Dispatching record);

    Dispatching selectByPrimaryKey(Integer dispatchingid);

    int updateByPrimaryKeySelective(Dispatching record);

    int updateByPrimaryKey(Dispatching record);
}