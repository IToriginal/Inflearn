package org.example.ch08;

import org.example.ch08.reporter.NomalReporter;
import org.example.ch08.reporter.Reportable;
import org.example.ch08.reporter.VideoReporter;

/**
 * 인터페이스: 뼈대만 제공하는 구조로 생각하자.
 */
public class _02_Interface {
    public static void main(String[] args) {
        Reportable nomalReporter = new NomalReporter();
        nomalReporter.report();

        Reportable videoReporter = new VideoReporter();
        videoReporter.report();
    }
}
