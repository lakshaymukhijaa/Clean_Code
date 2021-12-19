public class cleancode {

    static class check {

        int smallerelement;
        int largerelement;
    }

    // METHOD TO FIND LARGEST OR SMALLEST NUMBER FROM A GIVEN ARRAY
    static check findLargestorSmallest(int givenarr[], int sizeofarr) {
        check objofcheck = new check();
        int i;

        if (sizeofarr == 1) {
            objofcheck.largerelement = givenarr[0];
            objofcheck.smallerelement = givenarr[0];
            return objofcheck;
        }

        if (givenarr[0] > givenarr[1]) {
            objofcheck.largerelement = givenarr[0];
            objofcheck.smallerelement = givenarr[1];
        } else {
            objofcheck.largerelement = givenarr[1];
            objofcheck.smallerelement = givenarr[0];
        }

        for (i = 2; i < sizeofarr; i++) {
            if (givenarr[i] > objofcheck.largerelement) {
                objofcheck.largerelement = givenarr[i];
            } else if (givenarr[i] < objofcheck.smallerelement) {
                objofcheck.smallerelement = givenarr[i];
            }
        }

        return objofcheck;
    }

    // MAIN METHOD
    public static void main(String args[]) {
        int givenarr[] = {1000, 11, 445, 1, 330, 3000};
        int sizeofarr = 6;
        check objofcheck = findLargestorSmallest(givenarr, sizeofarr);
        System.out.printf("\na is %d", objofcheck.smallerelement);
        System.out.printf("\nb is %d", objofcheck.largerelement);
    }
}

