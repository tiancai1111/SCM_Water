package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pojo.Order;
import pojo.Shopping;
import pojo.User;

public interface WalletMapper {
	User selUserById(int userId);

	int selMaxOderId();

	int updUserMoney(@Param("money") float money, @Param("userId") int userId);

	int minusUserMoney(@Param("money") float money, @Param("userId") int userId);

	int addOrder(Order order);

	int delCartByUserId(int userId);

	int addCommodityOrder(@Param("shoppingList") List<Shopping> shoppingList, @Param("orderId") int orderId);

	int insertCommodityOrder(@Param("commodityIdd") int commodityIdd, @Param("orderId") int orderId,
			@Param("count") int count);

	int delUserGiftcouponById(@Param("id")int id);
}