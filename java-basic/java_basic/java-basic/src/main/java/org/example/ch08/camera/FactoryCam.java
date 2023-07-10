package org.example.ch08.camera;

import org.example.ch08.detector.Detectable;
import org.example.ch08.reporter.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable {

    private Detectable detector;
    private Reportable reportor;

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReportor(Reportable reportor) {
        this.reportor = reportor;
    }

    @Override
    public void showMainFeature() {
        System.out.println("화재 감지");
    }

    @Override
    public void detect() {
        detector.detect();
    }

    @Override
    public void report() {
        reportor.report();
    }
}
