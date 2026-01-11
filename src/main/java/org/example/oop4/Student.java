package org.example.oop4;

class Student extends Person {
    private final String studentId;
    private final String program;

    public Student(String namn, String epost, String adress, String studentId, String program) {
        super(namn, epost, adress);
        this.studentId = studentId;
        this.program = program;
    }

    @Override
    public String kontaktInfo() {
        return super.kontaktInfo() + "\nStudent-ID: " + studentId + "\nProgram: " + program;
    }

    public String kontaktInfoStudent() {
        return super.kontaktInfo() + "\nStudent-ID: " + studentId + "\nProgram: " + program;
    }
}
