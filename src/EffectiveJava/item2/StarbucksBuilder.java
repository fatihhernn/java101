package EffectiveJava.item2;

public class StarbucksBuilder {
    //Gerekli
    private String kahveBoyutu;

    //Seçime göre değişir
    private String laktozsuzSütMiktari;
    private String yumusakIcim;


    /* Telescoping Pattern
    public Starbucks(String kahveBoyutu) {
        this.kahveBoyutu = kahveBoyutu;
    }

    public Starbucks(String kahveBoyutu, String laktozsuzSütMiktari) {
        this.kahveBoyutu = kahveBoyutu;
        this.laktozsuzSütMiktari = laktozsuzSütMiktari;
    }

    public Starbucks(String kahveBoyutu, String laktozsuzSütMiktari, String yumusakIcim) {
        this.kahveBoyutu = kahveBoyutu;
        this.laktozsuzSütMiktari = laktozsuzSütMiktari;
        this.yumusakIcim = yumusakIcim;
    }
     */
    /* JAVABEANS pattern
    public void setKahveBoyutu(String kahveBoyutu) {
        this.kahveBoyutu = kahveBoyutu;
    }

    public void setLaktozsuzSütMiktari(String laktozsuzSütMiktari) {
        this.laktozsuzSütMiktari = laktozsuzSütMiktari;
    }

    public void setYumusakIcim(String yumusakIcim) {
        this.yumusakIcim = yumusakIcim;
    }

     */
    public static class Builder{

        //Gerekli
        private final String kahveBoyutu;
        //Seçime göre değişir

        private String laktozsuzSütMiktari;
        private String yumusakIcim;
        public Builder(String kahveBoyutu) {
            this.kahveBoyutu = kahveBoyutu;
        }

        public Builder laktozsuzTayfa(String laktozsuzSüt){
            laktozsuzSütMiktari=laktozsuzSüt;
            return this;
        }

        public Builder yumusakIcenler(String yumusakDeger){
            yumusakIcim=yumusakIcim;
            return this;
        }
        public StarbucksBuilder build(){
            return new StarbucksBuilder(this); // boş ctor arka tarafta var
        }

    }
    public StarbucksBuilder(Builder builder) {
        kahveBoyutu=builder.kahveBoyutu;
        laktozsuzSütMiktari= builder.laktozsuzSütMiktari;;
        yumusakIcim=builder.yumusakIcim;
    }
}
