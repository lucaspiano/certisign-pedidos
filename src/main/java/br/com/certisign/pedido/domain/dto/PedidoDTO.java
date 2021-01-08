package br.com.certisign.pedido.domain.dto;

import java.time.LocalDate;

public class PedidoDTO {
    private Long id;
    private int pedId;
    private LocalDate pedData;
    private String prdId;
    private String pedfi;
    private String pedseed;
    private int spedId;
    private int estpin1;
    private int usuId;
    private int pfsCpf;
    private String pfsNome;
    private String pfsEmail;
    private String pfsEndereco;
    private String pfsComplemento;
    private String pfsBairro;
    private String pfsMunicipio;
    private String pfsUf;
    private String pfsPais;
    private int pfsCep;
    private int pfsTelefone;
    private LocalDate pfsDtNascimento;
    private int pfsPis;
    private String pfsRg;
    private String pfsRgEmissor;
    private String pfsRgUf;
    private int pfsTitEleit;
    private int pfsTitEleitZona;
    private int pfsTitEleitSecao;
    private String pfsTitMunicipio;
    private String pfsTitEleitUf;
    private String pfsProfissao;
    private String prdou1;
    private String prdou2;
    private String prdou3;
    private String prdou4;
    private String prdou5;
    private int pjrCpnj;
    private String pjrRazaoSocial;
    private int orId;
    private String grpId;
    private String arId;
    private String orCodigo;
    private int pedbEmailHtml;
    private int pedbEmailAssinado;
    private String pedNumCartao;
    private int pedNumRenovacao;
    private int pfsCei;
    private int pjrCei;
    private int pedValor;
    private int pedIntegrado;
    private LocalDate dataPgto;
    private int pedBloqueioData;
    private int numTentativas;
    private String pedTipoEmissao;
    private String pedTipoValidacao;
    private int dataNotificacao;
    private String cdMovCliente;
    private int cdEnvioEmailPedCorp;
    private int icBloqueioFraude;
    private int icAnaliseSeguranca;
    private int icTermoBiometria;
    private int icAptoVerifOtimi;
    private int icDocPendente;
    private int icBiometriaPedido;
    private int icRenovacaoConcorrente;
    private String nmAcCertificadoRenovacao;

    private String certRenovacaoAcConcor;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPedId() {
        return pedId;
    }

    public void setPedId(int pedId) {
        this.pedId = pedId;
    }

    public LocalDate getPedData() {
        return pedData;
    }

    public void setPedData(LocalDate pedData) {
        this.pedData = pedData;
    }

    public String getPrdId() {
        return prdId;
    }

    public void setPrdId(String prdId) {
        this.prdId = prdId;
    }

    public String getPedfi() {
        return pedfi;
    }

    public void setPedfi(String pedfi) {
        this.pedfi = pedfi;
    }

    public String getPedseed() {
        return pedseed;
    }

    public void setPedseed(String pedseed) {
        this.pedseed = pedseed;
    }

    public int getSpedId() {
        return spedId;
    }

    public void setSpedId(int spedId) {
        this.spedId = spedId;
    }

    public int getEstpin1() {
        return estpin1;
    }

    public void setEstpin1(int estpin1) {
        this.estpin1 = estpin1;
    }

    public int getUsuId() {
        return usuId;
    }

    public void setUsuId(int usuId) {
        this.usuId = usuId;
    }

    public int getPfsCpf() {
        return pfsCpf;
    }

    public void setPfsCpf(int pfsCpf) {
        this.pfsCpf = pfsCpf;
    }

    public String getPfsNome() {
        return pfsNome;
    }

    public void setPfsNome(String pfsNome) {
        this.pfsNome = pfsNome;
    }

    public String getPfsEmail() {
        return pfsEmail;
    }

    public void setPfsEmail(String pfsEmail) {
        this.pfsEmail = pfsEmail;
    }

    public String getPfsEndereco() {
        return pfsEndereco;
    }

    public void setPfsEndereco(String pfsEndereco) {
        this.pfsEndereco = pfsEndereco;
    }

    public String getPfsComplemento() {
        return pfsComplemento;
    }

    public void setPfsComplemento(String pfsComplemento) {
        this.pfsComplemento = pfsComplemento;
    }

    public String getPfsBairro() {
        return pfsBairro;
    }

    public void setPfsBairro(String pfsBairro) {
        this.pfsBairro = pfsBairro;
    }

    public String getPfsMunicipio() {
        return pfsMunicipio;
    }

    public void setPfsMunicipio(String pfsMunicipio) {
        this.pfsMunicipio = pfsMunicipio;
    }

    public String getPfsPais() {
        return pfsPais;
    }

    public void setPfsPais(String pfsPais) {
        this.pfsPais = pfsPais;
    }

    public int getPfsCep() {
        return pfsCep;
    }

    public void setPfsCep(int pfsCep) {
        this.pfsCep = pfsCep;
    }

    public int getPfsTelefone() {
        return pfsTelefone;
    }

    public void setPfsTelefone(int pfsTelefone) {
        this.pfsTelefone = pfsTelefone;
    }

    public LocalDate getPfsDtNascimento() {
        return pfsDtNascimento;
    }

    public void setPfsDtNascimento(LocalDate pfsDtNascimento) {
        this.pfsDtNascimento = pfsDtNascimento;
    }

    public int getPfsPis() {
        return pfsPis;
    }

    public void setPfsPis(int pfsPis) {
        this.pfsPis = pfsPis;
    }

    public String getPfsRg() {
        return pfsRg;
    }

    public void setPfsRg(String pfsRg) {
        this.pfsRg = pfsRg;
    }

    public String getPfsRgEmissor() {
        return pfsRgEmissor;
    }

    public void setPfsRgEmissor(String pfsRgEmissor) {
        this.pfsRgEmissor = pfsRgEmissor;
    }

    public int getPfsTitEleit() {
        return pfsTitEleit;
    }

    public void setPfsTitEleit(int pfsTitEleit) {
        this.pfsTitEleit = pfsTitEleit;
    }

    public int getPfsTitEleitZona() {
        return pfsTitEleitZona;
    }

    public void setPfsTitEleitZona(int pfsTitEleitZona) {
        this.pfsTitEleitZona = pfsTitEleitZona;
    }

    public int getPfsTitEleitSecao() {
        return pfsTitEleitSecao;
    }

    public void setPfsTitEleitSecao(int pfsTitEleitSecao) {
        this.pfsTitEleitSecao = pfsTitEleitSecao;
    }

    public String getPfsTitMunicipio() {
        return pfsTitMunicipio;
    }

    public void setPfsTitMunicipio(String pfsTitMunicipio) {
        this.pfsTitMunicipio = pfsTitMunicipio;
    }

    public String getPfsProfissao() {
        return pfsProfissao;
    }

    public void setPfsProfissao(String pfsProfissao) {
        this.pfsProfissao = pfsProfissao;
    }

    public String getPrdou1() {
        return prdou1;
    }

    public void setPrdou1(String prdou1) {
        this.prdou1 = prdou1;
    }

    public String getPrdou2() {
        return prdou2;
    }

    public void setPrdou2(String prdou2) {
        this.prdou2 = prdou2;
    }

    public String getPrdou3() {
        return prdou3;
    }

    public void setPrdou3(String prdou3) {
        this.prdou3 = prdou3;
    }

    public String getPrdou4() {
        return prdou4;
    }

    public void setPrdou4(String prdou4) {
        this.prdou4 = prdou4;
    }

    public String getPrdou5() {
        return prdou5;
    }

    public void setPrdou5(String prdou5) {
        this.prdou5 = prdou5;
    }

    public int getPjrCpnj() {
        return pjrCpnj;
    }

    public void setPjrCpnj(int pjrCpnj) {
        this.pjrCpnj = pjrCpnj;
    }

    public String getPjrRazaoSocial() {
        return pjrRazaoSocial;
    }

    public void setPjrRazaoSocial(String pjrRazaoSocial) {
        this.pjrRazaoSocial = pjrRazaoSocial;
    }

    public int getOrId() {
        return orId;
    }

    public void setOrId(int orId) {
        this.orId = orId;
    }

    public String getOrCodigo() {
        return orCodigo;
    }

    public void setOrCodigo(String orCodigo) {
        this.orCodigo = orCodigo;
    }

    public int getPedbEmailHtml() {
        return pedbEmailHtml;
    }

    public void setPedbEmailHtml(int pedbEmailHtml) {
        this.pedbEmailHtml = pedbEmailHtml;
    }

    public int getPedbEmailAssinado() {
        return pedbEmailAssinado;
    }

    public void setPedbEmailAssinado(int pedbEmailAssinado) {
        this.pedbEmailAssinado = pedbEmailAssinado;
    }

    public String getPedNumCartao() {
        return pedNumCartao;
    }

    public void setPedNumCartao(String pedNumCartao) {
        this.pedNumCartao = pedNumCartao;
    }

    public int getPedNumRenovacao() {
        return pedNumRenovacao;
    }

    public void setPedNumRenovacao(int pedNumRenovacao) {
        this.pedNumRenovacao = pedNumRenovacao;
    }

    public int getPfsCei() {
        return pfsCei;
    }

    public void setPfsCei(int pfsCei) {
        this.pfsCei = pfsCei;
    }

    public int getPjrCei() {
        return pjrCei;
    }

    public void setPjrCei(int pjrCei) {
        this.pjrCei = pjrCei;
    }

    public int getPedValor() {
        return pedValor;
    }

    public void setPedValor(int pedValor) {
        this.pedValor = pedValor;
    }

    public int getPedIntegrado() {
        return pedIntegrado;
    }

    public void setPedIntegrado(int pedIntegrado) {
        this.pedIntegrado = pedIntegrado;
    }

    public LocalDate getDataPgto() {
        return dataPgto;
    }

    public void setDataPgto(LocalDate dataPgto) {
        this.dataPgto = dataPgto;
    }

    public String getPedTipoEmissao() {
        return pedTipoEmissao;
    }

    public void setPedTipoEmissao(String pedTipoEmissao) {
        this.pedTipoEmissao = pedTipoEmissao;
    }

    public String getPedTipoValidacao() {
        return pedTipoValidacao;
    }

    public void setPedTipoValidacao(String pedTipoValidacao) {
        this.pedTipoValidacao = pedTipoValidacao;
    }


    public int getPedBloqueioData() {
        return pedBloqueioData;
    }

    public void setPedBloqueioData(int pedBloqueioData) {
        this.pedBloqueioData = pedBloqueioData;
    }

    public int getNumTentativas() {
        return numTentativas;
    }

    public void setNumTentativas(int numTentativas) {
        this.numTentativas = numTentativas;
    }

    public int getDataNotificacao() {
        return dataNotificacao;
    }

    public void setDataNotificacao(int dataNotificacao) {
        this.dataNotificacao = dataNotificacao;
    }


    public String getPfsUf() {
        return pfsUf;
    }

    public void setPfsUf(String pfsUf) {
        this.pfsUf = pfsUf;
    }

    public String getPfsRgUf() {
        return pfsRgUf;
    }

    public void setPfsRgUf(String pfsRgUf) {
        this.pfsRgUf = pfsRgUf;
    }

    public String getPfsTitEleitUf() {
        return pfsTitEleitUf;
    }

    public void setPfsTitEleitUf(String pfsTitEleitUf) {
        this.pfsTitEleitUf = pfsTitEleitUf;
    }

    public String getGrpId() {
        return grpId;
    }

    public void setGrpId(String grpId) {
        this.grpId = grpId;
    }

    public String getArId() {
        return arId;
    }

    public void setArId(String arId) {
        this.arId = arId;
    }

    public String getCdMovCliente() {
        return cdMovCliente;
    }

    public void setCdMovCliente(String cdMovCliente) {
        this.cdMovCliente = cdMovCliente;
    }

    public int getCdEnvioEmailPedCorpnvioEmaiPedCorp() {
        return cdEnvioEmailPedCorp;
    }

    public void setCdEnvioEmailPedCorp(int cdEnvioEmailPedCorpnvioEmaiPedCorp) {
        this.cdEnvioEmailPedCorp = cdEnvioEmailPedCorp;
    }

    public int getIcBloqueioFraude() {
        return icBloqueioFraude;
    }

    public void setIcBloqueioFraude(int icBloqueioFraude) {
        this.icBloqueioFraude = icBloqueioFraude;
    }

    public int getIcAnaliseSeguranca() {
        return icAnaliseSeguranca;
    }

    public void setIcAnaliseSeguranca(int icAnaliseSeguranca) {
        this.icAnaliseSeguranca = icAnaliseSeguranca;
    }

    public int getIcTermoBiometria() {
        return icTermoBiometria;
    }

    public void setIcTermoBiometria(int icTermoBiometria) {
        this.icTermoBiometria = icTermoBiometria;
    }

    public int getIcAptoVerifOtimi() {
        return icAptoVerifOtimi;
    }

    public void setIcAptoVerifOtimi(int icAptoVerifOtimi) {
        this.icAptoVerifOtimi = icAptoVerifOtimi;
    }

    public int getIcDocPendente() {
        return icDocPendente;
    }

    public void setIcDocPendente(int icDocPendente) {
        this.icDocPendente = icDocPendente;
    }

    public int getIcBiometriaPedido() {
        return icBiometriaPedido;
    }

    public void setIcBiometriaPedido(int icBiometriaPedido) {
        this.icBiometriaPedido = icBiometriaPedido;
    }

    public int getIcRenovacaoConcorrente() {
        return icRenovacaoConcorrente;
    }

    public void setIcRenovacaoConcorrente(int icRenovacaoConcorrente) {
        this.icRenovacaoConcorrente = icRenovacaoConcorrente;
    }

    public String getNmAcCertificadoRenovacao() {
        return nmAcCertificadoRenovacao;
    }

    public void setNmAcCertificadoRenovacao(String nmAcCertificadoRenovacao) {
        this.nmAcCertificadoRenovacao = nmAcCertificadoRenovacao;
    }

    public String getCertRenovacaoAcConcor() {
        return certRenovacaoAcConcor;
    }

    public void setCertRenovacaoAcConcor(String certRenovacaoAcConcor) {
        this.certRenovacaoAcConcor = certRenovacaoAcConcor;
    }
}