package com.example.mappers;

import com.example.entities.Message;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MessageMapper {

    @Select("SELECT * FROM messages")
    public List<Message> findAll();

    @Select("SELECT * FROM messages WHERE id = #{id}")
    public Message findById(String id);

    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    @Insert("INSERT INTO messages(text) VALUES(#{text})")
    public void create(Message message);

}
