package facebook;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Servidor  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoServidor mimarco=new MarcoServidor();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}	
}

class MarcoServidor extends JFrame implements Runnable {
	
	public MarcoServidor(){
		
		setBounds(1200,300,280,350);				
			
		JPanel milamina= new JPanel();
		
		milamina.setLayout(new BorderLayout());
		
		areatexto=new JTextArea();
		
		milamina.add(areatexto,BorderLayout.CENTER);
		
		add(milamina);
		
		setVisible(true);
                
                Thread mihilo = new Thread (this);
                mihilo.start();
		
		}
	
	

    @Override
    public void run() {
            try {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                // System.out.println("Estoy a la esucha");
                ServerSocket  servidor= new ServerSocket (3636);
                
                String  nick , ip , mensaje ;
                
                 ArrayList <String> listaIp= new ArrayList<String>();
                 
                paqueteEnvio paqueteRecibido;
                
                while(true){
                
                Socket misocket = servidor.accept();
               
                
                 ObjectInputStream paquete_datos = new ObjectInputStream (misocket.getInputStream());
                 
                 paqueteRecibido = (paqueteEnvio) paquete_datos.readObject(); 
                 
                 nick=paqueteRecibido.getNick(); 
                 ip=paqueteRecibido.getIp();
                 mensaje=paqueteRecibido.getMensaje();
                
               /* DataInputStream flujo_entrada = new  DataInputStream(misocket.getInputStream());
                String mensaje_texto = flujo_entrada.readUTF();
                areatexto.append("\n" + mensaje_texto);*/
                 
                 if(!mensaje.equals(" online")){
                 
                 areatexto.append("\n"+nick+": \n"+mensaje+" para:"+ip);
                 
                 
                 
                 Socket enviarDestinatario = new Socket(ip,3636);
                 
                 ObjectOutputStream paqueteReenvio= new ObjectOutputStream(enviarDestinatario.getOutputStream());
                 
                 paqueteReenvio.writeObject(paqueteRecibido);
                 
                 paqueteReenvio.close();
                 
                 enviarDestinatario.close();
                 
                misocket.close(); }else{
                 //-------------------Detecta online--------------------------
                InetAddress localizacion = misocket.getInetAddress(); 
                
                String IpRemota= localizacion.getHostAddress();
                
                System.out.print(" Online"+ IpRemota);
                
               listaIp.add(IpRemota);
               
               paqueteRecibido.setIps(listaIp);
               
               for (String z:   listaIp ){
                System.out.print(   "Array"+IpRemota    );
                
                
                 Socket enviarDestinatario = new Socket(z,3636);
                 
                 ObjectOutputStream paqueteReenvio= new ObjectOutputStream(enviarDestinatario.getOutputStream());
                 
                 paqueteReenvio.writeObject(paqueteRecibido);
                 
                 paqueteReenvio.close();
                 
                 enviarDestinatario.close();
                 
                misocket.close();
               }
                //------------ -----------Acaba--------------------------------
                 }
                    
                }
                
                
                
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(MarcoServidor.class.getName()).log(Level.SEVERE, null, ex);
            } 
    }
    private	JTextArea areatexto;
}
