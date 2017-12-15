package com.icangdev.learn.sisfo.services.implement;

import com.icangdev.learn.sisfo.models.Matkul;
import com.icangdev.learn.sisfo.repositories.MatkulRepository;
import com.icangdev.learn.sisfo.services.MatkulService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("matkulService")
public class MatkulServiceImpl implements MatkulService {
    @Autowired
    private MatkulRepository matkulRepository;
    @Override
    public void saveMatkul(Matkul matkul) {
        matkul.setKode(matkul.getKode());
        matkul.setNama(matkul.getNama());
        matkulRepository.save(matkul);
    }
}
