package mapper;

import pojo.Chargeback;

public interface ChargebackMapper {
    int deleteByPrimaryKey(Integer chargebackid);

    int insert(Chargeback record);

    int insertSelective(Chargeback record);

    Chargeback selectByPrimaryKey(Integer chargebackid);

    int updateByPrimaryKeySelective(Chargeback record);

    int updateByPrimaryKey(Chargeback record);
}