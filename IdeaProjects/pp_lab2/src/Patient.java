//8.	Patient: id, Прізвище, Ім'я, По батькові, Адреса, Телефон, Номер медичної карти, Діагноз.
//        Скласти масив об'єктів. Вивести:
//        a) список пацієнтів, які мають вказаний діагноз;
//        b) список пацієнтів, номер медичної карти у яких знаходиться в заданому інтервалі;
//        c) кількість та список пацієнтів, номер телефону яких починається з вказаної цифри.

public class Patient {
    private int id;
    private String lastName;
    private String firstName;
    private String patronymic;
    private String address;
    private String phoneNumber;
    private int medicalCardNumber;
    private String diagnosis;

    public Patient(int id, String lastName, String firstName, String patronymic, String address, String phoneNumber, int medicalCardNumber, String diagnosis) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.medicalCardNumber = medicalCardNumber;
        this.diagnosis = diagnosis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getMedicalCardNumber() {
        return medicalCardNumber;
    }

    public void setMedicalCardNumber(int medicalCardNumber) {
        this.medicalCardNumber = medicalCardNumber;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Patient" +
                " " + id +
                " " + lastName + " " +
                " " + firstName + " " +
                " " + patronymic + " "+
                ", Адреса: " + address + " " +
                ", Номер телефону: " + phoneNumber + " " +
                ", Номер мед. карти: " + medicalCardNumber +
                ", Діагноз: " + diagnosis + " " +
                ' ';
    }
}