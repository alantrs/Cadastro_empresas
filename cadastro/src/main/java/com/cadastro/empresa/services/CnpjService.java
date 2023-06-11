package com.cadastro.empresa.services;

import com.cadastro.empresa.models.Empresa;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CnpjService {
    private final RestTemplate restTemplate;
    public CnpjService() {
        this.restTemplate = new RestTemplate();
    }

    public Empresa consultarCnpj(String cnpj) {
        String apiUrl = "https://brasilapi.com.br/api/cnpj/v1/{cnpj}";

        ResponseEntity<Empresa> response = restTemplate.getForEntity(apiUrl, Empresa.class, cnpj);
        if (response.getStatusCode() == HttpStatus.OK) {
            return response.getBody();
        } else {
            throw new RuntimeException("Erro ao consultar CNPJ");
        }
    }
}





