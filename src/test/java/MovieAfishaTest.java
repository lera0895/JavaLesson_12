import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieAfishaTest {

    @Test
    public  void addMovie (){
        MovieAfisha movieAfisha = new MovieAfisha ();

        movieAfisha.add("Movie 1");
        movieAfisha.add("Movie 2");
        movieAfisha.add("Movie 3");

        String[] actual = movieAfisha.findAll();
        String[] expected = {"Movie 1", "Movie 2","Movie 3"};

        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void Last (){
        MovieAfisha movieAfisha = new MovieAfisha ();


        movieAfisha.add("Movie 3");
        movieAfisha.findLast();

        String[] actual = movieAfisha.findLast();
        String[] expected = {"Movie 3"};

        Assertions.assertArrayEquals(expected,actual);

    }
}
