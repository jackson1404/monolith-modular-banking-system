package com.jackson.testing_monolith_single_maven.locationspointer.controller;

import com.jackson.testing_monolith_single_maven.locationspointer.service.LocationPointerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class LocationController {

    @Autowired
    private LocationPointerService locationPointerService;

    @GetMapping("/nearBy")
    public ResponseEntity<List<Map<String, Object>>> fetchNearByPOIs(
            @RequestParam String userAddress,
            @RequestParam String type
    ) throws InterruptedException {
        List<Map<String, Object>> result = locationPointerService.fetchNearByPOIs(userAddress, type);
        return ResponseEntity.ok(result);
    }
}
