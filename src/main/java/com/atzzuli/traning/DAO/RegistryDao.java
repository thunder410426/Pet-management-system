package com.atzzuli.traning.DAO;

import com.atzzuli.traning.entity.Registry;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RegistryDao {
    @Insert("insert into login values #{zc-username},#{zc-password}")
    List<Registry> registry(Registry registry);
}
