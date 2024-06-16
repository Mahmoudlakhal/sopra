package com.example.sopra.controller;

import com.example.sopra.models.Pc;
import com.example.sopra.services.IservicePc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Pc")
@CrossOrigin(origins = "http://localhost:4200")

public class PcController {
    @Autowired
    IservicePc iservicePc;

    @PostMapping("/ajoutPc")
    public Pc addPc(@RequestBody Pc pc){
        return iservicePc.addPc(pc);
    }


    @GetMapping("/listPc")
    public List<Pc> getAllPc() {
        return iservicePc.getALLPc();
    }
}
