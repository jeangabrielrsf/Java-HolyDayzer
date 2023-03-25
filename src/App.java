import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Holiday> holidays = new ArrayList<>();

        String [][] feriados = {
            {"01/01/2023" , "Confraternização mundial"},
            {"21/02/2023" , "Carnaval"},
            {"17/04/2023" , "Páscoa"},
            {"21/04/2023" , "Tiradentes"},
            {"01/05/2023" , "Dia do trabalho"},
            {"08/06/2023" , "Corpus Christi"},
            {"07/09/2023" , "Independência do Brasil"},
            {"12/10/2023" , "Nossa Senhora Aparecida"},
            {"02/11/2023" , "Finados"},
            {"15/11/2023" , "Proclamação da República"},
            {"25/12/2023" , "Natal"},  
        };
            
        

        for  (int i=0; holidays.size() < 11; i++) {
            String date = feriados[i][0];
            String name = feriados[i][1];
            Holiday holiday = new Holiday(date, name);
            holidays.add(holiday);
        }



        System.out.println("Running app....");

        System.out.println("Digite uma data: ");
        String typedDate = sc.nextLine();
        sc.close();

        for (int i = 0; i < holidays.size(); i++) {
            String date = holidays.get(i).getHoliday(typedDate);
            if (date.length() > 0) {
                System.out.println(date);
                return;
            }

        }

        System.out.println("Não existem feriados com essa data");

        


    }
}
