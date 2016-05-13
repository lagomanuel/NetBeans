/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

/**
 *
 * @author mfrancisco
 */
public class WorkingExperience {

    private static final Integer YEARS = 31;
    private static final Integer MONTHS = 12;

    public WorkingExperience(String[] args) throws IOException {
        File file = new File(args[0]);
        try (BufferedReader buffer = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = buffer.readLine()) != null) {
                line = line.trim();
                String[] dates = line.split(";");

                boolean[][] months = new boolean[YEARS][MONTHS];

                for (String date : dates) {
                    String[] borders = date.trim().split("-");
                    String[] start = borders[0].trim().split(" ");
                    String[] end = borders[1].trim().split(" ");

                    Integer startMonth = getMonth(start[0]);
                    Integer startYear = getYear(start[1]);

                    Integer endMonth = getMonth(end[0]);
                    Integer endYear = getYear(end[1]);

                    while (true) {
                        months[startYear][startMonth] = true;

                        startMonth++;

                        if (startMonth >= MONTHS) {
                            startYear++;
                            startMonth = 0;
                        }

                        if (startYear > endYear) {
                            break;
                        }
                        if (Objects.equals(startYear, endYear)) {
                            if (startMonth > endMonth) {
                                break;
                            }
                        }
                    }
                }

                Integer monthSum = 0;

                for (Integer year = 0; year < YEARS; ++year) {
                    for (Integer month = 0; month < MONTHS; ++month) {
                        if (months[year][month]) {
                            monthSum++;
                        }
                    }
                }

                System.out.println(monthSum / 12);
            }
        }
    }

    private static Integer getYear(String sYear) {
        return Integer.valueOf(sYear) - 1990;
    }

    private static Integer getMonth(String sMonth) {
        if (null != sMonth) switch (sMonth) {
            case "Jan":
                return 0;
            case "Feb":
                return 1;
            case "Mar":
                return 2;
            case "Apr":
                return 3;
            case "May":
                return 4;
            case "Jun":
                return 5;
            case "Jul":
                return 6;
            case "Aug":
                return 7;
            case "Sep":
                return 8;
            case "Oct":
                return 9;
            case "Nov":
                return 10;
            default:
                return 11;
        }
        
        return null;
    }
}
