package com.TCC.controleTorcidas.service;

import java.sql.Types;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.CallableStatementCallback;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class DeleteService {

	private JdbcTemplate jdbcTemplate; 
	
	@Autowired
    public void DeleteService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

	
    public boolean delCpf(Long cpf) {
        try {
            jdbcTemplate.execute("BEGIN p_trata_delete.p_deleta_cpf(?, ?); END;", (CallableStatementCallback<Boolean>) cs -> {
                cs.setLong(1, cpf);
                cs.registerOutParameter(2, Types.INTEGER);
                cs.execute();
                return cs.getInt(2) == 1;
            });
            return true;
        } catch (Exception e) {
            e.printStackTrace();  
            return false;
        }
    }
	
    public boolean delOcorrencia(Long cpf, Long ocorrencia) {
        try {
            jdbcTemplate.execute("BEGIN p_trata_delete.p_deleta_ocorrencia(?, ?, ?); END;", (CallableStatementCallback<Boolean>) cs -> {
                cs.setLong(1, cpf);
                cs.setLong(2, ocorrencia);                
                cs.registerOutParameter(3, Types.INTEGER);
                cs.execute();
                return cs.getInt(3) == 1;
            });
            return true;
        } catch (Exception e) {
            e.printStackTrace();  
            return false;
        }
    }
	    
	
}
