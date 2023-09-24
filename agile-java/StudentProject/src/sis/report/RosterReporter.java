/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sis.report;

import sis.studentinfo.CourseSession;

/**
 *
 * @author emaph
 */
class RosterReporter {
    public static final String NEWLINE = System.getProperty("line.separator");
    public static final String ROSTER_REPORT_HEADER = "Student" + NEWLINE + "----" + NEWLINE;
    public static final String ROSTER_REPORT_FOOTER = NEWLINE + "# students";
    CourseSession session;

    public RosterReporter(CourseSession session) {
        this.session = session;
    }

    public String getReport() {
        StringBuilder buffer = new StringBuilder();
        writeHeader(buffer);
        writeBody(buffer);
        writeFooter(buffer);
        return buffer.toString();
    }

    void writeHeader(StringBuilder buffer) {
       buffer.append(RosterReporter.ROSTER_REPORT_HEADER);
    }

    void writeBody(StringBuilder buffer) {
        for (int i = 0; i < session.getNumberOfStudents(); i++) {
            buffer.append(session.getStudent(i).getName());
            buffer.append(RosterReporter.NEWLINE);
        }
    }

    void writeFooter(StringBuilder buffer) {
        buffer.append(RosterReporter.ROSTER_REPORT_FOOTER);
        buffer.append(session.getNumberOfStudents());
    }

}
