
package atm_system;


 
public class ATM_SYSTEM {

    
    public static void main(String[] args) {
        splash Keypad=new splash();
        Keypad.setVisible(true);
        Keypad.setLocationRelativeTo(null);
        verify very=new verify();
        try{
         for(int i = 0; i<=100; i++){
         Thread.sleep(50);
         Keypad.progressno.setText(Integer.toString(i)+"%");
         Keypad.progressbar.setValue(i);
         if(i==100){
         Keypad.setVisible(false);
         very.setVisible(true);
         very.setLocationRelativeTo(null);
         }
         
         }
        
        }
        catch(Exception e){
        
        }
        
        
    }
    
}
