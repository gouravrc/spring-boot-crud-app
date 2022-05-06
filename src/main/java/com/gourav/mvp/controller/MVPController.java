package com.gourav.mvp.controller;

import java.util.HashMap;
import java.util.Map;

import com.gourav.mvp.dtos.MVPDetails;
import com.gourav.mvp.service.MVPService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class MVPController {

    private Map<String, MVPDetails> mvpdetailsObj = new HashMap<String, MVPDetails>();

    @Autowired
    MVPService mvpService;

    /**
     * Below methods are dummy methods
     * Comment out to see the response in PostMan
     * @return
        @GetMapping("/getfirstapi")
        public String getAPI () {
            return mvpService.getFirstAPI();
        }

        @GetMapping("/getappName")
        public String getAppName () {
            return mvpService.getAppName();
        }

        @GetMapping("/getmvpresponse")
        public MVPJsonResponse getmvpResponse (){
            MVPJsonResponse mvpJsonResponse = new MVPJsonResponse("Gourav", "Roy");
            return mvpJsonResponse;
        }

        @GetMapping("/getmvppdto")
        public MVPDetails gMvpDetails (){
            MVPDetails mvpDetails = new MVPDetails("1","Gourav", "shyam");
            return mvpDetails;
        }
    */

    @PostMapping("/mvp")
    public ResponseEntity<Object> post (@RequestBody MVPDetails mvp){
        mvpdetailsObj.put(mvp.getId(), mvp);
        return new ResponseEntity<>("Added Successfully!",HttpStatus.OK);
    }

    @GetMapping("/mvp")
    public ResponseEntity<Object> get (){
        return new ResponseEntity<>(mvpdetailsObj.values(),HttpStatus.OK);
    }

    @PutMapping("/mvp/{id}")
    public ResponseEntity<Object> put(@PathVariable String id, @RequestBody MVPDetails mvp){
        mvpdetailsObj.put(id, mvp);
        return new ResponseEntity<>("Updated Successfully!",HttpStatus.OK);
    }

    @DeleteMapping("/mvp/{id}")
    public ResponseEntity<Object> delete(@PathVariable String id){
        mvpdetailsObj.remove(id);
        return new ResponseEntity<>("Deleted Successfully!",HttpStatus.OK);
    }
    
}
