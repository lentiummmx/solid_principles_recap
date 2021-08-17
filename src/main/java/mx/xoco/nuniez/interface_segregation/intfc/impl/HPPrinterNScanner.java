package mx.xoco.nuniez.interface_segregation.intfc.impl;

import mx.xoco.nuniez.interface_segregation.intfc.IPrint;
import mx.xoco.nuniez.interface_segregation.intfc.IScan;

public class HPPrinterNScanner implements IPrint, IScan {
    @Override
    public void print() {
        // Real printing code starts here
        //
        //
        // Real printing code ends here
    }

    @Override
    public void getPrintSpoolDetails() {
        // Real get print spool details code starts here
        //
        //
        // Real get print spool details code ends here
    }

    @Override
    public void scan() {
        // Real scan code starts here
        //
        //
        // Real scan code ends here
    }

    @Override
    public void scanPhoto() {
        // Real photo scan code starts here
        //
        //
        // Real photo scan code ends here
    }
}
