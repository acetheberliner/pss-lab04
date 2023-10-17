public class SmartLamp {
    private final int intensityLevels=3

    private boolean switched;
    private String color; //W R B G
    //--------------------------------------------------------------------------------------------------------

    public SmartLamp (){
        this.switched=false;
        this.intensity=0;
        this.color="White";
    }
    //--------------------------------------------------------------------------------------------------------

    //Switch on
    public switchingOn(){
        this.switched=true;
    }

    //Switch off
    public switchingOff(){
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

    public void getSwitched(){
        return this.switched;
    }

    public void getIntensity(){
        return this.intensity;
    }

    public void getColor(){
        return this.color;
    }
    //--------------------------------------------------------------------------------------------------------

    public void printLampInfo(){
        System.out.println(" Lamp switched ON: " + this.getSwitched() + " | Intensity: " + this.getIntensity() + " | Color: " + this.getColor());
    }
}