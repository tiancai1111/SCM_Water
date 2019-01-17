package service;

import java.util.List;

import pojo.TakeAddress;

public interface TakeAddressService {
   int add(TakeAddress takeAddress);
   int delect(TakeAddress takeAddress);
   int update(TakeAddress takeAddress);
   List<TakeAddress> select(int userid);
   TakeAddress findByTakeAddress(Integer taId);
}