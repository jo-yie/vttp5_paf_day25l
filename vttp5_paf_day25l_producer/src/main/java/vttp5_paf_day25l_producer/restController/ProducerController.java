package vttp5_paf_day25l_producer.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vttp5_paf_day25l_producer.model.Todo;
import vttp5_paf_day25l_producer.service.ProducerService;

@RestController
@RequestMapping("/api/messages")
public class ProducerController {

    @Autowired
    ProducerService producerService; 

    @PostMapping("")
    public ResponseEntity<String> sendMessage(@RequestBody Todo todo) { 

        producerService.sendMessage(todo); 

        return ResponseEntity.ok().body("Message sent");
        
    }
    
}
