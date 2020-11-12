package com.atzzuli.traning.DAO;

import com.atzzuli.traning.entity.Customer;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CustomerDao {
    @Select("select * from msgcustomer")
    List<Customer> getCustomer();


    /**
     *销售表
     */
    @Insert("insert into msgcustomer values (#{cusid},#{cusname},#{custel}," +
            "#{cussex},#{cuspet1},#{cuspet2},#{cuspet3},#{cuspet4})")
    void insertCustomer(Customer customer);

}
