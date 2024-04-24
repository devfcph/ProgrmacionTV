package com.devfcph.service;

import com.devfcph.dto.Canal;
import com.devfcph.repository.CanalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CanalService {

    @Autowired
    private CanalRepository canalRepository;

    public Canal crearCanal(Canal canal) {
        return  new Canal();
    }

    public Canal modificarCanal(Integer id, Canal canal) {
        return  new Canal();
    }

    public void eliminarCanal(Integer id) {

    }

    public List<Canal> consultarCanales() {
        return new ArrayList<Canal>();
    }
}
