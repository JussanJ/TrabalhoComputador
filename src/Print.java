
public class Print {
	private String uc = "      ";
	private String ula = "______";
	private String a = "      ";
	private String b = "      ";
	private String pc = "      ";
	private int pcint;
	private String ir = "      ";
	private String DADOS = "      ";
	private String ENDEREÇO = " ";
	private String VIDEO = "      ";
	private String READ = "0";
	private String MEMORIA = "0";
	private String memoria[] = new String[256];
	private String endMem[] = { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "0A", "0B", "0C", "0D",
			"0E", "0F", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "1A", "1B", "1C", "1D", "1E", "1F",
			"20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "2A", "2B", "2C", "2D", "2E", "2F", "30", "31",
			"32", "33", "34", "35", "36", "37", "38", "39", "3A", "3B", "3C", "3D", "3E", "3F", "40", "41", "42", "43",
			"44", "45", "46", "47", "48", "49", "4A", "4B", "4C", "4D", "4E", "4F", "50", "51", "52", "53", "54", "55",
			"56", "57", "58", "59", "5A", "5B", "5C", "5D", "5E", "5F", "60", "61", "62", "63", "64", "65", "66", "67",
			"68", "69", "6A", "6B", "6C", "6D", "6E", "6F", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79",
			"7A", "7B", "7C", "7D", "7E", "7F", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "8A", "8B",
			"8C", "8D", "8E", "8F", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "9A", "9B", "9C", "9D",
			"9E", "9F", "A0", "A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "AA", "AB", "AC", "AD", "AE", "AF",
			"B0", "B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "B9", "BA", "BB", "BC", "BD", "BE", "BF", "C0", "C1",
			"C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "CA", "CB", "CC", "CD", "CE", "CF", "D0", "D1", "D2", "D3",
			"D4", "D5", "D6", "D7", "D8", "D9", "DA", "DB", "DC", "DE", "DF", "E0", "E1", "E2", "E3", "E4", "E5", "E6",
			"E7", "E8", "E9", "EA", "EB", "EC", "ED", "EE", "EF", "F0", "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8",
			"F9", "FA", "FB", "FC", "FD", "FE", "FF" };

	public String fill(String s, char fill, int qntd) {
		while (s.length() < qntd) {
			s += fill;
		}

		return s;
	}
	
	public Print(){
		for(int i = 0; i<256; i++){
		memoria[i]="________";}
	}

	

	

	public void setDADOS(int dADOS) {
		DADOS = Integer.toString(dADOS);
	}

	

	public void setENDEREÇO(int eNDEREÇO) {
		ENDEREÇO = Integer.toString(eNDEREÇO);
	}

	

	public void setREAD(int rEAD) {
		READ = Integer.toString(rEAD);
	}

	

	public void setMEMORIA(int mEMORIA) {
		MEMORIA = Integer.toString(mEMORIA);
	}

	public void setUc(int uc) {
		this.uc = 
		fill(Integer.toString(uc), ' ' , 6);
	}

	public void setUla(int ula) {
		this.ula = 
		fill(Integer.toString(ula), '_' , 6);
	}

	public void setA(int a) {
		this.a = 
		fill(Integer.toString(a), ' ' , 6);
	}

	public void setB(int b) {
		this.b = 
		fill(Integer.toString(b), ' ' , 6);
	}

	public void setPc(int pc) {
		this.pcint = pc;
		this.pc = 
		fill(Integer.toString(pc), ' ' , 6);
	}

	public void setIr(int ir) {
		this.ir = 
		fill(Integer.toString(ir), ' ' , 6);
	}

	public void setMemoria(int memoria, int i) {
		this.memoria[i] = fill(Integer.toString(memoria) , '_' , 8);
		
	}

	public void figura(){
		int v = pcint;
		System.out.printf(
				" ___________________                            ____MEMÓRIA____\n"
						+ "| _________________ |                        %s|_______%s|\n"
						+ "||   UC=%s     ||                        %s|_______%s|\n"
						+ "||_________________||                        %s|_______%s|\n"
						+ "| ___|______    |   |                        %s|_______%s|\n"
						+ "||ULA=%s|   |   |                        %s|_______%s|\n"
						+ "| _|____________|__ |                        %s|_______%s|\n"
						+ "||   A=%s      ||                        %s|_______%s|\n"
						+ "||_________________||                        %s|_______%s|\n"
						+ "||   B=%s      ||                        %s|_______%s|\n"
						+ "||_________________||                        %s|_______%s|       ______VIDEO______\n"
						+ "||   PC=%s     ||                        %s|_______%s|      | _______________ |\n"
						+ "||_________________||                        %s|_______%s|      ||               ||\n"
						+ "||   IR=%s     ||                        %s|_______%s|      ||               ||\n"
						+ "||_________________||                        %s|_______%s|      ||    %s     ||\n"
						+ "||   %s        ||                        %s|_______%s|      ||               ||\n"
						+ "||_________________||                        %s|_______%s|      ||_______________||\n"
						+ "|___________________|                        %s|_______%s|      |_________________|\n"
						+ "|    |    |    |                                |   |   |               |   |   |\n"
						+ "|    |    |    |                                |   |   |               |   |   |\n"
						+ "|    |    |    |________________________________|___|___|_______________|___|___|______Dados:%s \n"
						+ "|    |    |_________________________________________|___|___________________|___|______Endereço:%s \n"
						+ "|    |__________________________________________________|_______________________|______Read=%s \n"
						+ "|______________________________________________________________________________________Memória=%s \n",
				endMem[v + 16], memoria[v + 16], uc, endMem[v + 15], memoria[v + 15], endMem[v + 14],
				memoria[v + 14], endMem[v + 13], memoria[v + 13], ula, endMem[v + 12], memoria[v + 12],
				endMem[v + 11], memoria[v + 11], a, endMem[v + 10], memoria[v + 10], endMem[v + 9],
				memoria[v + 9], b, endMem[v + 8], memoria[v + 8], endMem[v + 7], memoria[v + 7], pc,
				endMem[v + 6], memoria[v + 6], endMem[v + 5], memoria[v + 5], ir, endMem[v + 4], memoria[v + 4],
				endMem[v + 3], memoria[v + 3], VIDEO, "FLAGS ", endMem[v + 2], memoria[v + 2], endMem[v + 1],
				memoria[v + 1], endMem[v], memoria[v], DADOS, ENDEREÇO, READ, MEMORIA);
	}
	}
