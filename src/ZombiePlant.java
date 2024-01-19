public class ZombiePlant {
    private int potency;
    private int requiredTreatments;
    public ZombiePlant(int a, int b) {
        potency = a;
        requiredTreatments = b;
    }

    public int treatmentsNeeded () {
        return requiredTreatments;
    }
    public boolean isDangerous() {
        if (requiredTreatments >0) {
            return true;
        }
        return false;
    }
    public void treat (int i) {
        if (i <= potency && i>0) {
            if (requiredTreatments>0) {requiredTreatments--;}
        }
        else if (i >0) {
            requiredTreatments++;
        }
    }

    public int getPotencyRequired() {
        return potency;
    }
}
