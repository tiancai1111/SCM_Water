package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import pojo.Supplier;
import pojo.User;

public interface SupplierMapper {
    int deleteByPrimaryKey(Integer supplierid);

    int insert(Supplier record);

    int insertSelective(Supplier record);

    Supplier selectByPrimaryKey(Integer supplierid);

    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);
    
    //查看提供商
    /*@Select("Select * from Supplier")*/
    List<Supplier> SupplierAll(@Param("suppliername")String suppliername);
    
    @Select("Select * from Supplier where supplierid=#{supplierid}")
    Supplier SupplierUpdataAll(int supplierid);

    @Update("UPDATE Supplier SET `suppliername` = #{suppliername},`suppliephone` =#{suppliephone},`suppliersite` = #{suppliersite},`suppliercontacts` = #{suppliercontacts} WHERE supplierid=#{supplierid}")
    int SupplierUp(Supplier supplier);
    
    @Delete("DELETE FROM Supplier WHERE `supplierid` = #{supplierid}")
	int createdelete(int supplierid);
    
    @Insert("INSERT INTO Supplier (`suppliername`,`suppliephone`,`suppliersite`,`suppliercontacts`) VALUES (#{suppliername},#{suppliephone},#{suppliersite},#{suppliercontacts})")
    int SupplierInsertAll(Supplier supplier);
    
}