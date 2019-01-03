package mapper;

import java.util.List;

import pojo.Shopping;

public interface ShoppingMapper {
	List<Shopping> selByUserId(int userId);
}