package vttp5_paf_day25l_producer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import vttp5_paf_day25l_producer.model.Todo;

@Service
public class ProducerService {

    @Autowired
    @Qualifier("todo")
    RedisTemplate<String, Todo> redisTemplate; 
    
    @Value("${redis.topic1}")
    private String topic1; 

    // function to send message
    public void sendMessage(Todo todo) { 

        // publish data to redis queue
        redisTemplate.convertAndSend(topic1, todo);

    }

    
}
