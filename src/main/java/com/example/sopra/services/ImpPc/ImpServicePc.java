package com.example.sopra.services.ImpPc;

import com.example.sopra.models.Pc;
import com.example.sopra.repository.PcRepository;
import com.example.sopra.services.IservicePc;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ImpServicePc implements IservicePc {

    @Autowired
    private PcRepository pcRepository;

    @Override
    public Pc addPc(Pc pc) {
        return pcRepository.save(pc);
    }

    @Override
    public Pc getPcByID(Long id) {
        return pcRepository.findById(id).orElseThrow(() -> new RuntimeException("Task Not Found"));
    }

    @Override
    public List<Pc> getALLPc() {
        return pcRepository.findAll();
    }
}
