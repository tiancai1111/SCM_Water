package mapper;

import org.apache.ibatis.annotations.Param;

import pojo.User;

public interface WalletMapper {
    User selUserMoneyById(int userId);
    int updUserMoney(@Param("money")float money,@Param("userId")int userId);
}