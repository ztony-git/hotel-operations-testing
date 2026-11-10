package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    void punchIn_WorkedFrom8To16_HoursWorkedIs8() {
        Employee employee = new Employee(1, "TZ", "CS", 23);
        double startTime = 8;
        double endTime = 16;

        employee.punchIn(startTime);
        employee.punchOut(endTime);

        double hoursWorked = employee.getHoursWorked();
        double expectedHoursWorked = 8;

        assertEquals(expectedHoursWorked, hoursWorked);
    }
}