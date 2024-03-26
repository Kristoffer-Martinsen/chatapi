package com.example.chatapi.chatapi.models;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "messages")
public class Message {
  @Id
  private int id;
  private String message;
  @JsonProperty("userId")
  private int userId;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
}
