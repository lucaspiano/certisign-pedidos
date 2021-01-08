package br.com.certisign.pedido.util;

import br.com.certisign.pedido.domain.dto.PedidoDTO;
import br.com.certisign.pedido.domain.entity.PedidoEntity;

import java.util.ArrayList;
import java.util.List;

public class ConverterUtil {

    private ConverterUtil() {
        throw new IllegalStateException("Utility class");
    }

    public static PedidoEntity transformPedidosDTOIntoPedidosEntity(PedidoDTO pedidoDTO) {
        PedidoEntity pedidoEntity = new PedidoEntity();
        pedidoEntity.setId(pedidoDTO.getId());
        pedidoEntity.setPedId(pedidoDTO.getPedId());
        pedidoEntity.setPedData(pedidoDTO.getPedData());
        pedidoEntity.setPrdId(pedidoDTO.getPrdId());
        pedidoEntity.setPedfi(pedidoDTO.getPedfi());
        pedidoEntity.setPedseed(pedidoDTO.getPedseed());
        pedidoEntity.setSpedId(pedidoDTO.getSpedId());
        pedidoEntity.setEstpin1(pedidoDTO.getEstpin1());
        pedidoEntity.setUsuId(pedidoDTO.getUsuId());
        pedidoEntity.setPfsCpf(pedidoDTO.getPfsCpf());
        pedidoEntity.setPfsNome(pedidoDTO.getPfsNome());
        pedidoEntity.setPfsEmail(pedidoDTO.getPfsEmail());
        pedidoEntity.setPfsComplemento(pedidoDTO.getPfsComplemento());
        pedidoEntity.setPfsBairro(pedidoDTO.getPfsBairro());
        pedidoEntity.setPfsMunicipio(pedidoDTO.getPfsMunicipio());
        pedidoEntity.setPfsUf(pedidoDTO.getPfsUf());
        pedidoEntity.setPfsPais(pedidoDTO.getPfsPais());
        pedidoEntity.setPfsCep(pedidoDTO.getPfsCep());
        pedidoEntity.setPfsTelefone(pedidoDTO.getPfsTelefone());
        pedidoEntity.setPfsDtNascimento(pedidoDTO.getPfsDtNascimento());
        pedidoEntity.setPfsPis(pedidoDTO.getPfsPis());
        pedidoEntity.setPfsRg(pedidoDTO.getPfsRg());
        pedidoEntity.setPfsRgEmissor(pedidoDTO.getPfsRgEmissor());
        pedidoEntity.setPfsRgUf(pedidoDTO.getPfsRgUf());
        pedidoEntity.setPfsTitEleit(pedidoDTO.getPfsTitEleit());
        pedidoEntity.setPfsTitEleitZona(pedidoDTO.getPfsTitEleitZona());
        pedidoEntity.setPfsTitEleitSecao(pedidoDTO.getPfsTitEleitSecao());
        pedidoEntity.setPfsTitMunicipio(pedidoDTO.getPfsTitMunicipio());
        pedidoEntity.setPfsTitEleitUf(pedidoDTO.getPfsTitEleitUf());
        pedidoEntity.setPfsProfissao(pedidoDTO.getPfsProfissao());
        pedidoEntity.setPrdou1(pedidoDTO.getPrdou1());
        pedidoEntity.setPrdou2(pedidoDTO.getPrdou2());
        pedidoEntity.setPrdou3(pedidoDTO.getPrdou3());
        pedidoEntity.setPrdou4(pedidoDTO.getPrdou4());
        pedidoEntity.setPrdou5(pedidoDTO.getPrdou5());
        pedidoEntity.setPjrCpnj(pedidoDTO.getPjrCpnj());
        pedidoEntity.setPjrRazaoSocial(pedidoDTO.getPjrRazaoSocial());
        pedidoEntity.setOrId(pedidoDTO.getOrId());
        pedidoEntity.setGrpId(pedidoDTO.getGrpId());
        pedidoEntity.setArId(pedidoDTO.getArId());
        pedidoEntity.setOrCodigo(pedidoDTO.getOrCodigo());
        pedidoEntity.setPedbEmailHtml(pedidoDTO.getPedbEmailHtml());
        pedidoEntity.setPedbEmailAssinado(pedidoDTO.getPedbEmailAssinado());
        pedidoEntity.setPedNumCartao(pedidoDTO.getPedNumCartao());
        pedidoEntity.setPedNumRenovacao(pedidoDTO.getPedNumRenovacao());
        pedidoEntity.setPfsCei(pedidoDTO.getPfsCei());
        pedidoEntity.setPjrCei(pedidoDTO.getPjrCei());
        pedidoEntity.setPedValor(pedidoDTO.getPedValor());
        pedidoEntity.setPedIntegrado(pedidoDTO.getPedIntegrado());
        pedidoEntity.setDataPgto(pedidoDTO.getDataPgto());
        pedidoEntity.setPedBloqueioData(pedidoDTO.getPedBloqueioData());
        pedidoEntity.setNumTentativas(pedidoDTO.getNumTentativas());
        pedidoEntity.setPedTipoEmissao(pedidoDTO.getPedTipoEmissao());
        pedidoEntity.setPedTipoValidacao(pedidoDTO.getPedTipoValidacao());
        pedidoEntity.setDataNotificacao(pedidoDTO.getDataNotificacao());
        pedidoEntity.setCdMovCliente(pedidoDTO.getCdMovCliente());
        pedidoEntity.setCdEnvioEmailPedCorp(pedidoDTO.getCdEnvioEmailPedCorpnvioEmaiPedCorp());
        pedidoEntity.setIcBloqueioFraude(pedidoDTO.getIcBloqueioFraude());
        pedidoEntity.setIcAnaliseSeguranca(pedidoDTO.getIcAnaliseSeguranca());
        pedidoEntity.setIcTermoBiometria(pedidoDTO.getIcTermoBiometria());
        pedidoEntity.setIcAptoVerifOtimi(pedidoDTO.getIcAptoVerifOtimi());
        pedidoEntity.setIcDocPendente(pedidoDTO.getIcDocPendente());
        pedidoEntity.setIcBiometriaPedido(pedidoDTO.getIcBiometriaPedido());
        pedidoEntity.setIcRenovacaoConcorrente(pedidoDTO.getIcRenovacaoConcorrente());
        pedidoEntity.setNmAcCertificadoRenovacao(pedidoDTO.getNmAcCertificadoRenovacao());
        pedidoEntity.setCertRenovacaoAcConcor(pedidoDTO.getCertRenovacaoAcConcor());

        return pedidoEntity;
    }

    public static PedidoDTO transformPedidosEntityIntoPedidosDTO(PedidoEntity pedidoEntity) {
        PedidoDTO pedidoDTO = new PedidoDTO();
        pedidoDTO.setId(pedidoEntity.getId());
        pedidoDTO.setPedId(pedidoEntity.getPedId());
        pedidoDTO.setPedData(pedidoEntity.getPedData());
        pedidoDTO.setPrdId(pedidoEntity.getPrdId());
        pedidoDTO.setPedfi(pedidoEntity.getPedfi());
        pedidoDTO.setPedseed(pedidoEntity.getPedseed());
        pedidoDTO.setSpedId(pedidoEntity.getSpedId());
        pedidoDTO.setEstpin1(pedidoEntity.getEstpin1());
        pedidoDTO.setUsuId(pedidoEntity.getUsuId());
        pedidoDTO.setPfsCpf(pedidoEntity.getPfsCpf());
        pedidoDTO.setPfsNome(pedidoEntity.getPfsNome());
        pedidoDTO.setPfsEmail(pedidoEntity.getPfsEmail());
        pedidoDTO.setPfsComplemento(pedidoEntity.getPfsComplemento());
        pedidoDTO.setPfsBairro(pedidoEntity.getPfsBairro());
        pedidoDTO.setPfsMunicipio(pedidoEntity.getPfsMunicipio());
        pedidoDTO.setPfsUf(pedidoEntity.getPfsUf());
        pedidoDTO.setPfsPais(pedidoEntity.getPfsPais());
        pedidoDTO.setPfsCep(pedidoEntity.getPfsCep());
        pedidoDTO.setPfsTelefone(pedidoEntity.getPfsTelefone());
        pedidoDTO.setPfsDtNascimento(pedidoEntity.getPfsDtNascimento());
        pedidoDTO.setPfsPis(pedidoEntity.getPfsPis());
        pedidoDTO.setPfsRg(pedidoEntity.getPfsRg());
        pedidoDTO.setPfsRgEmissor(pedidoEntity.getPfsRgEmissor());
        pedidoDTO.setPfsRgUf(pedidoEntity.getPfsRgUf());
        pedidoDTO.setPfsTitEleit(pedidoEntity.getPfsTitEleit());
        pedidoDTO.setPfsTitEleitZona(pedidoEntity.getPfsTitEleitZona());
        pedidoDTO.setPfsTitEleitSecao(pedidoEntity.getPfsTitEleitSecao());
        pedidoDTO.setPfsTitMunicipio(pedidoEntity.getPfsTitMunicipio());
        pedidoDTO.setPfsTitEleitUf(pedidoEntity.getPfsTitEleitUf());
        pedidoDTO.setPfsProfissao(pedidoEntity.getPfsProfissao());
        pedidoDTO.setPrdou1(pedidoEntity.getPrdou1());
        pedidoDTO.setPrdou2(pedidoEntity.getPrdou2());
        pedidoDTO.setPrdou3(pedidoEntity.getPrdou3());
        pedidoDTO.setPrdou4(pedidoEntity.getPrdou4());
        pedidoDTO.setPrdou5(pedidoEntity.getPrdou5());
        pedidoDTO.setPjrCpnj(pedidoEntity.getPjrCpnj());
        pedidoDTO.setPjrRazaoSocial(pedidoEntity.getPjrRazaoSocial());
        pedidoDTO.setOrId(pedidoEntity.getOrId());
        pedidoDTO.setGrpId(pedidoEntity.getGrpId());
        pedidoDTO.setArId(pedidoEntity.getArId());
        pedidoDTO.setOrCodigo(pedidoEntity.getOrCodigo());
        pedidoDTO.setPedbEmailHtml(pedidoEntity.getPedbEmailHtml());
        pedidoDTO.setPedbEmailAssinado(pedidoEntity.getPedbEmailAssinado());
        pedidoDTO.setPedNumCartao(pedidoEntity.getPedNumCartao());
        pedidoDTO.setPedNumRenovacao(pedidoEntity.getPedNumRenovacao());
        pedidoDTO.setPfsCei(pedidoEntity.getPfsCei());
        pedidoDTO.setPjrCei(pedidoEntity.getPjrCei());
        pedidoDTO.setPedValor(pedidoEntity.getPedValor());
        pedidoDTO.setPedIntegrado(pedidoEntity.getPedIntegrado());
        pedidoDTO.setDataPgto(pedidoEntity.getDataPgto());
        pedidoDTO.setPedbEmailAssinado(pedidoEntity.getPedBloqueioData());
        pedidoDTO.setNumTentativas(pedidoEntity.getNumTentativas());
        pedidoDTO.setPedTipoEmissao(pedidoEntity.getPedTipoEmissao());
        pedidoDTO.setPedTipoValidacao(pedidoEntity.getPedTipoValidacao());
        pedidoDTO.setDataNotificacao(pedidoEntity.getDataNotificacao());
        pedidoDTO.setCdMovCliente(pedidoEntity.getCdMovCliente());
        pedidoDTO.setCdEnvioEmailPedCorp(pedidoEntity.getCdEnvioEmailPedCorp());
        pedidoDTO.setIcBloqueioFraude(pedidoEntity.getIcBloqueioFraude());
        pedidoDTO.setIcAnaliseSeguranca(pedidoEntity.getIcAnaliseSeguranca());
        pedidoDTO.setIcTermoBiometria(pedidoEntity.getIcTermoBiometria());
        pedidoDTO.setIcAptoVerifOtimi(pedidoEntity.getIcAptoVerifOtimi());
        pedidoDTO.setIcDocPendente(pedidoEntity.getIcDocPendente());
        pedidoDTO.setIcBiometriaPedido(pedidoEntity.getIcBiometriaPedido());
        pedidoDTO.setIcRenovacaoConcorrente(pedidoEntity.getIcRenovacaoConcorrente());
        pedidoDTO.setNmAcCertificadoRenovacao(pedidoEntity.getNmAcCertificadoRenovacao());
        pedidoDTO.setCertRenovacaoAcConcor(pedidoEntity.getCertRenovacaoAcConcor());

        return pedidoDTO;
    }

    public static List<PedidoDTO> convertEntityListToDTOList(List<PedidoEntity> pedidoEntityList) {
        List<PedidoDTO> pedidoDTOList = new ArrayList<>();

        pedidoEntityList.forEach(list -> {
            PedidoDTO pedidoDTO = transformPedidosEntityIntoPedidosDTO(list);

            pedidoDTOList.add(pedidoDTO);
        });

        return pedidoDTOList;
    }
}
