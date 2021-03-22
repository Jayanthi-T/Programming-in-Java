import java.io.*;
import java.net.*;
 
class serversame{
	public static void main(String[] args){
		try{
			ServerSocket ss = new ServerSocket(1201);
			Socket s = ss.accept();

			DataInputStream din = new DataInputStream(s.getInputStream());
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String msgin = "",msgout = "";

			while(!msgin.equals("End")){
				msgin = din.readUTF();
				System.out.println("Client says : "+msgin);
				msgout = br.readLine();
				dout.writeUTF(msgout);
				dout.flush();
			}
			s.close();

		}catch(Exception e){
			//handle exceptions
		}
	}
}
