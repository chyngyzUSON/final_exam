package com.example.demo.request;

import java.util.List;

public interface RequestService {
    Request create(Request request);
    Integer counter();
    List<Request> getAllRequests();
}
