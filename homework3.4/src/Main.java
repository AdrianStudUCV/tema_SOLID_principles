public class Main {
    public static void main(String[] args) {
        // Simple Printer
        Printer simplePrinter = new SimplePrinter();
        simplePrinter.print();

        // Printer & Scanner
        PrinterScanner printerScanner = new PrinterScanner();
        printerScanner.print();
        printerScanner.scan();

        // Fully Functional Printer
        MultifunctionalPrinter mfp = new FullyFunctionalPrinter();
        mfp.print();
        mfp.scan();
        mfp.fax();
    }
}