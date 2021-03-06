
package facebook;

import java.awt.Component;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.*;
import java.io.*;
import java.io.IOException;
import javax.swing.event.*;
import java.net.*;
import java.util.ArrayList;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.JComboBox;


/**
 *
 * @author MARLON
 */



public class Cliente2 extends javax.swing.JFrame implements Runnable {
    int u;

    /**
     * Creates new form Cliente2
     */
    public Cliente2() {

        initComponents();
        jTextAreaChat.setLineWrap(true);
        this.setLocationRelativeTo(null);
        Inicio ventana = new Inicio();
        jLabelNick.setText(ventana.texto);
        Thread mihilo= new Thread(this);
        mihilo.start();
        addWindowListener(new  envioOnline());

    }

    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/facebook.png"));
        return retValue;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCLose = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();
        jLabelBarraUp = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollMensaje = new javax.swing.JScrollPane();
        jTextAreaChat = new javax.swing.JTextArea();
        jLabelConectado = new javax.swing.JLabel();
        jButtonGrupo = new javax.swing.JButton();
        jLabelConectados = new javax.swing.JLabel();
        jScrollChat = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabelNick = new javax.swing.JLabel();
        jLabelBolita = new javax.swing.JLabel();
        ip = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCLose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir1.png"))); // NOI18N
        jButtonCLose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCLoseActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCLose, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 40, 40));

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/feisbook1.jpg"))); // NOI18N
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        jLabelBarraUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.jpg"))); // NOI18N
        getContentPane().add(jLabelBarraUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 40));

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 300, 80, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 26, 10, 400));

        jTextAreaChat.setBackground(new java.awt.Color(153, 153, 153));
        jTextAreaChat.setColumns(20);
        jTextAreaChat.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jTextAreaChat.setRows(5);
        jTextAreaChat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextAreaChatFocusGained(evt);
            }
        });
        jScrollMensaje.setViewportView(jTextAreaChat);

        getContentPane().add(jScrollMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 300, 420, 120));

        jLabelConectado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/punto-verde1.png"))); // NOI18N
        getContentPane().add(jLabelConectado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, 30));

        jButtonGrupo.setText("Mandar Mensaje a grupo");
        jButtonGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGrupoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 180, 40));

        jLabelConectados.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabelConectados.setText("Conectados");
        getContentPane().add(jLabelConectados, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollChat.setViewportView(jTextArea1);

        getContentPane().add(jScrollChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 410, 260));

        jLabelNick.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNick.setText("Nick");
        getContentPane().add(jLabelNick, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 140, 30));

        jLabelBolita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/punto-verde1.png"))); // NOI18N
        getContentPane().add(jLabelBolita, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 203, -1, -1));

        /*
        ip.setModel(new javax.swing.DefaultComboBoxModel//(new String[]

            //  { "Usuario 1", "Usuario 2", "Usuario 3" }
        )
    );
    */
    getContentPane().add(ip, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 170, 50));

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCLoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCLoseActionPerformed

        System.exit(0);
          // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCLoseActionPerformed


    //----------------Envio de señal online-----------------------------------------
class envioOnline extends WindowAdapter  {

    public void windowOpened(WindowEvent e){

        try{
            // aqui intruduzco la ip del servidor junto con el pueto
            Socket miSocket = new Socket("192.168.0.164",3636);

            paqueteEnvio datos = new paqueteEnvio();
            datos.setMensaje(" Online");
                    ObjectOutputStream paquete_datos = new ObjectOutputStream(miSocket.getOutputStream());
                    paquete_datos.writeObject(datos);
                    miSocket.close();

        }catch(Exception e2){

        }
    }
}
//------------------------------------------------------------------------------



    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


        jTextArea1.append("\n"+ jTextAreaChat.getText());
        try {
            // TODO add your handling code here:
            //System.out.println(jTextAreaChat.getText());

            Socket misocket = new Socket("192.168.0.164",3636);

            paqueteEnvio datos = new paqueteEnvio();

            datos.setNick(jLabelNick.getText());
            datos.setIp(ip.getSelectedItem().toString());
            datos.setMensaje(jTextAreaChat.getText());
            ObjectOutputStream paquete_datos = new ObjectOutputStream (misocket.getOutputStream());
            paquete_datos.writeObject(datos);
            misocket.close();

            /*DataOutputStream flujo_salida = new DataOutputStream(misocket.getOutputStream());

            flujo_salida.writeUTF(jTextAreaChat.getText());

            flujo_salida.close();*/


         } catch (IOException ex) {

           // Logger.getLogger(Cliente2.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed








    private void jTextAreaChatFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextAreaChatFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAreaChatFocusGained

    private void jButtonGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGrupoActionPerformed
                // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGrupoActionPerformed


    //---------------------------------------------------------------------------

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cliente2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente2().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ip;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCLose;
    private javax.swing.JButton jButtonGrupo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBarraUp;
    private javax.swing.JLabel jLabelBolita;
    private javax.swing.JLabel jLabelConectado;
    private javax.swing.JLabel jLabelConectados;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelNick;
    private javax.swing.JScrollPane jScrollChat;
    private javax.swing.JScrollPane jScrollMensaje;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextAreaChat;
    // End of variables declaration//GEN-END:variables


    @Override
    public void run() {

        try{

            ServerSocket servidorCliente = new ServerSocket(3636);

            Socket cliente;
            paqueteEnvio paqueteRecibido;

            while(true){
                cliente= servidorCliente.accept();
                ObjectInputStream flujoEntrada= new ObjectInputStream(cliente.getInputStream());

                paqueteRecibido = (paqueteEnvio) flujoEntrada.readObject();

                if(!paqueteRecibido.getMensaje().equals(" Online")&&u==1){

                    jTextArea1.append("\n"+ paqueteRecibido.getNick()+":"+paqueteRecibido.getMensaje());
                }else if(u==1){
                    
                    ArrayList <String> Ipes= new ArrayList <String>();
                    
                    Ipes=paqueteRecibido.getIps();
                    
                    for(String q:Ipes){
             try {
                 Socket misocket = new Socket(q,3636);
                 paqueteEnvio datos = new paqueteEnvio();
                 datos.setNick(jLabelNick.getText());
                    datos.setIp(ip.getSelectedItem().toString());
                    datos.setMensaje(jTextAreaChat.getText());
                    ObjectOutputStream paquete_datos = new ObjectOutputStream (misocket.getOutputStream());
                    paquete_datos.writeObject(datos);
                    misocket.close();
                } catch (IOException ex) {
                    
                System.out.println(ex.getMessage());
                
                }
                        
                    }
                    
                }//termina el elseif
                
                else{

                //jTextArea1.append ("\n"+ paqueteRecibido.getIps());
                    ArrayList <String> IpsMenu= new ArrayList <String>();
                    
                    IpsMenu=paqueteRecibido.getIps();
                    
                    ip.removeAllItems();
                    
                    for(String z:IpsMenu){
                        ip.addItem(z);
                    }
                 }

            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class paqueteEnvio implements Serializable {

    private String nick , ip , mensaje;
    private ArrayList <String> Ips;

    public ArrayList <String> getIps(){
        return Ips;
    }
    /*public ArrayList <String> setIps(ArrayList <String> Ips){
        Ips=Ips;
    }*/

    public void setIps(ArrayList<String> Ips) {
        this.Ips = Ips;
    }

    public String getNick(){
        return nick;
    }
    public void setNick(String nick){
        this.nick = nick;
    }

     public String getIp(){
        return ip;
    }
    public void setIp(String ip){
        this.ip = ip;
    }

     public String getMensaje(){
        return mensaje;
    }
    public void setMensaje(String mensaje){
        this.mensaje = mensaje;
    }

}