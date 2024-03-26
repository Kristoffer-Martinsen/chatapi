package com.example.chatapi.chatapi.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.chatapi.chatapi.models.Message;
import com.example.chatapi.chatapi.repos.MessageRepo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class MessageService {
  private final MessageRepo messageRepo;

  public List<Message> getAllMessages() {
    return messageRepo.findAll();
  }

  public Message getMessageById(int id) {
    Optional<Message> optionalMessage = messageRepo.findById(id);
    if (optionalMessage.isPresent()) {
      return optionalMessage.get();
    }
    log.info("Message with id: {} not found", id);
    return null;
  }

  public Message saveMessage(Message message) {
    message.setCreatedAt(LocalDateTime.now());
    message.setUpdatedAt(LocalDateTime.now());
    Message savedMessage = messageRepo.save(message);

    log.info("Message with id: {} saved", savedMessage.getId());
    return savedMessage;
  }

  public Message updateMessage(Message message) {
    Optional<Message> existingMessage = messageRepo.findById(message.getId());
    message.setCreatedAt(existingMessage.get().getCreatedAt());
    message.setUpdatedAt(LocalDateTime.now());

    Message updatedMessage = messageRepo.save(message);
    log.info("Message with id: {} updated", updatedMessage.getId());
    return updatedMessage;
  }

  public void deleteMessageById(int id) {
    messageRepo.deleteById(id);
  }
}
