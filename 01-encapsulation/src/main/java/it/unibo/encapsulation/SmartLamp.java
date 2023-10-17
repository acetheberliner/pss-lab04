package it.unibo.encapsulation;

public class SmartLamp {
    private final int intensityLevels=3;

    private boolean switched;
    private double intensity;
    private String color; //W R B G
    //--------------------------------------------------------------------------------------------------------

    public SmartLamp (){
        this.switched=false;
        this.intensity=0;
        this.color="White";
    }
    //--------------------------------------------------------------------------------------------------------

    //Switch on
    public void switchingOn(){
        this.switched=true;
        this.intensity=1;
    }

    //Switch off
    public void switchingOff(){
        this.switched=false;
        this.intensity=0;
    }

    //Gestione intensità
    public void setIntensity(double value){
        this.intensity=value;

        if(this.intensity>=intensityLevels) {
            this.intensity=intensityLevels;
        }
        else{
            if(this.intensity<=0){
                this.intensity=1;
            }
        }
    }

    //Set del colore della lamp
    public void setColor(String hue){
        if(hue == "White" || hue == "Red" || hue == "Green" || hue == "Blue"){
            this.color=hue;
        }
    }
    //--------------------------------------------------------------------------------------------------------

    public boolean getSwitched(){
        return this.switched;
    }

    public double getIntensity(){
        return this.intensity;
    }

    public String getColor(){
        return this.color;
    }
    //--------------------------------------------------------------------------------------------------------

    public void printLampInfo(){
        System.out.println("Accensione lampada... ");
        System.out.println("Lampada accesa: " + this.getSwitched());

        System.out.println("\n Intensita' attuale: " + this.getIntensity());

        System.out.println("Nuova Verifica intensita': " + this.getIntensity());

        System.out.println("\n Colore attuale: " + this.getColor());
        this.setColor("Green");
        System.out.println("Nuovo colore: " + this.getColor());

        System.out.println("\n Spegnimento lampada...");
        System.out.println("Lampada accesa: " + this.getSwitched());
        
    }
}