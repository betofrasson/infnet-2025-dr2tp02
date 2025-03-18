package org.example.Ex05;

public class ClassificacaoClienteService {
    public ClassificacaoCliente classificar(int idade, double renda, int compras) {
        TipoCliente tipoCliente = idade > 60 ? TipoCliente.SENIOR : TipoCliente.JOVEM;
        boolean isAltaRenda = (tipoCliente == TipoCliente.SENIOR && renda > 5000) || (tipoCliente == TipoCliente.JOVEM && renda > 7000);
        boolean isPremium = (tipoCliente == TipoCliente.SENIOR && compras > 10) || (tipoCliente == TipoCliente.JOVEM && compras > 20);

        if (!isAltaRenda)
            return tipoCliente == TipoCliente.SENIOR ? ClassificacaoCliente.SENIOR_BAIXA_RENDA : ClassificacaoCliente.JOVEM_BAIXA_RENDA;

        return tipoCliente == TipoCliente.SENIOR ? (isPremium ? ClassificacaoCliente.SENIOR_PREMIUM : ClassificacaoCliente.SENIOR_REGULAR)
                : (isPremium ? ClassificacaoCliente.JOVEM_PREMIUM : ClassificacaoCliente.JOVEM_REGULAR);
    }
}
