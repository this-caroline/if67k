import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
	    CadProdutor produtor = new CadProdutor();
	    
        Scanner data = new Scanner(System.in);
        
        System.out.println("Nome do Produtor:");
        produtor.setProdutor(data.next());
        
        System.out.println("Municipio do Produtor:");
        produtor.setMunicipio(data.next());
        
        System.out.println("Técnico Responsável:");
        produtor.setTecnico(data.next());

		produtor.listProdutor();
	
	}

}
