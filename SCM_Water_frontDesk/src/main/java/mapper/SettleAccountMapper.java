package mapper;

import java.util.List;

import pojo.TakeAddress;

public interface SettleAccountMapper {
	List<TakeAddress> selTakeAddressByUserId(int userId);

}
