package com.atzzuli.traning.DAO;

import com.atzzuli.traning.entity.Veterinary;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface VeterinaryDao {

    @Select("select * from msgveterinary")
    List<Veterinary> getveterinary();

    @Insert("insert into msgveterinary values (#{veterinaryid},#{veterinaryname},#{veterinaryage},#{veterinaryspecialty},#{veterinarynum},#{veterinarysex})")
    void insertVeterinary(Veterinary veterinary);

}