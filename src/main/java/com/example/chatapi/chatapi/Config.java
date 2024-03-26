package com.example.chatapi.chatapi;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("database")
public record Config(String db_username, String db_password, String db_url) {

}
