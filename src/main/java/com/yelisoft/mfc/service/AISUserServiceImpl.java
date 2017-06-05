package com.yelisoft.mfc.service;

import com.yelisoft.mfc.model.AISUser;
import com.yelisoft.mfc.repository.AISUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import static com.yelisoft.mfc.util.ValidationUtil.checkNotFoundWithId;

/**
 * Created by eliseev on 05.06.2017.
 */

@Service
public class AISUserServiceImpl implements AISUserService {

    private final AISUserRepository repository;

    @Autowired
    public AISUserServiceImpl(AISUserRepository repository) {
        this.repository = repository;
    }

    @Override
    public AISUser get(long id) {
        return checkNotFoundWithId(repository.get(id), id);

    }

    @Override
    public List<AISUser> getAll() {
        return null;
    }
}
