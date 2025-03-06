package com.example.demo.template;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class templateCtl {

	@GetMapping("")
	public ResponseEntity<String> getMethodName() {
		return ResponseEntity.ok("hello api test");
	}

	@GetMapping("/hello")
	@ResponseBody
	public ResponseEntity<TemplateVO> getMethodName222(TemplateVO vo) {
		return ResponseEntity.ok(vo);
	}

}
