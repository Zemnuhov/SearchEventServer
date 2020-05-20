package com.zemnuhov.server.service;

import com.zemnuhov.server.entity.Ivent;

import java.util.List;
import java.util.Optional;

public interface IventService {
    List<Ivent> getAll();
    Ivent getById(long id);
    Ivent save(Ivent ivent);
    void delete(long id);
}
