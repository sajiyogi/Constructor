public class Keturunan extends Ibrahim{
	
	public int umur;

	public Keturunan(String nama, int umur){
		super(nama);		
		this.umur = umur;
	}

	public Keturunan (String nama){
		super(nama);
	}


	public void showUmur(){
		System.out.println(umur);
	}

}