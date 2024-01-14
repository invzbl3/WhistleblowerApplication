package app.controller;

import app.entity.Report;
import app.service.ReportService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/reports")
public class ReportController {
    private final ReportService reportService;

    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    @GetMapping
    public List<Report> getAllReports() {
        return reportService.getAllReports();
    }

    @PostMapping
    public Report submitReport(@RequestBody Report report) {
        return reportService.saveReport(report);
    }

    /**
     * @param model
     * @return
     *
     * With this setup, when you access the /api/reports/dashboard endpoint,
     * the Thymeleaf template will be processed, and the reports will be displayed
     * in the dashboard. Adjust the paths and template structure based on your needs.
     */
    @GetMapping("/dashboard")
    public String showDashboard(Model model) {
        List<Report> reports = reportService.getAllReports();
        model.addAttribute("reports", reports);
        return "dashboard";
    }
}