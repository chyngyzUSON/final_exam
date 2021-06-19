package com.example.demo.request;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestServiceImpl implements RequestService{
    private final RequestRepo requestRepo;

    public RequestServiceImpl(RequestRepo requestRepo) {
        this.requestRepo = requestRepo;
    }

    @Override
    public Request create(Request request) {
        return requestRepo.save(request);
    }

    @Override
    public Integer counter() {
        List<Request> requests = requestRepo.findAll();
        Integer count = 0;
        for (int i = 0; i < requests.size(); i++){
            count += 1;
        }
        return count;
    }

    @Override
    public List<Request> getAllRequests() {
        return requestRepo.findAll();
    }
}
