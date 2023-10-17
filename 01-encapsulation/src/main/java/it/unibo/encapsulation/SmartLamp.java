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
    }

    //Switch off
    public void switchingOff(){
        this.switched=false;
    }

    public void setIntensity(double value){
        this.intensity=value;

        if(this.intensity>=intensityLevels) {
            this.intensity=intensityLevels;
        }
        else{
            if(this.intensity<=0){
                this.intensity=0;
            }
        }
    }

    public void setColor(String hue){
        do{
            this.color=hue; 
        }while(hue!="White" || hue !="Red" || hue!="Green" || hue!="Blue");
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
        System.out.println(" Lamp switched ON: " + this.getSwitched() + " | Intensity: " + this.getIntensity() + " | Color: " + this.getColor());
    }
}