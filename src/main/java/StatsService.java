//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StatsService {


        public int summAllSales(int[] sales) {
            int summSales = 0;
            for (int i = 0; i < sales.length; i++) {
                summSales = summSales + sales[i];
            }
            return summSales;
        }




        public int averageSales(int[] sales) {
            int totalSumm = 0;
            for (int i = 0; i < sales.length; i++) {
                totalSumm = totalSumm + sales[i];

            }
            return totalSumm / 12;
        }




        public int peakSales (int[] sales) {
            int maxMonth = 0;
            for (int i = 0; i < sales.length; i++) {
                if (sales[i] >= sales[maxMonth]) {
                    maxMonth = i;

                }
            }
            return maxMonth + 1;
        }




        public int bottomSales(int[] sales) {
            int minMonth = 0;
            for (int i = 0; i < sales.length; i++) {
                if (sales[i] <= sales[minMonth]) {
                    minMonth = i;

                }
            }
            return minMonth + 1;
        }




        public int amountMonthsBelowAverage(int[] sales) {
            int amountMonths = averageSales(sales);
            int month = 0;
            for (int i = 0; i < sales.length; i++) {
                if (sales[i] < amountMonths) {
                    month++;

                }
            }
            return month;
        }



        public int amountMonthsUnderAverage(int[] sales) {
            int amountMonths = averageSales(sales);
            int month = 0;
            for (int i = 0; i < sales.length; i++) {
                if (sales[i] > amountMonths) {
                    month++;
                }
            }
            return month;
        }
    }


