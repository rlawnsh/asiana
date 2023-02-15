package com.shop.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.shop.project.service.MemberServiceImpl;
import com.shop.project.vo.Member;

@Controller
public class MemberController {

	private final MemberServiceImpl memberService;

	public MemberController(MemberServiceImpl memberService) {
		this.memberService = memberService;
	}

	@RequestMapping("/ShopMiniMall/main")
	public ModelAndView getMain(Member member) {
		ModelAndView mv = new ModelAndView("/ShopMiniMall/main");
		mv.addObject("data", memberService.getMember(member)); // 데이터 바꿔야함
		return mv;
	}

	@RequestMapping("/ShopMiniMall/member")
	public ModelAndView getMember(Member member) {
		ModelAndView mv = new ModelAndView("/ShopMiniMall/member");
		mv.addObject("data", memberService.getMember(member));
		return mv;
	}

	@RequestMapping("/ShopMiniMall/MemberUIServlet")
	public String insertMember(Model model, Member member) {
		model.addAttribute("member", member);
		return "/ShopMiniMall/memberShip";
	}

	// @RequestMapping("/login")
	// public String login(@RequestParam("id") String id) {
	// return "/ShopMiniMall/memberShip";
	// }
}
