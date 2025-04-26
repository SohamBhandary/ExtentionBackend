package com.Research.Assistant;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/research")
@RestController
@CrossOrigin(origins = "*")
@AllArgsConstructor
public class ReseachController {
    private final ResearchService researchService;
    @PostMapping("/process")
    public ResponseEntity<String> processContent(@RequestBody ResearchRequest request) {
        String result = researchService.processContent(request);
        return ResponseEntity.ok(result);
    }

}
