package app.controller;

import app.entity.Report;
import app.service.ReportService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * By using @Controller, you're indicating that this class is responsible for handling views,
 * and Spring will look for a Thymeleaf template named "dashboard.html" in the specified template
 * resolver location.
 * <p>
 * With this adjustment, when you access the /api/reports/dashboard endpoint, the Thymeleaf
 * template will be processed, and the reports will be displayed in the dashboard.
 * Make sure your project is properly configured with Thymeleaf dependencies and a correct
 * template resolver for Thymeleaf to work.
 */
@Controller
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
    public Report submitReport(Report report) {
        return reportService.saveReport(report);
    }

    /**
     * @param model
     * @return
     *
     * 1#. Make sure that your controller method returns the name of the
     * Thymeleaf template without the file extension (e.g., "dashboard"),
     * and it adds the reports attribute to the model.
     * <p>
     * 2#. With this setup, when you access the /api/reports/dashboard endpoint,
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