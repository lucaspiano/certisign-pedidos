package br.com.certisign.pedido.service;

import br.com.certisign.pedido.domain.entity.PedidoEntity;
import br.com.certisign.pedido.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//Classe de Servico para o Pedidos REST API
// by Lucas Abrao (lucas.abrao@avenuecode.com)
@Service
public class PedidoService {
    PedidoRepository pedidoRepository;

    @Autowired
    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public List<PedidoEntity> getAllPedidos () {
        return pedidoRepository.findAll();
    }

    public Optional<PedidoEntity> findById(Long id) {
        if (id != null && pedidoRepository.existsById(id)) {
           return pedidoRepository.findById(id);
        }

        return Optional.empty();
    }

    public PedidoEntity create(PedidoEntity pedidoEntity) {
        return pedidoRepository.save(pedidoEntity);
    }

    public Optional<PedidoEntity> update(Long id, PedidoEntity pedidoEntity) {
        if (id != null && pedidoRepository.existsById(id)) {
            Optional<PedidoEntity> savedPedidoEntityOptional = pedidoRepository.findById(id);
            PedidoEntity savedPedidoEntity = savedPedidoEntityOptional.get();

            savedPedidoEntity.setId(pedidoEntity.getId());
            savedPedidoEntity.setPedId(pedidoEntity.getPedId());
            savedPedidoEntity.setPedData(pedidoEntity.getPedData());
            savedPedidoEntity.setPrdId(pedidoEntity.getPrdId());
            savedPedidoEntity.setPedfi(pedidoEntity.getPedfi());
            savedPedidoEntity.setPedseed(pedidoEntity.getPedseed());
            savedPedidoEntity.setEstpin1(pedidoEntity.getEstpin1());
            savedPedidoEntity.setUsuId(pedidoEntity.getUsuId());
            savedPedidoEntity.setPfsCpf(pedidoEntity.getPfsCpf());
            savedPedidoEntity.setPfsNome(pedidoEntity.getPfsNome());
            savedPedidoEntity.setPfsEmail(pedidoEntity.getPfsEmail());
            savedPedidoEntity.setPfsEndereco(pedidoEntity.getPfsEndereco());
            savedPedidoEntity.setPfsComplemento(pedidoEntity.getPfsComplemento());
            savedPedidoEntity.setPfsBairro(pedidoEntity.getPfsBairro());
            savedPedidoEntity.setPfsMunicipio(pedidoEntity.getPfsMunicipio());
            savedPedidoEntity.setPfsUf(pedidoEntity.getPfsUf());
            savedPedidoEntity.setPfsPais(pedidoEntity.getPfsPais());
            savedPedidoEntity.setPfsCep(pedidoEntity.getPfsCep());
            savedPedidoEntity.setPfsTelefone(pedidoEntity.getPfsTelefone());
            savedPedidoEntity.setPfsDtNascimento(pedidoEntity.getPfsDtNascimento());
            savedPedidoEntity.setPfsPis(pedidoEntity.getPfsPis());
            savedPedidoEntity.setPfsRg(pedidoEntity.getPfsRg());
            savedPedidoEntity.setPfsRgEmissor(pedidoEntity.getPfsRgEmissor());
            savedPedidoEntity.setPfsRgUf(pedidoEntity.getPfsRgUf());
            savedPedidoEntity.setPfsTitEleit(pedidoEntity.getPfsTitEleit());
            savedPedidoEntity.setPfsTitEleitZona(pedidoEntity.getPfsTitEleitZona());
            savedPedidoEntity.setPfsTitEleitSecao(pedidoEntity.getPfsTitEleitSecao());
            savedPedidoEntity.setPfsTitMunicipio(pedidoEntity.getPfsTitMunicipio());
            savedPedidoEntity.setPfsTitEleitUf(pedidoEntity.getPfsTitEleitUf());
            savedPedidoEntity.setPfsProfissao(pedidoEntity.getPfsProfissao());
            savedPedidoEntity.setPrdou1(pedidoEntity.getPrdou1());
            savedPedidoEntity.setPrdou2(pedidoEntity.getPrdou2());
            savedPedidoEntity.setPrdou3(pedidoEntity.getPrdou3());
            savedPedidoEntity.setPrdou4(pedidoEntity.getPrdou4());
            savedPedidoEntity.setPrdou5(pedidoEntity.getPrdou5());
            savedPedidoEntity.setPjrCpnj(pedidoEntity.getPjrCpnj());
            savedPedidoEntity.setPjrRazaoSocial(pedidoEntity.getPjrRazaoSocial());
            savedPedidoEntity.setOrId(pedidoEntity.getOrId());
            savedPedidoEntity.setGrpId(pedidoEntity.getGrpId());
            savedPedidoEntity.setArId(pedidoEntity.getArId());
            savedPedidoEntity.setOrCodigo(pedidoEntity.getOrCodigo());
            savedPedidoEntity.setPedbEmailHtml(pedidoEntity.getPedbEmailHtml());
            savedPedidoEntity.setPedbEmailAssinado(pedidoEntity.getPedbEmailAssinado());
            savedPedidoEntity.setPedNumCartao(pedidoEntity.getPedNumCartao());
            savedPedidoEntity.setPedNumRenovacao(pedidoEntity.getPedNumRenovacao());
            savedPedidoEntity.setPfsCei(pedidoEntity.getPfsCei());
            savedPedidoEntity.setPjrCei(pedidoEntity.getPjrCei());
            savedPedidoEntity.setPedValor(pedidoEntity.getPedValor());
            savedPedidoEntity.setPedIntegrado(pedidoEntity.getPedIntegrado());
            savedPedidoEntity.setDataPgto(pedidoEntity.getDataPgto());
            savedPedidoEntity.setPedBloqueioData(pedidoEntity.getPedBloqueioData());
            savedPedidoEntity.setNumTentativas(pedidoEntity.getNumTentativas());
            savedPedidoEntity.setPedTipoEmissao(pedidoEntity.getPedTipoEmissao());
            savedPedidoEntity.setPedTipoValidacao(pedidoEntity.getPedTipoValidacao());
            savedPedidoEntity.setDataNotificacao(pedidoEntity.getDataNotificacao());
            savedPedidoEntity.setCdMovCliente(pedidoEntity.getCdMovCliente());
            savedPedidoEntity.setCdEnvioEmailPedCorp(pedidoEntity.getCdEnvioEmailPedCorp());
            savedPedidoEntity.setIcBloqueioFraude(pedidoEntity.getIcBloqueioFraude());
            savedPedidoEntity.setIcAnaliseSeguranca(pedidoEntity.getIcAnaliseSeguranca());
            savedPedidoEntity.setIcTermoBiometria(pedidoEntity.getIcTermoBiometria());
            savedPedidoEntity.setIcAptoVerifOtimi(pedidoEntity.getIcAptoVerifOtimi());
            savedPedidoEntity.setIcDocPendente(pedidoEntity.getIcDocPendente());
            savedPedidoEntity.setIcBiometriaPedido(pedidoEntity.getIcBiometriaPedido());
            savedPedidoEntity.setIcRenovacaoConcorrente(pedidoEntity.getIcRenovacaoConcorrente());
            savedPedidoEntity.setNmAcCertificadoRenovacao(pedidoEntity.getNmAcCertificadoRenovacao());

            pedidoRepository.save(savedPedidoEntity);

            return savedPedidoEntityOptional;
        }
        return Optional.empty();
    }

    public void delete(Long id) {
        if (id != null && pedidoRepository.existsById(id)) {
            pedidoRepository.deleteById(id);
        }
    }
}
