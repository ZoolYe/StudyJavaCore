package day24;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStream {

	public static void main(String[] args) throws IOException {
		PipedInputStream pip = new PipedInputStream();
		PipedOutputStream pop = new PipedOutputStream();
		pip.connect(pop);
		
		new Thread(new Input(pip)).start();
		new Thread(new Output(pop)).start();
	}

}

class Input implements Runnable{

	private PipedInputStream pin;
	
	public Input(PipedInputStream pin) {
		super();
		this.pin = pin;
	}

	@Override
	public void run() {
		byte []buf = new byte[1024];
		int len = 0;
		try {
			len = pin.read(buf);
			String str = new String(buf,0,len);
			System.out.println(str);
			pin.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

class Output implements Runnable{

	private PipedOutputStream pos;
	
	public Output(PipedOutputStream pos) {
		this.pos = pos;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(5000);
			pos.write("hei管道流来了".getBytes());
			pos.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}