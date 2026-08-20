class Solution {
    public String dayOfTheWeek(int day, int month, int year) {

        String[] days = {
            "Sunday",
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday"
        };

        int totalDays = 0;

        // Add days from previous years
        for (int y = 1971; y < year; y++) {
            if (isLeapYear(y)) {
                totalDays += 366;
            } else {
                totalDays += 365;
            }
        }

        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        // Add days from previous months
        for (int m = 1; m < month; m++) {
            totalDays += daysInMonth[m - 1];

            if (m == 2 && isLeapYear(year)) {
                totalDays++;
            }
        }

        // Add days before the given date
        totalDays += day - 1;

        // January 1, 1971 = Friday (index 5)
        return days[(5 + totalDays) % 7];
    }

    private boolean isLeapYear(int year) {
        return (year % 400 == 0) ||
               (year % 4 == 0 && year % 100 != 0);
    }
}