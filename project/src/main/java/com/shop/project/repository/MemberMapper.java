package com.shop.project.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.shop.project.vo.Member;

@Mapper
public interface MemberMapper {
	List<Member> selectMember(Member member);

	void insertMember(@Param("member") Member member);
}
