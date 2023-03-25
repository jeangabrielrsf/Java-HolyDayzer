public class Holiday {
    private String date;
    private String name;

    Holiday(String date, String name) {
        this.date = date;
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public String getHoliday(String date) {
        if (date.equals(this.date)) {
            return this.name;
        } else {
            return "";
        }
    }
}
