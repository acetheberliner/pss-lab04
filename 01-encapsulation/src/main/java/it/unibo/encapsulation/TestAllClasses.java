package it.unibo.encapsulation;

public class TestAllClasses {
    public static void main(final String[] args) {
        final Calculator calc = new Calculator();
        System.out.println("1+2=" + calc.add(1, 2));
        Calculator.printCalculatorStatus(calc);
        System.out.println("-1-(+2)=" + calc.sub(-1, 2));
        Calculator.printCalculatorStatus(calc);
        System.out.println("8*3=" + calc.mul(8, 3));
        Calculator.printCalculatorStatus(calc);
        System.out.println("8/4=" + calc.div(8, 4));
        Calculator.printCalculatorStatus(calc);

        final Smartphone htcOne = new Smartphone("HTC", "One", 1024);
        final Smartphone note3 = new Smartphone(4, 2048, 8192, "Samsung", "Galaxy Note 3", true, true, true);
        htcOne.printStringRep();
        note3.printStringRep();

        final SmartLamp phillips = new SmartLamp();
        phillips.switchingOn(); //accensione lampada
        phillips.getSwitched(); //verifica accensione
        phillips.getIntensity(); //verifica intensità
        phillips.setIntensity(3); //set dell'intensità
        phillips.getIntensity(); //nuova verifica dell'intensità
        phillips.getColor(); //verifica del colore
        phillips.setColor("Green"); //set del colore
        phillips.getColor(); //nuova verifica del colore
        phillips.switchingOff(); //spegnere la lampada
        phillips.getSwitched();
        phillips.printLampInfo();
    }
}
