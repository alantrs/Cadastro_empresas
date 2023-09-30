package com.cadastro.empresa.services;

import com.cadastro.empresa.models.Qsa;
import com.cadastro.empresa.repository.CnaesRepository;
import com.cadastro.empresa.repository.EmpresaRepository;
import com.cadastro.empresa.repository.QsaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;
    @Autowired
    private CnaesRepository cnaesRepository;
    @Autowired
    private QsaRepository qsaRepository;


}
