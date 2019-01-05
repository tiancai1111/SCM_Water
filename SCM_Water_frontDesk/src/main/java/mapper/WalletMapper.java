package mapper;

import pojo.User;

public interface WalletMapper {
    User selUserMoneyById(int userId);
    int addUserMoney(float money,int userId);
}