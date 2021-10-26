package com.example.services;

import com.example.entities.Message;

import java.util.List;

public interface MessageService {

    public List<Message> findAll();

    public Message findById(String id);

    public void create(Message message);
}
