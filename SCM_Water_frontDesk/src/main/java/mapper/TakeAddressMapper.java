package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import pojo.TakeAddress;

public interface TakeAddressMapper {
    int delete(Integer taId);

    int insert(TakeAddress record);

    int insertSelective(TakeAddress record);


    int updateByPrimaryKeySelective(TakeAddress record);

    int updateByPrimaryKey(TakeAddress record);

	List<TakeAddress> selectByPrimaryKey(int userid);
    @Select("select * from take_address where ta_id=#{taId}")
	TakeAddress findByTakeAddress(Integer taId);
}