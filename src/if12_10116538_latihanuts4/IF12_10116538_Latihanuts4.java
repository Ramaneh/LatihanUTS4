/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if12_10116538_latihanuts4;

/**
 *
 * @author Asus
 */
public class IF12_10116538_Latihanuts4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ModelDesigner oMdg = new ModelDesigner();
        oMdg.bonusDesigner(50000);
        ModelProgrammer oMpgrmr = new ModelProgrammer();
        oMpgrmr.bonusProgrammer(40000);
        ModelSystemAnalyst oMsan = new ModelSystemAnalyst();
        oMsan.bonusSystemAnalyst(50000);
        
    }
    
}
