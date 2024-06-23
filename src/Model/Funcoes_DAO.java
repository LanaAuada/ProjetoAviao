
package Model;

import static View.Voo1.assento_txt;
import static View.Voo2.assento2_txt;

public class Funcoes_DAO {
    
    public static boolean [] ocupados1 = {false, true, true, false, true, false};
    public static boolean [] ocupados2 = {true, false, false, true, true, true};
    
    public static void assentolivre(){
        String x = View.Voo1.assento_txt.getText();
        View.Voo1.msg_lbl.setText("");
        
        try {
            int y = Integer.parseInt(x);
            
            if(y == 1){       
                if (ocupados1[0]) {
                    View.Voo1.msg_lbl.setText("Assento já selecionado");
                } 
                else {
                    View.Voo1.assento1_lbl.setText("1 [ x ]");
                    ocupados1[0] = true;
                }
            }
            else if(y == 4){        
                if (ocupados1[3]) {
                    View.Voo1.msg_lbl.setText("Assento já selecionado");
                } 
                else {
                    View.Voo1.assento4_lbl.setText("4 [ x ]");  
                    ocupados1[3] = true;
                }
            }
            else if(y == 6){       
                if (ocupados1[5]) {
                    View.Voo1.msg_lbl.setText("Assento já selecionado");
                }
                else {
                    View.Voo1.assento6_lbl.setText("6 [ x ]");
                    ocupados1[5] = true;
                }
            }
            else if(y == 2 || y == 3 || y == 5){
                View.Voo1.msg_lbl.setText("Assento ocupado");
            }
            else{
                View.Voo1.msg_lbl.setText("Assento inexistente");
            }
        } catch (NumberFormatException e) {
            View.Voo1.msg_lbl.setText("Entrada inválida");
        }
    }
    
    public static void assentolivre2(){
        String x = View.Voo2.assento2_txt.getText();
        View.Voo2.msg2_lbl.setText("");
        
        try {
            int y = Integer.parseInt(x);
            
            if(y == 2){       
                if (ocupados2[1]) {
                    View.Voo2.msg2_lbl.setText("Assento já selecionado");
                } 
                else {
                    View.Voo2.assento2v2_lbl.setText("2 [ x ]");
                    ocupados2[1] = true;
                }
            }
            else if(y == 3){       
                if (ocupados2[2]) {
                    View.Voo2.msg2_lbl.setText("Assento já selecionado");
                } 
                else {
                    View.Voo2.assento3v2_lbl.setText("3 [ x ]");
                    ocupados2[2] = true;
                }
            }
            else if(y == 1 || y == 4 || y == 5 || y == 6){
                View.Voo2.msg2_lbl.setText("Assento ocupado");
            }
            else{
                View.Voo2.msg2_lbl.setText("Assento inexistente");
            }
        } catch (NumberFormatException e) {
            View.Voo2.msg2_lbl.setText("Entrada inválida");
        }
    }
}
