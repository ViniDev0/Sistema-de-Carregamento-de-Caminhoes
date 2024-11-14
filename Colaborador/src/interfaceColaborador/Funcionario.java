package interfaceColaborador;

import java.util.Calendar;
import java.util.Date;

public class Funcionario  extends Colaborador implements IColaborador{
	private double salario;
	private int anoAdmissao;
	private int mesAdmissao;
	
	public Funcionario (String nome, char tipo, double salario, int anoAdmissao, int mesAdmissao) {
		super(nome, tipo);
		this.salario = salario;
		this.anoAdmissao = anoAdmissao;
		this.mesAdmissao = mesAdmissao;
	}

	@Override
	public double calcularContribuicao() {
		java.util.Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		
		int mesAtual = cal.get(Calendar.MONTH);
		int anoAtual = cal.get(Calendar.YEAR);
		double porcentagemContribuicao;
		
		if (this.getTipo() == 'D') {
			porcentagemContribuicao = this.salario * 1.10;
			
		} else if (this.getTipo() == 'G') {
			porcentagemContribuicao = this.salario * 1.08;
			
		}
		else {
			porcentagemContribuicao = this.salario * 1.05;
		}
	}

	public double getSalario() {
		return salario;
	}

	public int getAnoAdmissao() {
		return anoAdmissao;
	}

	public int getMesAdmissao() {
		return mesAdmissao;
	}
	
	
}
