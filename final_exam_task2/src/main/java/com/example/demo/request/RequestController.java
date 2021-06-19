package com.example.demo.request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class RequestController {
    private final RequestService requestService;

    public RequestController(RequestService requestService) {
        this.requestService = requestService;
    }

    @PostMapping("/counter")
    public Request createRequest(@RequestBody Request request){
        return requestService.create(request);
    }

    @GetMapping("/counter")
    public String allRequests(){
        Integer requests = requestService.counter();
        return "Total number of requests: " + requests;
    }

    @GetMapping("/report")
    public List<Request> getAllRequestList(){
        return requestService.getAllRequests();
    }
}
