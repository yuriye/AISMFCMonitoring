package com.yelisoft.mfc.repository;

import com.yelisoft.mfc.model.AISUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by eliseev on 05.06.2017.
 */

@Repository
public class AISUserRepositoryImp implements AISUserRepository {

    private static Map<Long, AISUser> aisUsers = new HashMap<>();

    private static final BeanPropertyRowMapper<AISUser> ROW_MAPPER = BeanPropertyRowMapper.newInstance(AISUser.class);

    private final JdbcTemplate jdbcTemplate;

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    /*private final SimpleJdbcInsert insertAisUser;*/

    @Autowired
    public AISUserRepositoryImp(DataSource dataSource, JdbcTemplate jdbcTemplate, NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
        List<AISUser> aisUserList = jdbcTemplate.query("SELECT * FROM cpgu_user ORDER BY name, email", ROW_MAPPER);
        aisUserList.forEach(aisUser -> aisUsers.put(aisUser.getId(), aisUser));
    }

    @Override
    public AISUser get(long id) {
        return aisUsers.get(id);
//        List<AISUser> aisUsers = jdbcTemplate.query("SELECT * FROM cpgu_user WHERE id=?", ROW_MAPPER, id);
//        return DataAccessUtils.singleResult(aisUsers);
    }

    @Override
    public List<AISUser> getAll() {
//        return jdbcTemplate.query("SELECT * FROM cpgu_user ORDER BY name, email", ROW_MAPPER);
        return aisUsers.values().stream().collect(Collectors.toList());
    }
}
