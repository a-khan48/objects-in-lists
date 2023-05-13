import java.util.ArrayList;
import java.util.Scanner;
public class tvShowMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<tvShow> shows = new ArrayList<>();

        System.out.println("Enter nothing to break the loop.");
        while (true){
            System.out.println("Series Name: ");
            String series = scanner.nextLine();

            if(series.equals(""))
                break;

            System.out.println("Number of episodes: ");
            int episodes = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Series Genre: ");
            String genre = scanner.nextLine();
            shows.add(new tvShow(series, episodes, genre));
        }
        for (tvShow show: shows){
            System.out.println(show.toString());
        }
    }
}
