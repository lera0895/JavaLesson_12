import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieAfishaTest {

    MyPosters movie1 = new MyPosters("Poster1","Name1","Genre1",true);
    MyPosters movie2 = new MyPosters("Poster2","Name2","Genre2",true);
    MyPosters movie3 = new MyPosters("Poster3","Name3","Genre3",true);
    MyPosters movie4 = new MyPosters("Poster4","Name4","Genre4",true);
    MyPosters movie5 = new MyPosters("Poster5","Name5","Genre5",true);
    MyPosters movie6 = new MyPosters("Poster6","Name6","Genre6",true);
    MyPosters movie7 = new MyPosters("Poster7","Name7","Genre7",true);
    MyPosters movie8 = new MyPosters("Poster8","Name8","Genre8",true);
    MyPosters movie9 = new MyPosters("Poster9","Name9","Genre9",true);


    @Test
    public  void addMovie (){

        MovieAfisha movieAfisha = new MovieAfisha ();

        movieAfisha.add(movie1);
        movieAfisha.add(movie2);
        movieAfisha.add(movie3);

        MyPosters[] actual = movieAfisha.findall();
        MyPosters[] expected = {movie1, movie2,movie3};

        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public  void LastFind (){

        MovieAfisha movieAfisha = new MovieAfisha (3);

        movieAfisha.add(movie1);
        movieAfisha.add(movie2);
        movieAfisha.add(movie3);
        movieAfisha.add(movie4);
        movieAfisha.add(movie5);
        movieAfisha.add(movie6);

        MyPosters[] actual = movieAfisha.findLast();
        MyPosters[] expected = {movie6,movie5,movie4};

        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public  void moreLimit (){

        MovieAfisha movieAfisha = new MovieAfisha (6);

        movieAfisha.add(movie1);
        movieAfisha.add(movie2);
        movieAfisha.add(movie3);
        movieAfisha.add(movie4);
        movieAfisha.add(movie5);
        movieAfisha.add(movie6);
        movieAfisha.add(movie7);

        MyPosters[] actual = movieAfisha.findLast();
        MyPosters[] expected = {movie7, movie6,movie5,movie4,movie3,movie2};

        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public  void lessLimit (){

        MovieAfisha movieAfisha = new MovieAfisha (8);

        movieAfisha.add(movie1);
        movieAfisha.add(movie2);
        movieAfisha.add(movie3);
        movieAfisha.add(movie4);
        movieAfisha.add(movie5);
        movieAfisha.add(movie6);
        movieAfisha.add(movie7);

        MyPosters[] actual = movieAfisha.findLast();
        MyPosters[] expected = {movie7, movie6,movie5,movie4,movie3,movie2,movie1};

        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public  void Limit (){

        MovieAfisha movieAfisha = new MovieAfisha (9);

        movieAfisha.add(movie1);
        movieAfisha.add(movie2);
        movieAfisha.add(movie3);
        movieAfisha.add(movie4);
        movieAfisha.add(movie5);
        movieAfisha.add(movie6);
        movieAfisha.add(movie7);
        movieAfisha.add(movie8);
        movieAfisha.add(movie9);

        MyPosters[] actual = movieAfisha.findLast();
        MyPosters[] expected = {movie9,movie8,movie7, movie6,movie5,movie4,movie3,movie2,movie1};

        Assertions.assertArrayEquals(expected,actual);
    }



    }
