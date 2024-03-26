package com.example.chatapi.chatapi.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.chatapi.chatapi.models.Message;
import com.example.chatapi.chatapi.services.MessageService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/messages")
@RequiredArgsConstructor
@Validated
public class MessageController {
  
  private final MessageService messageService;

  @GetMapping("/")
  public ResponseEntity<List<Message>> getAllMessages() {
    return ResponseEntity.ok().body(messageService.getAllMessages());
  }

  @GetMapping("/{id}")
  public ResponseEntity<Message> getMessageById(@PathVariable("id") int id) {
    return ResponseEntity.ok().body(messageService.getMessageById(id));
  }

  @PostMapping("/")
  public ResponseEntity<Message> saveMessage(@RequestBody Message message) {
    System.out.println("postmapping message: " + message);
    return ResponseEntity.ok().body(messageService.saveMessage(message));
  }

  @PutMapping("/")
  public ResponseEntity<Message> updateMessage(@RequestBody Message message) {
    return ResponseEntity.ok().body(messageService.updateMessage(message));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<String> deleteMessageById(@PathVariable("id") int id) {
    messageService.deleteMessageById(id);
    return ResponseEntity.ok().body("Deleted message with id " + id);
  }
}
