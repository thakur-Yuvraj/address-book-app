package com.addressbook.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contact")
public class Controller {

    // testing if REST controller is working or not
    @GetMapping("/test")
    public ResponseEntity<String> testerGet() {
        return ResponseEntity.ok("This is Test get mapping");
    }

    // get by id
    @GetMapping("/test/{id}")
    public ResponseEntity<String> testerGetById(@PathVariable int id) {
        return ResponseEntity.ok("This is Test get mapping by id : "+ id);
    }

    // testing the post mapping
    @PostMapping("/test")
    public ResponseEntity<String> testerPost() {
        return ResponseEntity.ok("This is Test Post mapping");
    }

    // put to update by id
    @PutMapping("/test/{id}")
    public ResponseEntity<String> testerPut(@PathVariable int id, @RequestParam String details) {
        return ResponseEntity.ok("This is Test Put mapping inputted id is : " + id + " Details given by user is : "+ details);
    }

    // testing the delete mapping
    @DeleteMapping("/test")
    public ResponseEntity<String> testerDelete() {
        return ResponseEntity.ok("This is Test Delete mapping");
    }

}
