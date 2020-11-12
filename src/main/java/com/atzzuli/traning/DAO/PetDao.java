package com.atzzuli.traning.DAO;

import com.atzzuli.traning.entity.Pet;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * @author 刘京毫
 */
@Mapper
@Repository
public interface PetDao {

    @Insert("insert into pet values (#{pname},#{page},#{powner}," +
            "#{ptype},#{pdisease},#{pseverity})")
     void insertpet(Pet pet);

    @Select("select * from pet")
    List<Pet> getpet();

}
