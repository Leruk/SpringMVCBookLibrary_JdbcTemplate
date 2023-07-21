package org.leruk.spring.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Person {
    private int id;

    @NotEmpty(message = "Full name can't be empty")
    @Size(min = 2, max = 100, message="Full name should be between 2 and 100 characters")
    private String fullName;

    @Min(value=1900, message = "Year of birth should be greater 1900")
    private int yearOfBirth;

    public Person() {

    }

    public Person(String fullName, int yearOfBirth)
    {
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
