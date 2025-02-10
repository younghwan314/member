package com.example.member.controller;

import com.example.member.dto.MemberRequestDto;
import com.example.member.dto.MemberResponseDto;
import com.example.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/members")
    public ResponseEntity<MemberResponseDto> postMember(@RequestBody MemberRequestDto memberRequestDto) {
        return ResponseEntity.ok(memberService.postMember(memberRequestDto));
    }

    @GetMapping("/members")
    public List<MemberResponseDto> getMembers() {
        return memberService.getMembers();
    }
}
