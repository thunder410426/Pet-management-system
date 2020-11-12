package com.atzzuli.traning.DAO;

import com.atzzuli.traning.entity.Identity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface LoginDao {
    Identity login(Identity identity);
}
