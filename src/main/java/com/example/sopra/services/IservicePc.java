package com.example.sopra.services;

import com.example.sopra.models.Pc;

import java.util.HashMap;
import java.util.List;

public interface IservicePc {

    Pc addPc(Pc pc);
    //Task addTach(Task task,Long id);
    List<Pc> getALLPc();
    Pc getPcByID(Long id);
   // Task UpdateTask(Task task,Long id);
   // HashMap<String,String> DeleteTask(Long id);
}
