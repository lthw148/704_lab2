import com.systemj.netapi.TCPSender;

import java.io.IOException;

import com.systemj.netapi.OutputSignal;



public class Exercise4 {
    public static void main(String[] args) throws IOException {
    	TCPSender A = new TCPSender("127.0.0.1", 4000);
    	TCPSender B = new TCPSender("127.0.0.1", 4001);
    	
    	A.emit(true, 10);
		B.emit(true, 10);
		
		System.out.println("HI I AM HERE");

    }

	
}