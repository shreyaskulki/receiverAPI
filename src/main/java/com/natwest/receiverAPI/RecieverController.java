package com.natwest.receiverAPI;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.crypto.SealedObject;
import java.util.Base64;

@RestController
public class RecieverController {

    private static final Logger log = LoggerFactory.getLogger(RecieverController.class);
    @Autowired
    private RecieverRepository recieverRepository;

    public RecieverController() {
    }

    @PostMapping(value="/", consumes = {"*/*"})
    public  String postingTransaction (@RequestBody String request){
        byte [] decodedBytes = Base64.getDecoder().decode(request);
        String data = new String(decodedBytes);
        Transaction transaction = formatJson(data);
        Transaction transaction1 = recieverRepository.save(transaction);
        log.info("Transaction is persisted"+transaction1);
        return  data;
    }

    public Transaction formatJson(String data){
        try {
            Transaction transaction = new ObjectMapper().readValue(data,Transaction.class);

            return transaction;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
