package forms.registerforms;

public class Validation {

    public boolean validateCharField(String value, int min, int max) {
        return value.length() >= min && value.length() <= max;
    }

    public boolean validateNumber(int value, int min, int max) {
        return value >= min && value <= max;

    }

    public boolean validateIntegerField(Double value, Double min, Double max) {
        return value >= min && value <= max;

    }

    public boolean isEmail(String email) {
        return email.contains("@");
    }

}
