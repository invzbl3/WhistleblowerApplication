package app.service;

import app.entity.Report;
import app.repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;

@Service
public class ReportService {
    @Autowired
    private ReportRepository reportRepository;

    public List<Report> getAllReports() {
        return reportRepository.findAll();
    }

    public Report saveReport(Report report) {
        report.setTimestamp(new Date());
        return reportRepository.save(report);
    }
}