
public class Main {
    public static void main(String[] args) {

        Patient[] patients = new Patient[3];
        patients[0] = new Patient(1, "Мінтус", "Станіслав", "Сергійович", "Київ, вул. Центральна, 1", "1234567890", 1001, "Грип");
        patients[1] = new Patient(2, "Нечиталюк", "Юлія", "Василівна", "Львів, вул. Західна, 10", "9876543210", 1002, "Запалення горла");
        patients[2] = new Patient(3, "Кудря", "Олексій", "Вікторович", "Одеса, вул. Морська, 5", "5556667777", 1003, "Ангіна");

        // Вивести список пацієнтів з діагнозом "Грип"
        listPatientsByDiagnosis(patients, "Грип");

        // Вивести список пацієнтів з номером медичної карти в інтервалі від 1001 до 1003
        listPatientsByMedicalCardNumber(patients, 1000, 1002);

        // Вивести кількість та список пацієнтів, номер телефону яких починається з вказаної цифри (наприклад, "5")
        listPatientsByPhoneNumberPrefix(patients, "5");
    }

    //метод для виведення пацієнтів з певним діагнозом
    public static void listPatientsByDiagnosis(Patient[] patients, String diagnosis) {
        System.out.println("Список пацієнтів з діагнозом '" + diagnosis + "':");
        for (Patient patient : patients) {
            String patientDiagnosis = patient.getDiagnosis();
            if (patientDiagnosis != null && patientDiagnosis.equals(diagnosis)) {
                System.out.println(patient);
            }
        }
    }

    //метод для виведення пацієнтів з номером медичної карти в заданому інтервалі
    public static void listPatientsByMedicalCardNumber(Patient[] patients, int min, int max) {
        System.out.println("Список пацієнтів з номерами медичних карт в інтервалі від " + min + " до " + max + ":");
        for (Patient patient : patients) {
            int medicalCardNumber = patient.getMedicalCardNumber();
            if (medicalCardNumber >= min && medicalCardNumber <= max) {
                System.out.println(patient);
            }
        }
    }

    //метод для виведення пацієнтів, номер телефону яких починається з вказаної цифри
    public static void listPatientsByPhoneNumberPrefix(Patient[] patients, String prefix) {
        System.out.println("Список пацієнтів, номер телефону яких починається з цифри '" + prefix + "':");
        for (Patient patient : patients) {
            String phoneNumber = patient.getPhoneNumber();
            if (phoneNumber.startsWith(prefix)) {
                System.out.println(patient);
            }
        }
    }
}
