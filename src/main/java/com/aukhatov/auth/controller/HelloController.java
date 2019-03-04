package com.aukhatov.auth.controller;

import com.aukhatov.auth.model.Message;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/rest")
@Api(tags = "auth")
public class HelloController {

	@PreAuthorize("hasAuthority('ROLE_USER')")
	@GetMapping("/hello/{message}")
	@ApiOperation("Hello")
	public Message message(@ApiParam("message") @PathVariable String message) {
		return new Message(message);
	}
}
