package com.shop.project.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.shop.project.vo.Member;

@Mapper
public interface MemberMapper {
	List<Member> selectMember(Member member);
}
