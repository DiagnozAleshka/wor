import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void testSumSales() {
        StatsService service = new StatsService();
        int expected = 180;
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actuall = service.summAllSales(sales);
        Assertions.assertEquals(expected, actuall);
    }

    @Test
    public void peakSalesTest() {
        StatsService service = new StatsService();
        int expected = 8;
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actuall = service.peakSales(sales);
        Assertions.assertEquals(expected, actuall);
    }

    @Test
    public void bottomSalesTest() {
        StatsService service = new StatsService();
        int expected = 9;
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actuall = service.bottomSales(sales);
        Assertions.assertEquals(expected, actuall);
    }

    public void averageSalesTest() {
        StatsService service = new StatsService();
        int expected = 15;
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actuall = service.averageSales(sales);
        Assertions.assertEquals(expected, actuall);
    }
    @Test
    public void amountMonthsUnderAverageTest() {
        StatsService service = new StatsService();
        int expected = 5;
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actuall = service.amountMonthsUnderAverage(sales);
        Assertions.assertEquals(expected, actuall);
    }

    @Test
    public void amountMonthsBelowAverageTest() {
        StatsService service = new StatsService();
        int expected = 5;
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actuall = service.amountMonthsBelowAverage(sales);
        Assertions.assertEquals(expected, actuall);
    }
}
