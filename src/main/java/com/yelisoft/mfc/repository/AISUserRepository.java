package com.yelisoft.mfc.repository;

import com.yelisoft.mfc.model.AISUser;

import java.util.List;

/**
 * Created by eliseev on 05.06.2017.
 */
public interface AISUserRepository {

    AISUser get(long id);
    List<AISUser> getAll();
}
