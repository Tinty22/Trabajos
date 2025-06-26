package interfacee;

public class guitarra implements ReproductorDeAudio {
boolean afinada = false;
	@Override
	public void reproducir() {
	if (afinada) {
		System.out.println("esta afinada");
	}else {
			System.out.println("no esta afinada");
		}
		
		
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		
	}

}
