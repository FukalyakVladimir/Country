public class Country {
    private String Name;
    private double Square;
    private double Population;
    private String Capital;
    private double PopulatCapital;
    double Density (){
        return Population/Square;
    }
    public Country(String Name, double Square, double Population, String Capital, double PopulatCapital) {
        this.Name = Name;
        this.Square = Square;
        this.Population = Population;
        this.Capital = Capital;
        this.PopulatCapital = PopulatCapital;
    }

    public Country(String Name, double Square, double Population) {
        this.Name = Name;
        this.Square = Square;
        this.Population = Population;
    }

    public String getName() {
        return Name;
    }

    public double getSquare() {
        return Square;
    }

    public double getPopulation() {
        return Population;
    }

    public String getCapital() {
        return Capital;
    }

    public double getPopulatCapital() {
        return PopulatCapital;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setSquare(double Square) {
        this.Square = Square;
    }

    public void setPopulation(double Population) {
        this.Population = Population;
    }

    public void setCapital(String Capital) {
        this.Capital = Capital;
    }

    public void setPopulatCapital(double PopulatCapital) {
        this.PopulatCapital = PopulatCapital;
    }

    public void setName1(String Name) {
        if (Name != null) {
            this.Name = Name;
        } else {
            System.out.println("Ошибка! Строка с именем не может быть пустой!");
        }
    }

    public void setSquare1(double Square) {
        if (Square == 0.0) {
            System.out.println("Ошибка,площадь не может быть меньше и ровна 0");
        }
    }

    public void setPopulation1(double Population) {
        if (Population > 0 && Population != 0) {
            this.Population = Population;
        } else {
            System.out.println("Ошибка,площадь не может быть меньше и ровна 0");
        }
    }

    public void setCapital1(String Capital) {
        if (Capital != null) {
            this.Capital = Capital;
        } else {
            System.out.println("Ошибка! Строка с именем не может быть пустой!");
        }
    }

    public void setPopulatCapital1(double PopulatCapital) {
        if (PopulatCapital > 0 && PopulatCapital != 0) {
            this.PopulatCapital = PopulatCapital;
        } else {
            System.out.println("Ошибка,площадь не может быть меньше и ровна 0");
        }
    }

    public class Main {
        public static void main(String[] args) {

          double Density1, Density2,Density3,Density4;

            Country Russia = new Country("Russia", 17.1, 145.7, "Moscow", 12.6);
            String RussiaName = Russia.getName();
            double RussiaSquare = Russia.getSquare();
            double RussiaPopulation = Russia.getPopulation();
            String RussiaCapital = Russia.getCapital();
            double RussiaPopulatCapital = Russia.getPopulatCapital();
            Russia.setSquare(3);
            // не делает исключение на 0


            System.out.println(" Название страны - " + Russia.Name + ", площать страны " + Russia.Square + "млн кв. км., население -  "
                    + Russia.Population + "млн ч., Название столицы " + Russia.Capital + ", население столицы - " + Russia.PopulatCapital + "млн чел.");
            Country Finland = new Country("Finland", 338, 5.5, "Helsinki", 655);
            System.out.println(" Название страны - " + Finland.Name + ", площать страны " + Finland.Square + "тыс кв. км., население -  "
                    + Finland.Population + "млн ч., Название столицы " + Finland.Capital + ", население столицы - " + Finland.PopulatCapital + "тыс чел.");
            Country France = new Country("France", 643.8, 67.8, "Paris", 2.1);
            System.out.println(" Название страны - " + France.Name + ", площать страны " + France.Square + "тыс кв. км., население -  "
                    + France.Population + "млн ч., Название столицы " + France.Capital + ", население столицы - " + France.PopulatCapital + "млн чел.");
            Country Andorra = new Country("Andora", 467, 85.4, "Andorra la Vella", 22.6);
            System.out.println(" Название страны - " + Andorra.Name + ", площать страны " + Andorra.Square + "кв.км., население -  "
                    + Andorra.Population + "тыс. ч., Название столицы " + Andorra.Capital + ", население столицы - " + Andorra.PopulatCapital + "тыс. чел.");
            Country Singapore = new Country("Singapore", 725, 5.7);
            System.out.println(" Название страны - " + Singapore.Name + ", площать страны " + Singapore.Square + "кв.км., население -  "
                    + Singapore.Population + "млн. ч.");

            Density1= Russia.Density();
            System.out.println(Density1);
            Density1= Finland.Density();
            // изменить значение мил. и тыс.
            System.out.println(Density1);
        }

    }
}

