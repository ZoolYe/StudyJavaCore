package day26.udp;

import java.net.DatagramSocket;
import java.net.SocketException;

public class ChatDemo {

	public static void main(String[] args) throws SocketException {

		Send sen = new Send(new DatagramSocket(8889));
		Rece rece = new Rece(new DatagramSocket(6248));
		
		new Thread(rece).start();
		new Thread(sen).start();
	}

}
