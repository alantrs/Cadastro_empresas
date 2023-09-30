package com.cadastro.empresa.DTO;

public record DadosSaidaQsaDTO(

        Long id,
        String pais,
        String nomeSocio,
        Integer codigoPais,
        String faixaEtaria,
        String cnpjCpfDoSocio,
        String qualificacaoSocio,
        Integer codigoFaixaEtaria,
        String dataEntradaSociedade,
        Integer identificadorDeSocio,
        String cpfRepresentanteLegal,
        String nomeRepresentanteLegal,
        Integer codigoQualificacaoSocio,
        String qualificacaoRepresentanteLegal,
        String codigoQualificacaoRepresentanteLegal
) {
}
