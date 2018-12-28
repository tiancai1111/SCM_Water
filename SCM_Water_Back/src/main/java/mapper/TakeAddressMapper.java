package mapper;

import pojo.TakeAddress;

public interface TakeAddressMapper {
    int deleteByPrimaryKey(Integer taId);

    int insert(TakeAddress record);

    int insertSelective(TakeAddress record);

    TakeAddress selectByPrimaryKey(Integer taId);

    int updateByPrimaryKeySelective(TakeAddress record);

    int updateByPrimaryKey(TakeAddress record);
}