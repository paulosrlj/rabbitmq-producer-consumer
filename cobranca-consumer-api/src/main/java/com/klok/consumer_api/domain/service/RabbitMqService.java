package com.klok.consumer_api.domain.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMqService {
	
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	public void enviaMensagem(String nomeFila, Object mensagem) {
		this.rabbitTemplate.convertAndSend(nomeFila, mensagem);
	}
	
}
