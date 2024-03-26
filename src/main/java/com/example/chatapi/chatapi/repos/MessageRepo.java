package com.example.chatapi.chatapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.chatapi.chatapi.models.Message;

public interface MessageRepo extends JpaRepository<Message, Integer> {
  
}
