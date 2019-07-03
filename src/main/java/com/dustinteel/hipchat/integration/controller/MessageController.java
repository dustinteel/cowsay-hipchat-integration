package com.dustinteel.hipchat.integration.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dustinteel.hipchat.integration.model.Incoming;

@RestController
public class MessageController {
	@PostMapping("/message-webhook")
	public HttpStatus processMessage(Incoming incoming) {
		return HttpStatus.OK;
	}
}
