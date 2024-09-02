package com.coronavirus.covidtracker.controller;

import com.coronavirus.covidtracker.covidmodels.LocationStats;
import com.coronavirus.covidtracker.covidservices.CovidDataServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.DecimalFormat;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    CovidDataServices covidDataServices;

    @GetMapping("/")
    public String home(Model model) {
        List<LocationStats> allStatsMod = covidDataServices.getAllStats();
        int totalCases = covidDataServices.getAllStats().stream().mapToInt(stat -> stat.getTotalCases()).sum();
        int difference = covidDataServices.getAllStats().stream().mapToInt(stat -> stat.getDiff()).sum();
        String pattern = "#,###.###";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        decimalFormat.setGroupingSize(3);
        String fTotalCases = decimalFormat.format(totalCases);
        String fDiff = decimalFormat.format(difference);
        model.addAttribute("locationStats",allStatsMod);
        model.addAttribute("totalCases",fTotalCases );
        model.addAttribute("difference",fDiff );
        return "home";
    }
}
