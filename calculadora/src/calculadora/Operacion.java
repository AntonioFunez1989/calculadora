package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Operacion {

	private String fallo = null;
	private double res = 0;
	private String result = null;
	private double n1 = 0;
	private double n2 = 0;
	private char op; 

	
	public Operacion(double n1, double n2, char op) {
		
		this.n1=n1;
		this.n2=n2;
		this.op=op;
		
	}
	
	public void calcular () {
	
		if(op == '+') {
			res=n1+n2;
					}
			else if(op == '-') {
				res=n1-n2;
						}
			else if(op == 'x') {
				res=n1*n2;
						}
			else if(op == '/') {
				res=n1/n2;
				}else {
					res=0;
						}

		result=String.valueOf(res);
		
	}

	@Override
	public String toString() {
		
		System.out.println(result);
		return result;
	}
	
	public static void main(String []args) {
		
		Operacion op = new Operacion(3,4,'x');
		op.calcular();
		op.toString();
		
		op = new Operacion(12,5,'+');
		op.calcular();
		op.toString();
		
	}
	
	class oyenteUno implements ActionListener{

		public void actionPerformed(ActionEvent ae) {
			
			String select1 = ae.getActionCommand();
			
			
		}
		
	}
	
}



	









