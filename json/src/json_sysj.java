

import java.io.IOException;

import com.systemj.netapi.OutputSignal;

import com.systemj.netapi.*;

public class json_sysj {
    public static void main(String[] args) throws IOException  {
    	
    	
    	TCPSender send = new TCPSender("127.0.0.1", 100);
    	
    	TCPReceiver get = new TCPReceiver("127.0.0.1", 100);
    	
		

    }
	
}