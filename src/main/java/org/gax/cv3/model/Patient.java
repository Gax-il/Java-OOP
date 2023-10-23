package org.gax.cv3.model;

import java.util.Objects;

public class Patient {
    private String Name;
    private String Surname;

    private int Year;

    public Patient(String name, String surname, int year) {
        Name = name;
        Surname = surname;
        Year = year;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    @Override
    public String toString() {
        return String.format("Pacient jmenem %s a prijmenim %s se narodil v roce %d",Name, Surname, Year);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Year == patient.Year && Objects.equals(Name, patient.Name) && Objects.equals(Surname, patient.Surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Surname, Year);
    }
}
