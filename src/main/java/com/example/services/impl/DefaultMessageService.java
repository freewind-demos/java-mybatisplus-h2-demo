package com.example.services.impl;

import com.example.entities.Message;
import com.example.mappers.MessageMapper;
import com.example.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultMessageService implements MessageService {
    @Autowired
    private MessageMapper messageMapper;

    @Override
    public List<Message> findAll() {
        return this.messageMapper.selectList(null);
    }

    @Override
    public Message findById(String id) {
        return this.messageMapper.selectById(id);
    }

    @Override
    public void create(Message message) {
        this.messageMapper.insert(message);
    }
}
