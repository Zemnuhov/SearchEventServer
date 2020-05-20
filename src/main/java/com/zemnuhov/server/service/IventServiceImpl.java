package com.zemnuhov.server.service;


import com.zemnuhov.server.entity.Ivent;
import com.zemnuhov.server.repository.IventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IventServiceImpl implements IventService {

    @Autowired
    private IventRepository repository;

    public List<Ivent> getAll() {
        return repository.findAll();
    }

    public Ivent getById(long id) {
        Optional<Ivent> a=repository.findById(id);
        return a.get();

    }

    public Ivent save(Ivent ivent) {
        return repository.saveAndFlush(ivent);
    }

    public void delete(long id) {
        repository.deleteById(id);
    }
}
