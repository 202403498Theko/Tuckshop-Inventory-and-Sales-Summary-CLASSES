package service;
import contracts.*;

public class ReportService implements Report {

    private SalesServices salesServices;

    public ReportService(SalesServices salesServices) {
        this.salesServices = salesServices;
    }

    @Override
    public void generateReport() {
        System.out.println("===== SALES REPORT =====");
        salesServices.viewSales();
    }
}