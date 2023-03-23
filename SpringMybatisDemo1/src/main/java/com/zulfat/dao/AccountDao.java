package com.zulfat.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import com.zulfat.domain.Account;

@Component
public interface AccountDao {
	
	
	@Insert("insert into account(name,money)values(#{name},#{money}")
	void save(Account account);
	
	@Delete("delete from account where id = #{id}")
	void delete(Integer id);	

	
	@Update("update account set name = #{name} , money = #{money} where id =#{id}")
	void update(Account account);
	
	
	
	@Select("select * from account where id=#{id}")
	Account findByID(Integer id);
	
	
	@Select("select * from account")
	List<Account> findAll();
	
	
	
}
