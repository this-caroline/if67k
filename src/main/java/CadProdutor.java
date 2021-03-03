
public class CadProdutor {

	public CadProdutor() {
		this.produtor = this.getProdutor();
		this.municipio = this.getMunicipio();

	}

   private String produtor;
   private String municipio;
   private String tecnico;
   private double talhao;
   private double lote;
   private double area;
   
   public void listProdutor() {
	    System.out.println("Produtor " + this.produtor);
	    System.out.println("Municipio " + this.municipio);
	    System.out.println("Tecnico " + this.tecnico);
	}
   
   public String getProdutor() {
		return produtor;
	}
	   
	public void setProdutor(String produtor) {
		this.produtor = produtor;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getTecnico() {
		return tecnico;
	}
	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}
	public double getTalhao() {
		return talhao;
	}
	public void setTalhao(double talhao) {
		this.talhao = talhao;
	}
	public double getLote() {
		return lote;
	}
	public void setLote(double lote) {
		this.lote = lote;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}

}
