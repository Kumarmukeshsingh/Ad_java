package Adapter;

 //Makes incompatible classes work together.
//  Real-life example

// 👉 Mobile charger adapter
// Works with old systems
// ✅ No modification needed

interface Charger {
    void chargePhone();
}

class OldCharger {
    public void chargeWithOldPin() {
        System.out.println("Charging with old charger");
    }
}

class ChargerAdapter implements Charger {
    OldCharger oldCharger = new OldCharger();
    public void chargePhone() {
        oldCharger.chargeWithOldPin();
    }
}

public class Main {
    public static void main(String[] args) {
        Charger charger = new ChargerAdapter();
        charger.chargePhone();
    }
}
