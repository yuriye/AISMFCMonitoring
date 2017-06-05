package com.yelisoft.mfc.service;

import com.yelisoft.mfc.model.AISUser;

import java.util.List;

/**
 * Created by eliseev on 05.06.2017.
 */
public interface AISUserService {
    AISUser get(long id);
    List<AISUser> getAll();
}
