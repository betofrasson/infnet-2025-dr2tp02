package org.example.Ex05;

public enum ClassificacaoCliente {
    SENIOR_BAIXA_RENDA("Cliente Sênior Baixa Renda"),
    SENIOR_REGULAR("Cliente Regular Sênior"),
    SENIOR_PREMIUM("Cliente Premium Sênior"),
    JOVEM_BAIXA_RENDA("Cliente Jovem Baixa Renda"),
    JOVEM_REGULAR("Cliente Regular Jovem"),
    JOVEM_PREMIUM("Cliente Premium Jovem");

    private final String descricao;

    ClassificacaoCliente(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

