
package project.setter.and.getter.bus;

/**
 *
 * @author MOKLET-2
 */
public class MengujiBus {
    private double penumpang, maxPenumpang;
    private int counter;
    public double penumpangBaru;
    
    //konstruktor
    public MengujiBus(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    //method mutator
    public void addPenumpang(double penumpang){
        double temp;
        temp = this.penumpang+penumpang;
        if (temp > maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else{
            this.penumpang = temp;
            counter++;
        }
    }
    
    public void getPenumpang(int password){
        if(password==24){
            System.out.println("Password Benar");
        }
        else{
            System.out.println("Password salah");
        }
    }
    
    public double getAverage(){
        double average = penumpang / counter;
        return average;
    }
    
    public void cetakpenumpang(){
        System.out.println("Penumpang Bus sekarang adalah "+ penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah " + maxPenumpang);
        
    }

    //Penerapan Setter dan Getter
    public double getPenumpang() {
        return penumpang;
    }

    public void setPenumpang(double penumpang) {
        this.penumpang = penumpang;
    }

    public double getMaxPenumpang() {
        return maxPenumpang;
    }

    public void setMaxPenumpang(double maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public double getPenumpangBaru() {
        return penumpangBaru;
    }

    public void setPenumpangBaru(double penumpangBaru) {
        this.penumpangBaru = penumpangBaru;
    }
}

