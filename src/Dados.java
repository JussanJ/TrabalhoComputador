
public class Dados {
	Print fg = new Print();
	private int var[] = { 0, 0, 0, 0, 0, 0 };
	private int[] memoria = new int[256];
	private int uc = var[0];
	private int ula = var[1];
	private int a = var[2];
	private int b = var[3];
	private int pc = var[4];
	private int ir = var[5];

	public void setDADOS(int i){
		fg.setDADOS(i);
	}
	
	public void setENDEREÇO(int i){
		fg.setENDEREÇO(i);
	}
	
	public void setREAD(int i ){
		fg.setREAD(i);
	}
	public void setMEMORIA(int i){
		fg.setMEMORIA(i);
	}
	
	public int getUc() {
		return uc;
	}

	public void setUc(int uc) {
		this.uc = uc;
		fg.setUc(uc);
	}

	public int getUla() {
		return ula;
	}

	public void setUla(int ula) {
		this.ula = ula;
		fg.setUla(ula);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
		fg.setA(a);
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
		fg.setB(b);
	}

	public int getPc() {
		return pc;
	}

	public void setPc(int pc) {
		this.pc = pc;
		fg.setPc(pc);
		}

	public int getIr() {
		return ir;
	}

	public void setIr(int ir) {
		this.ir = ir;
		fg.setIr(ir);
	}

	public int[] getVar() {
		return var;
	}

	public int getMemoria(int i) {
		return memoria[i];
	}

	public void setMemoria(int memoria, int i) {
		this.memoria[i] = memoria;
		fg.setMemoria(memoria, i);
	}
	public void Tela(){
		fg.figura();
	}
	
	public void PCinc(){
		this.setPc(this.getPc()+1);
	}
	
}
