package com.cadastro.empresa.controllers;

import com.cadastro.empresa.models.Cnaes;
import com.cadastro.empresa.models.Empresa;
import com.cadastro.empresa.models.Qsa;
import com.cadastro.empresa.repository.EmpresaRepository;
import com.cadastro.empresa.services.CnpjService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {

    private EmpresaRepository empresaRepository;
    private CnpjService cnpjService;
    public EmpresaController(EmpresaRepository empresaRepository, CnpjService cnpjService) {
        this.empresaRepository = empresaRepository;
        this.cnpjService = cnpjService;
    }
    @PostMapping
    public ResponseEntity<Empresa> cadastrarEmpresa(@RequestBody String cnpj) {
        boolean empresaExists = empresaRepository.existsByCnpj(cnpj);
        if (empresaExists) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build(); // Retorna um código de status de conflito (409)
        }
        Empresa empresa = cnpjService.consultarCnpj(cnpj);

        for (Qsa qsa : empresa.getQsa()) {
            qsa.setEmpresa(empresa);
        }
        for (Cnaes cnae : empresa.getCnaes_secundarios()) {
            cnae.setEmpresa(empresa);
        }

        Empresa empresaSalva = empresaRepository.save(empresa);
        return ResponseEntity.ok(empresaSalva);
    }


    @GetMapping("/cnpj/{cnpj}")
    public ResponseEntity<Empresa> buscarEmpresaPorCnpj(@PathVariable ("cnpj") String cnpj) {
        Empresa empresa = empresaRepository.findByCnpj(cnpj);
        if (empresa != null) {
            return ResponseEntity.ok(empresa);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/razaoSocial/{razao_social}")
    public ResponseEntity<Empresa> buscarEmpresaPorNome(@PathVariable ("razao_social") String razao_social) {
        Empresa empresa = empresaRepository.findByRazaoSocial(razao_social);
        if (empresa != null) {
            return ResponseEntity.ok(empresa);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping
    public ResponseEntity<List<Empresa>> obterTodasEmpresas() {
        List<Empresa> empresas = empresaRepository.findAll();
        return ResponseEntity.ok(empresas);
    }

    @GetMapping("/confirmarEmpresa")
    public Empresa confirmarEmpresa(@RequestParam ("cnpj") String cnpj) {
        return cnpjService.consultarCnpj(cnpj);
    }

}
