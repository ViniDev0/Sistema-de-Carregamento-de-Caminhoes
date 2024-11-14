package interfaceColaborador;

public class Terceirizado extends Colaborador implements IColaborador{
	private int diasSemana;
	private int horasDias;
	
	public Terceirizado (String nome, char tipo, int diasSemana, int horasDias) {
		super(nome, tipo);
		this.diasSemana = diasSemana;
		this.horasDias = horasDias;
	}

	@Override
	public double calcularContribuicao() {
		final int HORARIOPADRAO = 8;
		int calculadorDeHorario = diasSemana * HORARIOPADRAO;
		
		if (this.getTipo() == 'T') {
			
			return this.valorContribuicao = 0;
			
		} else {
			if (calculadorDeHorario <= 16) {
				
				return this.valorContribuicao = 80;
				
			} else if (calculadorDeHorario < 24) {
				
				return this.valorContribuicao = 150;
				
			} else {
				
				return this.valorContribuicao = 250;
				
			}
		}
	}

	public int getDiasSemana() {
		return diasSemana;
	}

	public int getHorasDias() {
		return horasDias;
	}
	
	
}
