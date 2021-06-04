
package project.setter.and.getter.bus;

/**
 *
 * @author MOKLET-2
 */
public class SetterGetterBus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MengujiBus Bis = new MengujiBus(100);
        Bis.getPenumpang(48);
        Bis.getPenumpang(24);
        Bis.cetakpenumpang();
        //jarak
        System.out.println();
        
        
        //penambahan penumpang
        Bis.addPenumpang(30);
        Bis.getPenumpang(24);
        Bis.cetakpenumpang();
        //jarak
        System.out.println();
        
        
        //tambah lagi
        Bis.addPenumpang(40);
        Bis.getPenumpang(24);
        Bis.cetakpenumpang();
        //jarak
        System.out.println();
        
        
        System.out.println("Rata-rata Berat Penumpang Bus Sekarang adalah = "+Bis.getAverage());
        
    }
}